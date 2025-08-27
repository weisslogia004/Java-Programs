import java.util.*;
public class word_A
{
    public static void main(String args[])
    {
        String wrd="";
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STATEMENT");
        String str=sc.nextLine();
        str=str+"";
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch =str.charAt(i);
            if(ch==' ')
            {
                char ch1=wrd.charAt(0);
                if(ch1=='A'||ch1=='a')
                {
                    c=c+1;
                   System.out.print(wrd);
                }
                wrd="";
            }
            else
            {
                wrd=wrd + ch;
            }
        }
        System.out.println("FREQUENCY:"+c);
    }
}
    
        
       