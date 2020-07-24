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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TripleSum {
//    this is the main func to process the triplet count
    static long triplets(int[] a, int[] b, int[] c){
//       initualize the counter
        long distinctTripletCount = 0;
//        remove duplicates from the arrays using set and HashMap Method
        int[] distinctA = removeDuplicate(a);
        int[] distinctB = removeDuplicate(b);
        int[] distinctC = removeDuplicate(c);

//      then sort the array so that it's easy to compare b array with a and c, as we need the numbers lesser than the values of b         
     
        Arrays.sort(distinctA);
        Arrays.sort(distinctB);
        Arrays.sort(distinctC);
        
// now the main part is to use forEach loop,
//for each of the items in array B, we need to use it as a key
//and then apply binary search on the arrays A and C to
//see where the binary search stops and returns
//add 1 to the value, 
        
                for (int q : distinctB) {
			long c1 = getValidIndex(distinctA, q) + 1;
			long c3 = getValidIndex(distinctC, q) + 1;
//                        total + no. of possible from a*no. of possible from c
			distinctTripletCount += c1 * c3;
		}

		return distinctTripletCount;
    }
    
    
    
    private static int[] removeDuplicate(int[] a){
        
//        Use a Set to just feed in the array 
//        A set has unique elements
//        Then output the set into an array and return it

        Set<Integer> set = new HashSet<>();
        for(int item:a){
            
            set.add(item);
            
        }
        
        int len = set.size();
        
        int results[] = new int[len];
        int i=0;
        for(int item:set){
            
            results[i++] = item;
        }

        return results;


    }
    
    
    static int getValidIndex(int[] distinctA, int key){
        
//        arg1 -> array A or C , key->iterate over every value of b
//        Implement Binary Search

          int low = 0;
          int high = distinctA.length - 1;
          int count = -1;
          
          while(low<=high){
              
              int mid = (low+high)/2;
//            This means that we need to increase low as the key is
//            probably on the rt of low
              if(distinctA[mid]<=key){  
                  count = mid;
                  low = mid+1;
                  
              }
              
              else{
                  high = mid -1;
              }
              
          }
          
        return count;
        
    }
    
    
    
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lena = sc.nextInt();
		int lenb = sc.nextInt();
		int lenc = sc.nextInt();

		int a[] = new int[lena];
		int b[] = new int[lenb];
		int c[] = new int[lenc];

		for (int i = 0; i < lena; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < lenb; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < lenc; i++) {
			c[i] = sc.nextInt();
		}

		long result = triplets(a, b, c);
		System.out.println(result);
		sc.close();
	}
    
    
}
