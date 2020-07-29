/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jayit
 */
public class Box {
    
    
    static double width;
    static double length;
    static double height;

    
    Box(double length, double width,  double height){
        
        Box.width = width;
        Box.length = length;
        Box.height = height;

        
    }
    
        static void getdata()
    {
        
        System.out.println("LENGTH: "+length+ " BREADTH: "+width+ " HEIGHT: "+ height);
      

    }
    
    
    static double volume()
    {
	return (length * width * height);
    }
    
    
    
    
     public static void main(String args[]) 
    {   
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length:");
      double len= s.nextDouble();
      System.out.println("Enter the breadth:");
      double wid= s.nextDouble();
      System.out.println("Enter the height:");
      double ht= s.nextDouble();
  
      
        Box b1 = new Box(len , wid , ht);
      
        b1.getdata();
        System.out.println("VOLUME: "+b1.volume());

      
    }
    
    
    
}
