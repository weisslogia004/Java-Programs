import java.util.*;
public class mo_bike
{
    int bno;
    int phno;
    String name;
    int days; 
    int charge;
}
void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE BIKE NUMBER:");
    bno=sc.nextInt();
    System.out.println("ENTER THE PHONE NUMBER:");
    phno=sc.nextInt();
    System.out.println("ENTER YOUR NAME:");
    name=sc.nextLine();
    System.out.println("ENTER THE NUMBER OF DAYS:");
    days=sc.nextInt();
}
void compute()
{
    if(days<=5)
    {
        charge=500*days;
    }
    else if(days=>5 && days<=10)
    {
        charge=(500*days)+(400*days);
    }
    else
    {
        charge=(200*days)+(500*days)+(400*days);
    }
}
if(days<=5)
{
    charge=days*500;
}
else if(days>5 && days<=10)
{
    charge=5*500+(days-5)*400;
}
else
{
    charge=5*500+5*400+(days-10)*200;
}
public static void main()
{
   mo_bike obj=new mo_bike();
   obj.input();
   obj.compute();
}

