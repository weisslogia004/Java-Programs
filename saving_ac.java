import java.util.*;
public class saving_ac
{
    int acno;
    double money=652000.25;
    float depo=0,draw=0,balance=0;
    String name;
    public void withdrawal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Bank!!!");
        System.out.print("ENTER THE ACCOUNT NO.");
        acno=sc.nextInt();
        System.out.print("ENTER THE NAME OF THE A/c HOLDER:");
        name=sc.nextLine();
        System.out.print("THE PRESENT BALANCE IN YOUR ACCOUNT IS Rs."+(money+depo-draw));
        System.out.println("HOW MUCH MONEY DO YOU WANT TO WITHDRAW?");
        draw=sc.nextFloat();
    }
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Bank!!!");
        System.out.print("ENTER THE ACCOUNT NUMBER:");
        acno=sc.nextInt();
        System.out.print("THE PRESENT BALANCE IN YOUR ACCOUNT IS Rs."+(money+depo-draw));
        System.out.println("HOW MUCH MONEY DO YOU WANT TO DIPOSIT?");
        depo=sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Welcome to the Bank!!!");
        System.out.println("THE A/c NO.:"+acno);
        System.out.println("THE NAME OF THE A/c HOLDER:"+name);
        System.out.println("THE BALANCE IN YOUR ACCOUNT IS Rs:"+(money+depo-draw));
        System.out.println("THANK YOU SIR/MADAM.PLEASE VISIT AGAIN!!!");
    }
}
        
        
    