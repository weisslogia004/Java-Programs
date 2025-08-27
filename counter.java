import java.util.*;
public class counter
{
    public static void main(String args[])
    {
        int c,x,i,j,max=0;
        char ch,mch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int l=str.length();
        for(i=65;i<=90;i++)
        {
            c=0;
            for(j=0;j<l;j++)
            {
                ch=str.charAt(j);
                x=ch;
                if(i==x)
                {
                    c++;
                }
                if(c>max)
                {
                    max=c;
                    mch=ch;
                }
            }
        }
        System.out.print("Maximum Frequency:"+mch);
    }
}