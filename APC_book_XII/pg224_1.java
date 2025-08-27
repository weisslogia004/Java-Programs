import java.util.*;
public class pg224_1
{
    public static void main(String args[])
    {
        int d=0,da=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days:");
        int n=sc.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("Enter 'D' if Dealer or 'R' if Retailer:");
        char ch=sc.next().charAt(0);
        System.out.println("Enter amount of purchase:");
        int a=sc.nextInt();
        switch (ch) 
        {
            case 'D':
            if(n<=30)
            {
                d=(15*a)/100;
                da=a-d;
            }
            else if(n>30 && n<=45)
            {
                d=(12*a)/100;
                da=a-d;
            }
            else if(n>45 && n<=60)
            {
                d=(10*a)/100;
                da=a-d;
            }
            if(n>60)
            {
                d=0;
                da=a-d;
            }
            break;
            case 'R':
            if(n<=30)
            {
                d=(10*a)/100;
                da=a-d;
            }
            else if(n>30 && n<=45)
            {
                d=(8*a)/100;
                da=a-d;
            }
            else if(n>45 && n<=60)
            {
                d=(5*a)/100;
                da=a-d;
            }
            if(n>60)
            {
                d=0;
                da=a-d;
            }
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
        System.out.println("Number of Days:"+n);
        System.out.println("Amount:"+a);    
        System.out.println("Discounted amount:"+d); 
        System.out.println("Amount Payable:"+da);
    }
}
            
        
            
                
                