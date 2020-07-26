/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jayit
 */
public class LeftRotation {
   
// Here it is required to left rotate the array by one place,
//but it is noticed that right rotation is more feasible
//By analyzing 1 left rotation means total length of array - no of right rotations
//That is one right rotation is n - d
//now we right rotate by that amt
//make a rotArray same length as passed array
//we cal the newIndex as (oldIndex + n - d) % n;
// % modulo so that it doesnt exceed thae array length at all
// Now newIndex in the rotArray would contain value of the oldIndex value of parent array
// Finally return rotArray
    static int[] rotLeft(int[] a, int d){
        
        int n = a.length;
        int[] rotArray = new int[n];
        
        for(int oldIndex=0 ; oldIndex < n  ; oldIndex++){
            
            int newIndex = (oldIndex + n - d) % n;
            rotArray[newIndex] = a[oldIndex];
        }
        return rotArray;
    }
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int d = sc.nextInt();
		int a[] = new int[arraySize];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int res[] = rotLeft(a, d);
		System.out.println(Arrays.toString(res));
		sc.close();
	}
    
}
