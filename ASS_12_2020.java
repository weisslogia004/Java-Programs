import java.util.*;
public class ASS_12_2020
{
    public static void main(String args[])
    {
        int p1,p2,i,j,t=0;
        String str1,str2;
        char chr1,chr2;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER FIRST WORD:");
        str1=sc.nextLine().toLowerCase();
        System.out.print("ENTER SECOND WORD:");
        str2=sc.nextLine().toLowerCase();
        p1=str1.length();
        p2=str2.length();
        if(p1==p2)
        {
            for(i=0;i<p1;i++)
            {
                chr1=str1.charAt(i);
                t=0;
                for(j=0;j<p2;j++)
                {
                    chr2=str2.charAt(i);
                    if(chr1==chr2)
                    t=1;
                }
                if(t==0)
                break;
            }
            if(t==0)
            System.out.println(str1+" and "+str2+" are ANAGRAM words!!!");
            else
            System.out.println(str1+" and "+str2+" are not ANAGRAM words!!!");
        }
        else 
        System.out.println("THE CHOICE YOU HAVE ENTERED IS INVALID!!!RE-ENTER WORDS FOR ANAGRAMS!!!");
    }
}
        

        
        
