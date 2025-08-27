   import java.util.Scanner;
   public class Extract_Digits
   {
       public static void main(String args[])
       {
            int n,m,r;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter any number:");
            n = s.nextInt();
            m = n;
            while(n > 0)
            {
                r = n%10;
                n=n/10;
                System.out.println("Digits:"+r);
            }
       }
   }