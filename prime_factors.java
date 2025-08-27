import java.util.*; 
class prime_factors
{
   public static void primeFactors(int n) 
   { 
        while (n%2==0) 
        { 
            System.out.print(2+","); 
            n=n/2; 
        } 
        for(int i=2;i<=Math.sqrt(n);i+=2) 
        { 
            while (n%i==0) 
            { 
                System.out.print(i+" "); 
                n=n/i; 
            } 
        } 
        if (n>2) 
        System.out.print(n); 
   } 
   public static void main(String args[]) 
   { 
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n = sc.nextInt(); 
        primeFactors(n); 
   } 
} 