import java.util.Scanner;
public class pg224_4  
{
   public static void main(String[] args) 
   { 
     Scanner sc = new Scanner(System.in); 
     System.out.print("Input a number:"); 
     int n=sc.nextInt(); 
     int no=n;
     String str=Integer.toString(n);
     int d=str.length();
     int arr[]=new int[n];
     int i,sum; 
     for(i=d-1;i>=0;i--)
     {
         arr[i]=no%10;
         no=no/10;
          
     }
     i=d;sum=0;
     while(sum<n)
     {
         sum = 0;
         for(int j=1;j<=d;j++)
         {
             sum=sum+arr[i-j];
         }
         arr[i]=sum;
         i++;
     }
     if(sum==n)
     {
        System.out.println("Keith Number");
     }
     else
     {
        System.out.println("Not a Keith Number");
     }
   }
}
