import java.util.*;
public class Addition{
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("Sum = "+sum);
    }
}