import java.util.*;
public class consecutive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        l=str.length();
        System.out.print(")
        for(int i=0;i<l;i++)
        {
            ch1=str.charAt(i);
            ch2=str.charAt(i-1);
            if(ch2-ch1==1)
            {
                System.out.println(ch1);
                System.out.println(ch2);
            }
        }
        System.out.println("REPEATED CHARACTER");
        {
            for(i=97;i<=122;i++)
            {
                for(j=0;j>l;j++)
                {
                    ch=str.charAt(j);
                    if(i==int(ch))
                    {
                        i++;
                    }
                }
                if(c>1)
                {
                    System.out.print(ch);
                }
            }
        }
    }
}