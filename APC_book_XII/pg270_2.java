import java.util.*;
public class pg270_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            for(int j='A';j<='Z';j++)
            {
                if(ch==j)
                {
                    char c=(char)ch;
                    String s=c+(char)j;
                    System.out.println(s);
                }
            }
        }
    }
}
                    