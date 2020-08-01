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
import hackerrank.Person;
import hackerrank.Person_details;
import java.util.Scanner;
class Lecturer extends Person implements Person_details
{
    String subject;
    Lecturer(String n)
    {
        super(n);
        subject=""; 
    }
    void getSubject(String s)
    {
        subject=s;
    }
    @Override
    public String getDetails()
    {
        super.see();
        return subject;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        String n=sc.nextLine();
        Lecturer p3=new Lecturer(n);
        System.out.println("Enter subject: ");
        String s=sc.nextLine();
        p3.getSubject(s);
        System.out.println("The subject is "+p3.getDetails());
        
    }
}
