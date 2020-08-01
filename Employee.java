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
class Employee extends Person implements Person_details
{
    String department;
    Employee(String n)
    {
        super(n);
        department=""; 
    }
    void getDepartment(String s)
    {
        department=s;
    }
    @Override
    public String getDetails()
    {
        super.see();
        return department;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        String n=sc.nextLine();
        Employee p2=new Employee(n);
        System.out.println("Enter department: ");
        String d=sc.nextLine();
        p2.getDepartment(d);
        System.out.println("The department is "+p2.getDetails());
        
    }
}
