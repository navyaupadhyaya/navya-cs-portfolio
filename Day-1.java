import java.util.Scanner;

class Sum 
{
    void main ()
    {
       Scanner sc=new Scanner (System.in);
        int n,i,sum=0;
        String x = "Enter value of n";
        System.out.println (x);
        n= sc.nextInt ();
        i=1;
        while (i<=n)
        {
            sum=sum+i;
            
            i=i+1;
     }
     System.out.println ("Sum="+sum);
    sc.close();
    }
}