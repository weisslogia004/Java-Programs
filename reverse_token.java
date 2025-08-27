import java.util.*;
public class reverse_token
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,p,v=0;
        char ch;
        String st,rev="";
        st=sc.next();
        p=st.length();
        System.out.println("THE REVERSED VERSION OF THE WORD YOU HAVE ENTERED IS:");
        for(i=p-1;i>=0;i--)
        {
            ch=st.charAt(i);
            rev=rev+ch;
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            v=v+1;
        }
        System.out.println("NUMBER OF VOWELS IS:"+v);
        System.out.println("NUMBER OF CHARACTERS IS:"+p);
        System.out.println("THE REVERSED VERSION OF THE STRING YOU HAVE ENTERED IS:"+rev);
    }
}
        