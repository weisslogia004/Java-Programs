import java.util.*;
public class Search
{
    public static void main(String args[])
    {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        int Arr[] = new int[n];
        System.out.println("Enter elements of Array:");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Array displayed:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(Arr[i]);
        }
        System.out.print("Enter element to be searched:");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Arr[i] == x) 
            {
                System.out.println(Arr[i] + " found at index: " + i);
                flag = 1;
                break;  // stop at first match
            }
        }
        if (flag == 0) 
        {
            System.out.println("Not Found!!!");
        }
    }
}

/*import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}
 */