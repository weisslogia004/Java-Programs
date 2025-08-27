import java.util.*;
public class ALPHABET
{
    public static void main(String args[])
    {
        int i,l,j;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        l=str.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<l;j++)
            {
                ch=str.charAt(j);
                if(ch==(char)i||ch==(char)(i+32))
                {
                    System.out.print(ch);
                }
            }
        }
    }
}
