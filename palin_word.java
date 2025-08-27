import java.util.*;
public class palin_word
{
    public static void main(String args[])
    {
        int c=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            int l=wrd.length();
            for(int i=l-1;i>=0;i--)
            {
                char ch=wrd.charAt(i);
                rev=rev+ch;
            }
            if(rev.equalsto(wrd))
            {
                System.out.print(rev);
                c++;
            }
            else
            {
                System.out.print("NO palindrome word Found!!!");
            }
            System.out.print(c);
        }
    }
}
            
            