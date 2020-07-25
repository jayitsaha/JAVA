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

public class RationalNumber
{
   private int numerator, denominator;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the rational number by ensuring a nonzero
   //  denominator and making only the numerator signed.
   //-----------------------------------------------------------------
   public RationalNumber (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
         numer = numer * -1;
         denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;

      reduce();
   }

   //-----------------------------------------------------------------
   //  Returns the numerator of this rational number.
   //-----------------------------------------------------------------
   public int getNumerator ()
   {
      return numerator;
   }

   //-----------------------------------------------------------------
   //  Returns the denominator of this rational number.
   //-----------------------------------------------------------------
   public int getDenominator ()
   {
      return denominator;
   }

   //-----------------------------------------------------------------
   //  Returns the reciprocal of this rational number.
   //-----------------------------------------------------------------
   public RationalNumber reciprocal ()
   {
      return new RationalNumber (denominator, numerator);
   }

   //-----------------------------------------------------------------
   //  Adds this rational number to the one passed as a parameter.
   //  A common denominator is found by multiplying the individual
   //  denominators.
   //-----------------------------------------------------------------
   public RationalNumber add (RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int sum = numerator1 + numerator2;

      return new RationalNumber (sum, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Subtracts the rational number passed as a parameter from this
   //  rational number.
   //-----------------------------------------------------------------
   public RationalNumber subtract (RationalNumber op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int difference = numerator1 - numerator2;

      return new RationalNumber (difference, commonDenominator);
   }

   //-----------------------------------------------------------------
   //  Multiplies this rational number by the one passed as a
   //  parameter.
   //-----------------------------------------------------------------
   public RationalNumber multiply (RationalNumber op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();

      return new RationalNumber (numer, denom);
   }

   //-----------------------------------------------------------------
   //  Divides this rational number by the one passed as a parameter
   //  by multiplying by the reciprocal of the second rational.
   //-----------------------------------------------------------------
   public RationalNumber divide (RationalNumber op2)
   {
      return multiply (op2.reciprocal());
   }

   //-----------------------------------------------------------------
   //  Determines if this rational number is equal to the one passed
   //  as a parameter.  Assumes they are both reduced.
   //-----------------------------------------------------------------
   public boolean equals (RationalNumber op2)
   {
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }

   //-----------------------------------------------------------------
   //  Returns this rational number as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;
    
      return result;
   }
   
      public double toDouble()
   {
      double result;

      if (numerator == 0)
         result = 0;
      else
         if (denominator == 1)
            result = numerator ;
         else
            result = (double)numerator / denominator;
    
      return result;
   }

   //-----------------------------------------------------------------
   //  Reduces this rational number by dividing both the numerator
   //  and the denominator by their greatest common divisor.
   //-----------------------------------------------------------------
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   //-----------------------------------------------------------------
   //  Computes and returns the greatest common divisor of the two
   //  positive parameters. Uses Euclid's algorithm.
   //-----------------------------------------------------------------
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
   
   
   public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("ENTER NUMERATOR OF NUM1");
                int num1 = sc.nextInt();
                System.out.println("ENTER DENOMINATOR OF NUM1");
                int denom1 = sc.nextInt();
                System.out.println("ENTER NUMERATOR OF NUM2");
                int num2 = sc.nextInt();
                System.out.println("ENTER DENOMINATOR OF NUM2");
                int denom2 = sc.nextInt();
                
                
                RationalNumber r1 = new RationalNumber(num1,denom1);
                RationalNumber r2 = new RationalNumber(num2,denom2);
                
                
                RationalNumber r3 = r1.add(r2);
                String result_num3 = r3.toString();

                System.out.println("ADDITION OF NUM1 & NUM2 = "+result_num3);
                
                
                RationalNumber r4 = r1.multiply(r2);
                String result_num4 = r4.toString();

                System.out.println("MULTIPLICATION OF NUM1 & NUM2 = "+result_num4);
                
                String result_num1 = r1.toString();
                String result_num2 = r2.toString();
                double result_double1 = r1.toDouble();
                double result_double2 = r2.toDouble();
                
                
                System.out.println("NUM1 in DOUBLE VALUE = "+result_double1);
                System.out.println("NUM2 in DOUBLE VALUE  = "+result_double2);

		System.out.println("THE REDUCED FORM OF NUM1 = "+result_num1);
                System.out.println("THE REDUCED FORM OF NUM2 = "+result_num2);

		sc.close();
	}
}




