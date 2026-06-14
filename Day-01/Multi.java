import java.util.Scanner;

class Multi
{

    public static void main ()
    {
    int i,n;
    Scanner sc =new Scanner (System.in);
    System.out.print ("Enter any number:");
    n=sc.nextInt();
    System.out.println("Multiplication table of"+n);
    for(i=1; i<=10;i++)
     {  System.out.println(n+"x"+i+"="+n*i);}
    sc.close();
}
  }
