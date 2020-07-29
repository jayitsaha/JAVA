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




import java.io.*;
class FutureDate
{
public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter the date in (dd/mm/yyyy) format: ");
        String date=br.readLine().trim();
        int p,q,count=0;
        p=date.indexOf("/");
        int d=Integer.parseInt(date.substring(0,p));
        q=date.lastIndexOf("/");
        int m=Integer.parseInt(date.substring(p+1,q));
        int y=Integer.parseInt(date.substring(q+1));
        System.out.println("Entered Date: "+date);
 
        if((y%400==0) || ((y%100!=0)&&(y%4==0))) // Checking for leap year
        month[2]=29;
 
        if(m<0 || m>12 || d<0 || d>month[m] || y<0 || y>9999) // Performing Date Validation
        {
            System.out.println("Invalid Date");
        }
        else
        {
            System.out.print("Enter number of days after which future date is to be found: ");
            int days=Integer.parseInt(br.readLine());
            while(count<days)
            {
                d++;
                count++;
                 
                /* If day exceeds the maximum days of a month then day should start from 1
                   and month should increase */
 
                if(d>month[m])
                {
                    d=1;
                    m++;
                }
                 
                /* If month exceeds 12 then month should start from 1
                   and year should increase */
                if(m>12)
                {
                    m=1;
                    y++;
                    if((y%400==0) || ((y%100!=0)&&(y%4==0)))
                        month[2]=29;
                    else
                        month[2]=28;
                }
            }
            System.out.println("Future Date : "+d+"/"+m+"/"+y);
        }
    }
}
