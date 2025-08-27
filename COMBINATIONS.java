import java.util.*;
public class COMBINATIONS
{
    public static void main(String args[])
    {
        String str;
        int i,j,l,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A THREE DIGIT NUMBER:");
        str=sc.nextLine();
        l=str.length();
        System.out.println("THE REQUIRED COMBINATIONS OF NUMBER:");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(i!=j&&j!=k&&k!=i)
                    {
                        System.out.println(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
                    }
                }
            }
        }
    }
}
                
        
