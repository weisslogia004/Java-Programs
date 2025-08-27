import java.util.*;
public class A_TRANSPORT
{
    void accept()
    {
        double charge=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.nextLine();
        System.out.println("ENTER THE WEIGHT OF YOUR PARCEL:");
        int w=sc.nextInt();
    }
    void calculate()
    {
        if(w<10)
        {
             charge=25*w;
        }
        else if(w>10 && w<10)
        {
             charge=10*25+(w-25)*20;
        }
        else
        {
             charge=10*25+10*20+(w-30)*10;
        }
    }
    void print()
    {
        System.out.println("NAME:"+name);
        System.out.ptintln("WEIGHT OF THE PARCEL:"+w);
        System.out.println("CHARGE:"+charge);
    }
    public static void main(String args[])
    {
        A_TRANSPORT obj=new obj();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
    
        