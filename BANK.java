import java.util.*;
public class BANK
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("USER MENU:");
        System.out.println("<1.> FOR TERM DEPOSIT.");
        System.out.println("<2.> FOR RECURRING DEPOSIT.");
        System.out.print("ENTER YOUR CHOICE:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("CALCULATING YOUR TERM DEPOSIT(AS PER THE CHOICE YOU HAVE ENTERED).");
            System.out.print("ENTER YOUR PRINTCIPAL AMOUNT:"); 
            double p=sc.nextDouble();
            System.out.print("ENTER THE RATE OF INTEREST(IN %):");
            double r=sc.nextDouble();
            System.out.print("ENTER THE TIME PERIOD(IN YEARS):");
            double n=sc.nextDouble();
            double a=1+(r/100);
            double A=p*Math.pow(a,n);
            System.out.println("MATURITY AMOUNT:"+A);
            break;
            
            case 2:
            System.out.println("CALCULATING YOUR RECURRINTG DEPOSIT(AS PER THE CHOICE YOU HAVE ENTERED).");
            System.out.print("ENTER YOUR MONTHLY INSTALLMENT:");
            p=sc.nextDouble();
            System.out.print("ENTER THE RATE OF INTEREST(IN %):");
            r=sc.nextDouble();
            System.out.print("ENTER THE TIME PERIOD(IN YEARS):");
            n=sc.nextDouble();
            a=(r/100)*(1/12);
            double b=(n*(n*1))/2*a;
            A=(p*n)+(p*b);
            System.out.println("MATURITY AMOUNT:"+A);
            break;
            
            default:
            System.out.println("PLEASE CHECK THE CHOICE YOU HAVE ENTERED!!!");
        }
    }
}
            
            
            