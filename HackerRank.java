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

public class HackerRank {

    /**
     * @param args the command line arguments
     */
    
    
    static int jumpingOnClouds(int[] c){
        
        int length = c.length;
        int count = -1;
        for(int i=0;i<length;){
            
            if(i+2<length && c[i+2] == 0){
                
                i = i+2;
                
            }
            else{
                
                i++;
            }
            
            count++;
        }
        
        return count;
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int c[] = new int[n];
//        for(int i=0;i<n;i++){
//            c[i] = sc.nextInt();
//        }
//        
//        int ans = jumpingOnClouds(c);
//	System.out.println(ans);
//	sc.close();
//    }
    
}
