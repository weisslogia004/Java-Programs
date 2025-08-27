import java.util.*;
public class vowel_counter
{
    public static void main(String args[])
    {
        int c=0;String w1="";String w2="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String in Upper-Case or All Capital:");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            int l=wrd.length();
            char ch1=wrd.charAt(0);
            char ch2=wrd.charAt(l-1);
            if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U' && ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
            {
                w1=w1+wrd+" ";
                c++;
            }
            else
            {
                w2=w2+wrd+" ";
            }
        }
        System.out.println(w1+" "+w2);
        System.out.print(c);
    }
}
       
        
        
