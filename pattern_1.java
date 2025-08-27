import java.util.*;
public class pattern_1
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int l=str.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<=i;j++)
            {
                char ch=str.charAt(j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
        