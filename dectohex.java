import java.util.Scanner;
public class dectohex 
{
    public static void main(String args[])
    {
        int n,r;
        String hn="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A DECIMAL(NUMBER WITH BASE 10)NUMBER:");
        n = sc.nextInt();
        while(n>0)
        {
            r=n%16;
            hn= hex[r] + hn;
            n=n/16;
        }
        System.out.print("THE HEXA-DECIMAL EQUIVALENT OF THE DECIMAL NUMBER YOU HAVE ENTERED IS:"+hn);         
    }
}
