import java.util.*;
public class word_type
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A WORD:");
        String w=sc.next();
        int l=w.length();
        String w1="";
        char ch1,ch2;
        for(int k=0;k<1;k++)
        {
            ch1=w.charAt(k);
            w1=ch1+w1;
        }
        if(w1.equals(w)==true)
        {
            System.out.println("IT IS PALINDROME WORD.");
        }
        else if(w.charAt(0)==w.charAt(l-1))
        {
            System.out.println("IT IS A SPECIAL WORD.");
        }
        else
        {
            System.out.println("IT IS NOT A SPECIAL WORD.");
        }
    }
}
    