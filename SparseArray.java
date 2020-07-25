/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jayit
 */
//Simple Program match the strings in String arr with the query strings

public class SparseArray {
    
    static int[] matchingStrings(String[] strings,String[] queries){
//            Create a Map which will contain the freq table of all the string in String array
            Map<String,Integer> map = new HashMap<>();
            int results[] = new int[queries.length];
            
            for(int i=0;i<strings.length;i++){
                
                String inputString = strings[i];
//                if already there,get curr count  then +1
                if(map.containsKey((inputString))){
                    
                    map.put(inputString, map.get(inputString)+1);
                    
                }
//                else create with count 1
                else{
                    
                    map.put(inputString, 1);
                }
            }
//            Read from map table wrt to queries, append in a an array

            for(int i=0;i<queries.length;i++){
                
                String queryString = queries[i];
                if(map.containsKey(queryString)){
                    
                    results[i] = map.get(queryString);
                }
            }
            
            
            
            return results;
            
   }
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStrings = sc.nextInt();

		String str[] = new String[noOfStrings];

		for (int i = 0; i < noOfStrings; i++) {
			str[i] = sc.next();
		}
		int queries = sc.nextInt();
		String strQ[] = new String[queries];

		for (int i = 0; i < queries; i++) {
			strQ[i] = sc.next();
		}
		int[] counter = matchingStrings(str, strQ);
		System.out.println(Arrays.toString(counter));
		sc.close();
	}
    
}
