import java.util.*;
public class DUBLICATE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2="";
        int i,l,j,t;
        System.out.println("ENTER A STRING:");
        s1=sc.nextLine();
        char ch1,ch2;
        l=s1.length();
        for(i=0;i<l;i++)
        {
            ch1=s1.charAt(i);
            t=0;
            for(j=0;j<s2.length();j++)
            {
                ch2=s2.charAt(j);
                if(ch1==ch2)
                  t=1;
            }
            if(t==0)
            {
                 s2=s2+ch1;
            }
                System.out.println("THE NEW STRING AFTER REMOVING DUPLICATE LETTERS:"+s2);
        }
    }
}

        