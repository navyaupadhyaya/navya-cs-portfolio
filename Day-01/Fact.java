import java.util.Scanner;
class Fact 
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int n,fact=1;
        System.out.println("Enter a number ");
        n=sc.nextInt();
        while(n>0)
        {
            fact=fact*n;
            n=n-1;
        }
        System.out.println("Factorial="+fact);
        sc.close();
    }
}
