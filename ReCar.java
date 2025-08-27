import java.util.*;
class ReCar
{
    int cno,d;
    String nm;
    double charge;
    long phno;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF CUSTOMER");
        nm=sc.nextLine();
        System.out.println("ENTER THE PHONE NUMBER");
        phno=sc.nextLong();
        System.out.println("ENTER THE CAR NUMBER");
        cno=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF DAYS YOU WANT TO RENT THE CAR");
        d=sc.nextInt();
        
    }
    void compute()
    {
        if(d<=5)
        {
            charge=1000*d;
        }
        else if(d>5 && d<=15)
        {
            charge=5*1000+(d-5)*500;
        }
        else 
        {
            charge=5*1000+10*500+(d-15)*250;
        }
    }
    void display()
        {
            System.out.println("NAME OF CUSTOMER: "+nm);
            System.out.println("PHONE NUMBER: "+phno);
            System.out.println("CAR NUMBER: "+cno);
            System.out.println("NUMBER OF DAYS CAR TO BE RENTED: "+d);
            System.out.println("YOUR RENTAL CHARGE IS: "+charge);
        }
    public static void main(String args[])
    {
      ReCar obj=new ReCar();
      obj.input();
      obj.compute();
      obj.display();
    }
    
    }
        
    
