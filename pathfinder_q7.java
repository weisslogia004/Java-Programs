import java.util.*;
public class pathfinder_q7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD:");
        String str=sc.nextLine();
        String temp=str.toUpperCase();
        System.out.println("GIVEN WORD:"+str);
        System.out.println("WORD IN UPPER-CASE(OR CAPITALS) ARE:"+temp);
        int l=temp.length();
        System.out.print("WORD AFTER SORTING:");
        for(char x='A';x<='Z';x++)
        {
            for(int y=0;y<l;y++)
            {
                if(x==temp.charAt(y))
                {
                    System.out.print(temp.charAt(y));
                }
            }
        }
    }
}
                    
                   
        