import java.util.*;
class pg225_6_part2 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        t_series(n);
    }
    static void t_series(int n)
    {
        int t=0;
        System.out.println("List of Triangular Numbers:");
        for (int i=1;i<=n;i++) 
        {
           {
                t=t+i;
           }
           System.out.println(t);
        }
    }
}
