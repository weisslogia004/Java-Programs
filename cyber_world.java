import java.util.*;
public class cyber_world
{
    public static void main(String args[])
    {
        String w="",ns="";
        char ch;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String str=sc.nextLine();
        str=str+"";
        int l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                ch=Character.toUpperCase(w.charAt(0));
                ns=ns+ch+w.substring(1)+"";
                w="";
            }
            else
            {
                w=w+ch;
            }
            System.out.println("STRING YOU HAD ENTERED: ");
            System.out.println("THE NEW STRING: ");
        }
    }
}
            
        
        
        