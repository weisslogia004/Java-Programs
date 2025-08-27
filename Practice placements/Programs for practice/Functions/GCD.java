import java.util.*;
public class GCD {
    // Function to find GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        int hcf = 1;
        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
        /*while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

