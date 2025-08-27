import java.util.*;
public class ASS_1_2020
{
    public static void main(String args[])
    {
        int i;
        double ti=0.0;                            //ti for total income
        Scanner sc=new Scanner(System.in);
        for(i=0;i<100;i++)
        {
            System.out.print("Enter your monthly sales:");
            double ms=sc.nextDouble();            //ms for monthly sales
            if(ms<=50000)
            {
                ti=ms*(1+0.02);
            }
            else if(ms>50000 && ms<=100000)
            {
                ti=ms*(1+0.1)*(1+0.05);
            }
            else if(ms>100000 && ms<=150000)
            {
                ti=ms*(1+0.12)*(1+0.08);
            }
            else
            {
                ti=ms*(1+0.15)*(1+0.1);
            }
            System.out.println("Your total income is:Rs."+ti);
        }
    }
}
            
                
