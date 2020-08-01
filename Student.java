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
import hackerrank.Person_details;
import hackerrank.Person;

import java.util.Scanner;
public class Student extends Person implements Person_details
{
    String name;
    String grade;
    Student(String n)
    {
        super(n);
        grade=""; 
    }
    public void getGrade(String g)
    {
        grade=g;
    }
    
    @Override
    public String getDetails()
    {
        super.see();
        return grade;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        String n=sc.nextLine();
        Student p1=new Student(n);
        System.out.println("Enter grade: ");
        String g=sc.nextLine();
        p1.getGrade(g);
        System.out.println("The grade is "+p1.getDetails());
        
    }
}
