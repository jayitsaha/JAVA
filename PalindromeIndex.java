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

public class PalindromeIndex {
    
    
    static int PalindromeIndex(String s) {
//        Here we take the string and initialize the palindromeIndex as -1 bcoz if pal, then ret -1
        int palindromeIndex= -1;
//        Find length of string
        int len = s.length();
        
//        traverse half the string, other half can be parallely found out by len - i -1
        for(int i=0;i<len/2;i++){
//            if the char at i and len - 1 - i is not eq, they both have probability of being the odd one out
            if(s.charAt(i) != s.charAt(len - 1 - i)){
//                check whether this is the last element or not
                if(i+1 < len){
//                    now start with the ith index as the entity to be removed, so the remainder unchecked string from i+1 to len - i should be a palidrome ,
//                    if thta is true return ith posn else return len - i -1th posn as that must be the odd one out
                    boolean isRightStringValidPalindrome = isValidPalindrome(s.substring(i+1,len-i));
                    if(isRightStringValidPalindrome) 
                        return i;
                    return len - 1 -i;
                
                }
            }
            
            
            
        }
        
        return palindromeIndex; 
	}
    
   public static boolean isValidPalindrome(String str){
       
       int len = str.length();
       
       for(int i= 0; i<len/2;i++){
           if(str.charAt(i) != str.charAt(len -1 -i)){
               return false;
           }
       }
       return true;
   }
    
    
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			int result = PalindromeIndex(s);
			System.out.println(result);

		}
		in.close();
	}


    
    
    
    
}

    
