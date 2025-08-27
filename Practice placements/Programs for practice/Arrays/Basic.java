import java.util.*;
public class Basic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int n = sc.nextInt();
        int Arr[] = new int[n];
        Arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        /*System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("You entered:");*/
        for(int i = 0; i < n; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}