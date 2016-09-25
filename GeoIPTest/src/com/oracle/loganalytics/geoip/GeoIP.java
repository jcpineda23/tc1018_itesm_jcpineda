package com.oracle.loganalytics.geoip;

import java.io.InputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.zip.GZIPInputStream;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.AddressNotFoundException;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.Location;

public class GeoIP {
	
	private static DatabaseReader cityDatabase;
    private static DatabaseReader ispDatabase;
	
	private static synchronized void openDatabases() throws IOException
	{
		
		if(ispDatabase == null)
		{
			ispDatabase = openDatabase(GeoIP.class.getClassLoader().getResourceAsStream("GeoIP2-ISP.mmdb.gz"));
		}
			
		if (cityDatabase == null)
        {
            cityDatabase = openDatabase(GeoIP.class.getClassLoader().getResourceAsStream("GeoLite2-City.mmdb.gz"));
        }	
		
	}
	
	private static DatabaseReader getCityDatabase() throws IOException
    {
        if (cityDatabase == null)
        {
            openDatabases();
        }

        return cityDatabase;
    }
	
	public static String getCityName(InetAddress ip) throws IOException, GeoIp2Exception
    {
        try
        {
        	CityResponse myCity = getCityDatabase().city(ip);
        	myCity.getClass();
            return getCityDatabase().city(ip).getCity().getName();
        }
        catch (AddressNotFoundException e)
        {
            return null;
        }
    }
	
	
    private static DatabaseReader openDatabase(InputStream is) throws IOException
	    {
	        GZIPInputStream stream = new GZIPInputStream(is);
	        return new DatabaseReader.Builder(stream).build();
	    }
	

}
