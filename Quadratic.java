import java.util.Scanner;
import static java.lang.Math.*;

class Quadratic1
{
    int a,b,c;
    double d,r1,r2;

void getd()
{
         Scanner scanner=new Scanner(System.in);
  
         System.out.println("Enter the values of a , b and c : ");
         a=scanner.nextInt();
         b=scanner.nextInt();
         c=scanner.nextInt();


         while(a==0)
         {
             System.out.println("Not a quadratic equation");
             System.out.println("Enter the values of a : ");
             a=scanner.nextInt();
         }
         

         d=b*b-4*a*c;

         if(d==0)
         {
            System.out.println("Roots are real and equal");
            r1=(-b)/2*a;
            System.out.println("Root1 = Root2 = "+r1);
         }
         
         else if(d>0)
         {
            System.out.println("Roots are real and distinct");
            r1=(-b)+Math.sqrt(d)/(double)2*a;
            r2=(-b)-Math.sqrt(d)/(double)2*a;
            System.out.println("Root1 = "+r1+" and Root2 = "+r2);
         } 

          else
         {
            System.out.println("Roots are imaginary");
            r1=(-b)/2*a;
            r2=Math.sqrt(-d)/2*a;
            System.out.println("Root1 = "+r1+" and Root2 = "+r2);
         } 
       scanner.close();
}
}

class Quadratic
{
    public static void main(String args[])
    {
        Quadratic1 myobj = new Quadratic1();
        myobj.getd();
        System.out.println("Name : Kanishka Sharma");
        System.out.println("USN : 1BM23CS138");
    }
}
   
