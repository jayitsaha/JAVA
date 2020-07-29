
package hackerrank;


 /**
 *
 * @author Jayit
 */       
import java.util.Scanner;
class Angle
{
    int deg,min;
    static int d1,m1;
    public Angle(int d,int m)
    {
        deg=d;
        min=m;
    }
    static void sum(Angle obj)
    {
        m1+=obj.min;
        if(m1>=60)
        {
            m1-=60;
            d1+=1;
        }
        d1+=obj.deg;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number of angles: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Angle [] obj =new Angle[n];
        int d=0,m=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("For new angle:\nEnter degrees: ");
            d=sc.nextInt();
            System.out.println("Enter minutes: ");
            m=sc.nextInt();
            obj[i]=new Angle(d,m);
            sum(obj[i]);
        }
        System.out.println("The sum is "+d1+" degrees "+m1+" minutes");
    }
}