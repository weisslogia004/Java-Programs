import java.util.*;
public class pg227_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        pg227_12 obj=new pg227_12();
        int a=Integer.parseInt(no);
        int b=Integer.parseInt(no);
        int f1=obj.increasing(no);
        int f2=obj.increasing(no);
        if(f1==0)
        {
            System.out.print("Increasing");
        }
        else if(f2==0)
        {
            System.out.print("Decreasing");
        }
        else
        {
            System.out.print("Bouncy");
        }
    }
    int increasing(String no)
    {
        int l,flag=0;
        l=n.length();
        for(int i=0;i<l-1;i++)
        {
            char ch1=n.charAt(i);
            char ch2=n.charAt(i+1);
            if(ch1>ch2)
            {
                flag=1;
                break;
            }
        }
        return(flag);
    }
    int decreasing(String no)
    {
        int l,flag=0;
        l=n.length();
        for(int i=0;i<l-1;i++)
        {
            char ch1=n.charAt(i);
            char ch2=n.charAt(i+1);
            if(ch1<ch2)
            {
                flag=1;
                break;
            }
        }
        return(flag);
    } 
}
            
        
        