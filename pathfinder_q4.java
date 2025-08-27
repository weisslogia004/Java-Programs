import java.util.*;
public class pathfinder_q4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,r=250;
        double amt=0.0;
        String nm="";
        System.out.println("ENTER CUSTOMER NAME:");
        nm=sc.nextLine();
        System.out.println("ENTER THE NUMBER OF CALLS:");
        c=sc.nextInt();
        if(c<=100)
        {
            amt=r;
        }
        else if(c>100 && c<=200)
        {
            amt=(c-100)*0.60+r;
        }
        else if(c<200 && c<=300)
        {
            amt=(c-200)*0.50+(100*0.60)+r;
        }
        else
        {
            amt=(c-300)*0.40+(100*0.50)+(100*0.60)+r;
        }
        System.out.println("NAME OF THE CUSTOMER"+"\t"+"NO. OF CALLS"+"\t"+"BILL AMOUNT");
        System.out.println(nm+"\t\t"+c+"\t\t"+amt);
    }
}
        