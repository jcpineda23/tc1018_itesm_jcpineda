package mx.itesm.te1018.search;

public class BinarySearch {

	public int linearSearch(int[] arr, int n) {
		int i = -1;
		for(i = 0; i < arr.length; i++) {
			if(n == arr[i])
				break;
			
		}
			
		return i;
	}
	
	public static int binarySearch(int[] arr,int start, int end, int x ) {
		
		int middle = (int) Math.floor((end + start)/2);
		
		if(arr[middle] == x) {
			return middle;			
		}
		else {
			if(arr[middle] > x) { //Going left
				///MAGIC FUNCTION
				return binarySearch(arr, 0, middle, x);
			}
			else if(arr[middle] < x) //Go right
			{
				///MAGIC FUNCTION
				return binarySearch(arr, middle +1, end, x);
			}
		}
		return -1;
	}
	
	public static void main (String[] args) {
		
		int[] myArray = {1, 2, 4, 6, 8, 10, 12, 14, 16 , 17, 18, 33};
		
		System.out.println("Found at: " + 
						binarySearch(myArray, 0, myArray.length, 2));
		
	}
	
}
