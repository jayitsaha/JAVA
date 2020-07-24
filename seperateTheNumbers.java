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

public class seperateTheNumbers {
    
    
    static void seperateTheNumbers(String s){
//      init an empty substring #for every query 
        String substring = "";
//        length...
        int length = s.length();
//      init the validty checker
        boolean isValid = false;
//        traverse the string only till half of the capacity
//        if we go beyond we will have a string greater than the
//        given string, thus not suitable
        for(int i=1;i<= length/2;i++){
//          now substrings is to be reinit with the possibilities
//          of the string being 1 dig, 2 dig.... length/2 - 1 dig sequence 
            substring = s.substring(0,i);
//            Parse it to get the numerical exp of the string literal
            Long num = Long.parseLong(substring);
//          now init a temp var with the substring, that is the first term

            String validString = substring;
//          while the valid String doesnt exceeds the max length, keep on incrementing 
//          the parsed number by 1 as per qn and append to string

            while(validString.length() < s.length()){
                
                validString += Long.toString(++num);
                
            }
    //          check if validString equals s then its valid ..print
            if(s.equals(validString)){
                    isValid = true;
                    break;
                }
            
            
        }
        
        System.out.println(isValid?"YES "+substring:"NO");
        
    } 
    
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			String s = sc.next();
			seperateTheNumbers(s);
		}
		sc.close();
	}
    
}
