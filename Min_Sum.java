
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	 	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in); 
		    int n;
		    n= sc.nextInt();
		    int arr[]= new int[n];
		    for (int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
			int sum = 0, min_sum = Integer.MAX_VALUE;
			for (int i=0;i<n;i++) {
				sum=sum+arr[i];
				min_sum = Math.min(min_sum, sum);
			
			}
				System.out.println(min_sum);
		}
}
