import java.util.*;
public class APC18
{
    public static void main(String args[])
    {
        String swrd=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence:");
        String str=sc.next();
        str=str.toUpperCase();
        int l=str.length();
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<l;i++)
            {
                char ch=str.charAt(j);
                int x=ch;
                if(i==x)
                {
                    swrd=swrd+ch;
                }
            }
            for(int k=0;k<(l-1);k++)
            {
                char ch1=swrd.charAt(k);
                char ch2=swrd.charAt(k+1);
                int y=ch1;
                int z=ch2;
                for(int a=y+1;a<z-1;a++)
                {
                    System.out.print((char)a);
                }
            }
        }
    }
}

                
            
        