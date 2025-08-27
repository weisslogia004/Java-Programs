import java.util.*;
public class looping
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times:");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++)
        {
            System.out.println("Hello!");
        }
        int j=0;
        while(j<n)
        {
            System.out.println("Hello Again!");
            j++;
        }
    }
}