import java.util.*;
public class ass_4
{
    public static void main(String args[])
    {
        int i,j;
        String nw="",sw="";
        String nm[]=new String[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TEN NAMES:");
        for(i=0;i<10;i++)
        {
            nm[i]=sc.nextLine();
        }
        for(i=0;i<10;i++)
        {
            String wrd=nm[i];
            char ch1=wrd.charAt(0);
            int l=wrd.length();
            char ch2=wrd.charAt(l-1);
            nw=nw+ch1+ch2;
            int l1=nw.length();
        for(i=65;i<=90;i++)
        {
            for(j=0;j<l1;j++)
            {
                char ch=nw.charAt(j);
                if(i==(int)ch)
                {
                    sw=sw+ch;
                }
            }
        }
    }
}
}
            
        
            
        
        