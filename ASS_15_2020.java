import java.util.*;
public class ASS_15_2020
{
    public static void main(String args[])
    {
        int i,l,x,s,j;
        String str,wrd="";
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING:");
        str=sc.nextLine();
        str=str+" ";
        str=str.toUpperCase();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                int l1=wrd.length();
                s=0;
                for(j=0;j<l1;j++)
                {
                    ch1=wrd.charAt(j);
                    x=ch1;
                    x=x-64;
                    s=s+x;
                }
                System.out.println(wrd+"="+s);
                wrd="";
            }
            else
            {
                wrd=wrd+ch;
            }
        }
    }
}
        
                
                    
                
            
    