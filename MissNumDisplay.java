// Given an array arr[] of size N-1 with integers in the range of 
// [1, N], the task is to find the missing number from the first N integers.
// Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
// Output: 5
// Explanation: The missing number between 1 to 8 is 5

import java.util.*;

public class MissNumDisplay {
    
    public static int sum(int[] arr, int n) {
        int sumNum = 0;
        for(int i = 0; i < n; i++) {
            sumNum += arr[i];
        }
        return sumNum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int arr2[] = new int[n];
        for(int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arr2[i] = i+1;
        }
        
    
        int res1 = sum(arr, n-1);
        System.out.println(res1);
        
        // int res2 = sum(arr2, n);
        // System.out.println(res2);
        
        int res2 = (n*(n+1))/2;
        System.out.println(res2);
        
        int finalRes = res2 - res1;
        System.out.println(finalRes);
    }
}