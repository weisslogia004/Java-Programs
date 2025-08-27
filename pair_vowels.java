import java.util.*;
public class pair_vowels
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING:"); 
        String str=sc.nextLine();
        str=""+str;
        str=str.toUpperCase();
        int l=str.length();
        for(i=0;i<l-1;i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                if(ch==ch1)
                {
                    String str1=ch+ch1;
                }
                c++;
            }
            System.out.println("PAIR OF VOWELS:"+str1);
            System.out.println("NUMBER OF PAIR VOWELS:"+c);
        }
    }
}
        