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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class countTriplets {

  
//    So here we need to find triplets in GP, i<j<k (i,j,k)
//    Now if we take a,ar, ar^2...the O(n^3)...UNFEASIBLE
//    Thus we need to consider a/r,a,ar
//    Now "a" can be assigned to the elements and track can be kept on elements smaller than or greater than it via maps.
//    Lesser would be in LeftMap Greater in RightMap 
//    Initially in RMAP keep count of all
//    Progressively decrease from RMAP on use of an element 
//    ADD TO LMAP AND KEEP COUNTS
//    SO WITH THE COUNTS u can even establish how many triplets can be established for a particular mid value...ie. a/r count in LMAP * (a*r) count in RMAP
//    update count everytime and return
    private static long countTriplets(List<Long> arr, long r){
//        CREATE LMAP
        Map<Long,Long> leftMap = new HashMap<>();
//        CREATE RMAP
        Map<Long,Long> rightMap = new HashMap<>();
//      So creating the RMAP with the full array ... IF an elem already there else start with 0
        for(long item:arr){
            rightMap.put(item,rightMap.getOrDefault(item, 0L)+1);
        }
//        counter to hold no. of triplets
        long count = 0;
        
//      Traverse the array elem by elem
        for(int i=0;i<arr.size();i++){
//          the current elem is set as the midterm
            long midTerm = arr.get(i);
//            c1 is the count of the element to be exactly divisible by r in LMAP
//            c3 is the count of the element to be exactly multiplied by r in RMAP
            long c1=0,c3=0;
//          decrease the midTerm that is a from RMAP
            rightMap.put(midTerm,rightMap.getOrDefault(midTerm, 0L) - 1);
//            if LMAP contains the midTerm/r get the counts of that LMAP element 
            if(leftMap.containsKey(midTerm/r) && midTerm % r == 0){
                
                c1 = leftMap.get(midTerm / r);
                
                
            }
//            if RMAP contains the midTerm * r get the counts of that RMAP element 

            if(rightMap.containsKey(midTerm * r)){
                
                c3 = rightMap.get(midTerm * r);
                
                
            }
            
          count += c1 * c3;
//        Make leftMap populated with the current midTerm by inc 1
          leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

            
        }
        
        
        return count;
        
    }
    
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long r = sc.nextLong();
		List<Long> arr = new ArrayList<>();
		while (n-- > 0) {
			arr.add(sc.nextLong());
		}

		long ans = countTriplets(arr, r);
		System.out.println(ans);

		sc.close();
	}
    
}
