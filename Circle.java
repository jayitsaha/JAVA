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
public class Circle {
    
    static double radius;
    
    Circle(double radius){
        
        Circle.radius = radius;
        
    }
    
        static double getdata()
    {
	return radius;
    }
    
    
    static double area()
    {
	return (Math.PI * radius * radius);
    }
    
    
    
    
     public static void main(String args[]) 
    {   
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();

        Circle c1 = new Circle(rad);
      
        System.out.println("RADIUS: "+c1.getdata());
        System.out.println("AREA: "+c1.area());

      
    }
    
    
    
    
}
