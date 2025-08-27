import java.util.*;
public class RAILWAY_TICKET
{
    String name;
    String coach;
    long mobno;
    int amt;
    double totalamt;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        name=sc.nextLine();
        System.out.println("ENTER COACH TYPE:");
        coach=sc.next();
        System.out.println("ENTER YOUR MOBILE NUMBER:");
        mobno=sc.nextLong();
        System.out.println("ENTER AMOUNT:");
        amt=sc.nextInt();
    }
    void update()
    {
        if(coach.equalsIgnoreCase("FIRST CLASS-AIR CONDITIONED."))
        {
            totalamt=amt+700;
        }
        else if(coach.equalsIgnoreCase("SECOND CLASS-AIR CONDITIONED."))
        {
            totalamt=amt+500;
        }
        else if(coach.equalsIgnoreCase("THIRD CLASS-AIR CONDITIONED."))
        {
            totalamt=amt+250;
        }
        else if(coach.equalsIgnoreCase("SLEEPER CLASS."))
        {
            totalamt=amt+0;
        }
        else 
        {
            totalamt=amt;
        }
    }
    void display()
    {
        System.out.println("YOUR NAME:"+name);
        System.out.println("COACH TYPE:"+coach);
        System.out.println("YOUR MOBILE NUMBER:"+mobno);
        System.out.println("YOUR AMOUNT:"+amt);
        System.out.println("THE TOTAL AMOUNT THAT YOU HAVE TO PAY:"+totalamt);
    }
    public static void main()
    {
        RAILWAY_TICKET obj=new RAILWAY_TICKET();
        obj.accept();
        obj.update();
        obj.display();
    }
}

        
            
    
        
    