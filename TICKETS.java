import java.util.*;
public class TICKETS
{ 
    public static void main(String args[])
    {
        int n,ch,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1. FOR PREMIUM TICKETS");
        System.out.println("ENTER 2. FOR EXECUTIVE TICKETS");
        System.out.println("ENTER 3. FOR GOLD TICKETS");
        ch=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF TICKETS REQUIRED");
        n=sc.nextInt();
        switch(ch)
        {
            case 1:
            p=n*150;
            break;
            case 2:
            p=n*250;
            break;
            case 3:
            p=n*350;
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
        System.out.println("YOUR AMOUNT TO BE PAID IS:"+p);
        }
    }
        
   