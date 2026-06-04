import java.util.Scanner;
 
public class Digits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter a number");
        n=sc.nextInt();
     while (n>0)
     {
    n=n/10;
    count++;
     }
System.out.print("Number of digits"+count);
sc.close();
}
}