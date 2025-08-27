import java.util.*;
public class pg224_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice,'A' for Arithmetic mean,'G' for Geometric mean or 'H' for Harmonic mean:");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'A':
            double A=(a+b)/2;
            System.out.println("Arithmetic Mean:"+A);
            break;
            case 'G':
            int p=a*b;
            double G=Math.sqrt(p);
            System.out.println("Geometric Mean:"+G);
            break;
            case 'H':
            double H=(2*a*b)/(a+b);
            System.out.println("Harmonic Mean:"+H);
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
    }
}
        
        
        
        
        
        
        
        
        