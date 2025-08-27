import java.util.*;
public class punctuation_reverse
{
    public static void main(String ags[])
    {
        String s=" ",wrd;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence:");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str,".,?;'");
        while(st.hasMoreTokens())
        {
            wrd=st.nextToken();
            s=wrd+" "+s;
        }
        System.out.println("Reversed String:"+s);
    }
}
        
    