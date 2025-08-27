import java.util.*;
class pg226_8
{
    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int no=i;
            String s= Integer.toString(i);
            int l=s.length();
            int flag=0,k,j;
            for(j=0;j<l-1;j++)
            {
                for(k=j+1;k<l;k++)
                {
                    if(s.charAt(j)==s.charAt(k)) 
                    {
                        flag=1;
                        break; 
                    }
                }
            }
            if(flag ==0)
            System.out.println(no+" is an Unique Number!!!");
            else 
            System.out.println(no+" is not an Unique Number!!!");
        }
    }
}
