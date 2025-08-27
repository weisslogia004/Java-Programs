import java.util.*;
public class palindrome
{
    String str;
    String revword;
    palindrome()
    {
        str="";
        revword="";
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
    }
    String rev(String s)
    {
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            revword=revword+ch;
        }
        return (revword);
    }
    void disp()
    {
        System.out.println(str);
        System.out.println(revword);
    }
    void isPalin()
    {
        if(revword==str)
        {
            System.out.println("Palindrome");
        } 
        else
        {
            System.out.println("NOT Palindrome");
        }
    }
}
            
        
            
            
        

