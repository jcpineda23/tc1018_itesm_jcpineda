package com.jcp.hr.arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
        int width = 2;
        int height = 2;

        int maxSum = Integer.MIN_VALUE; 
        int tmpSum = 0;


        for (int i =0; i < arr.length -2; i++) {
               	for(int j =0; j < arr.length -2; j++ ) {
               		tmpSum = arr[i][j] + arr[i][j + 1] + arr[i][j + width] + arr[i + 1][j +1] + 
                   				arr[i+height][j] + arr[i+height][j+ 1] + arr[i +height][j + width];
               		if(tmpSum > maxSum)
               			maxSum = tmpSum;
               	}
       }
        
       return maxSum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
        
        int [][] arr2 = { {-1 ,-1, 0, -9, -2, -2}, 
        				  {-2, -1, -6, -8, -2, -5},
        				  {-1, -1, -1, -2, -3, -4},
        				  {-1, -9, -2, -4, -4, -5},
        				  {-7, -3, -3, -2, -9, -9},
        				  {-1, -3, -1, -2, -4, -5} };
        
    int result = hourglassSum(arr2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        System.out.println(result);
        scanner.close();
    }
}
