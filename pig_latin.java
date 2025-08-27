import java.util.*;
public class pig_latin
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD");
        String str=sc.nextLine();
        int l=str.length();
        for(i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                break;
            }
        }
        String str1=str.substring(i);
        String str2=str.substring(0,i);        
        System.out.print(str1+str2+"AY");
    }
}

 
