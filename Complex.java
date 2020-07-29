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
public class Complex {
    private double real, complex;
    public Complex(double r, double c) {
        real = r;
        complex = c;
    }
    public Complex add(Complex c2){
        double a = real + c2.real;
        double b = complex + c2.complex;
        return new Complex(a,b);
    }
    public Complex subtract(Complex c2){
        double a = real - c2.real;
        double b = complex - c2.complex;
        return new Complex(a,b);
    }
    public Complex mul(Complex c2){
        double a = (real * c2.real) - (complex*c2.complex);
        double b = (real * c2.complex) + (complex*c2.real);
        return new Complex(a,b);
    }
    public Complex divide(Complex c2){
        Complex newC = new Complex(c2.real, -c2.complex);
        Complex test = this.mul(newC);
        double k = (c2.real*c2.real) + (c2.complex*c2.complex);
        double newReal = test.real/k;
        double newComplex = test.complex/k;
        return new Complex(newReal,newComplex);
    }
    
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter real part of num 1");
                double real1 = sc.nextDouble();
                System.out.println("Enter complex part of num 1");
                double complex1 = sc.nextDouble();
                Complex c1 = new Complex(real1, complex1);
                System.out.println("Enter real part of num 2");
                double real2 = sc.nextDouble();
                System.out.println("Enter complex part of num 2");
                double complex2 = sc.nextDouble();
                Complex c2 = new Complex(real2, complex2);
                System.out.println("Addition");
                Complex c3 = c1.add(c2);
                System.out.println(c3.real + "+" + c3.complex + "i");
                System.out.println("Subtraction");
                Complex c4 = c1.subtract(c2);
                System.out.println(c4.real + "+" + c4.complex + "i");
                System.out.println("Multiplication");
                Complex c5 = c1.mul(c2);
                System.out.println(c5.real + "+" + c5.complex + "i");
                System.out.println("Division");
                Complex c6 = c1.divide(c2);
                System.out.println(c6.real + "+"+ c6.complex + "i");


                
}


}