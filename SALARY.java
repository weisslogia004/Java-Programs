import java.util.*;
public class SALARY
{
    public static void main(String args[])
    {
        int a;
        double en,bs,da,hra,ta,pf,gs,ns,t=0.0;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.nextLine();
        System.out.println("ENTER YOUR AGE:");
        a=sc.nextInt();
        System.out.println("ENTER YOUR BASIC SALARY:");
        bs=sc.nextDouble();
        da=bs*40/100;
        hra=bs*20/100;
        ta=bs*10/100;
        pf=bs*12/100;
        gs=bs+da+hra+ta;
        gs=gs*12;
        ns=gs-pf;
        System.out.println("ENTER 'M' FOR MALE AND 'F' FOR FEMALE(IN UPPERCASE/CAPITAL):");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'M':
            if(gs<=250000)
            {
                t=0;
            }
            else
            {
                t=gs*10/100;
            }
            break;
            case 'F':
            if(gs<=300000)
            {
                t=0;
            }
            else
            {
                t=gs*10/100;
            }
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
        System.out.println("YOUR NAME:"+name);
        System.out.println("YOUR AGE:"+a);
        System.out.println("INCOME TAX:"+t);
    }
}
        

        
        
        
        
        
        
        
        
                
        
        
        