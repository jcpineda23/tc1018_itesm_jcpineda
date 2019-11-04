package com.jcp.hr.basic;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WarmUpChallenges {
	
	public static int sockMerchant(int numOfSocks, int[] colors) {
		int pairs = 0;
		  for(int i = 0; i < numOfSocks; i++) {
			  if(colors[i] < 0)
				  continue;
			  for(int j = i + 1; j < numOfSocks; j++) {
				  if(colors[i] > 0 && colors[i] == colors[j]) {
					  pairs++;
					  colors[i] = colors[j] = -1;
				  }
				  
			  }
		  }
		  
		  
		  return pairs;
		
	}
	

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\jupined\\output.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
