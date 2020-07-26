/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jayit
 */
public class MinimumDistances {
    
//    Create  a hash map with key as the value in the particular position of the array
//    Value of the particular key will be th index
//    if the index already exists, then we update the table with the current index
//    the minimum dist is calc by seeing whether the minDist US SMALLER OR THE DIFFERENCE BETWEEN THE 
//    PREVINDEX AND THE CURRENT INDEX OF THE PARTICUALAR ELEMENT. update THE min  
    static int minimumDistances(int[] a){
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int minDistance = Integer.MAX_VALUE, prevIndex = 0,currentIndex = 0;
        
        for(int i=0;i<a.length;i++){
            
            
            if(hmap.containsKey(a[i])){
                
                  currentIndex = i;
                  prevIndex = hmap.get(a[i]);
                  minDistance = Math.min((currentIndex - prevIndex),minDistance);
                  
                
            }
            
            hmap.put(a[i], i);
        }
        
        return (minDistance == Integer.MAX_VALUE? -1 :minDistance);
        
        
        
    }
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(minimumDistances(a));
		sc.close();
	}
    
    
}
