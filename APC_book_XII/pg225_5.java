import java.util.*;
public class pg225_5
{
    public static void main(String args[])
    {
        String str;
        int i,j,l,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A THREE DIGIT NUMBER:");
        str=sc.nextLine();
        int n=Integer.parseInt(str);
        int n2=Integer.parseInt("100");
        int n3=Integer.parseInt("1000"); 
        if(n>n2 && n<n3)
        {
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
        else
        {
            System.out.println("Invalid Input!!!");
        }
    }
}
