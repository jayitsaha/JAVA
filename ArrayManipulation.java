/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Jayit
 */
import java.util.Scanner;
//Apply Prefix algo
//Just make the first element as the required value and the last index of range+1 as - value
//n+2 spaces is required as we keep the 0th elem 0, and start the process from 1th index
//the prefix algo incremenets the last+1 index ..thus 2 extra spaces
//one more challenge is that prefix algo runs till last elem
//to keep in range, we make the last range + 1th index neative of the k val
//thus while implemeting prefix algo , the sum stops after the last index
//making the next of the last index 0, and all the further index values 0
//prefix algo states that the current elems val is the prev elems val+curr elems val
public class ArrayManipulation {
    
    
    static long ArrayManipulation(int n,int[][] queries){
        
        long outputArray[] = new long[n+2];
        
        for(int i=0;i<n;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            
            outputArray[a] += k;
            outputArray[b+1] -= k;

            

        }
        
        
        long max = getMax(outputArray);
        return max;
    }
    
    
    private static long getMax(long[] inputArray){
        
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<inputArray.length;i++){
            
            sum+=inputArray[i];
            max = Math.max(max, sum);
            
             
            
        }
        
        return max;
        
    }
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int queries[][] = new int[m][3];

		for (int i = 0; i < m; i++) {
			queries[i][0] = sc.nextInt();
			queries[i][1] = sc.nextInt();
			queries[i][2] = sc.nextInt();
		}
		long max = ArrayManipulation(n, queries);
		System.out.println(max);
		sc.close();
                
	}
    
}
