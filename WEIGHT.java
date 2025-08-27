import java.util.*;
public  class WEIGHT
{
    public static void main(String args[])
    {
        double w,c;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WIEGHT OF YOUR PARCEL");
        w=sc.nextDouble();
        System.out.println("ENTER 'K' FOR KOLKATA");
        System.out.println("ENTER 'M' FOR MUMBAI");
        System.out.println("ENTER 'D' FOR DELHI");
        System.out.println("ENTE 'C' FOR CHENNAI");
        c=sc.next().charAt(0);
        Switch (c)  
        {
            case 'K':
            if(w<=100)
            {
                c=w*45;
            }
            else
            {
                c=w*75;
            }
            break;
            case 'M':
            if(w<=100)
            {
                c=w*65;
            }
            else
            {
                c=w*95;
            }
            break;
            case 'C':
            if(w<=100)
            {
                c=w*75;
            }
            else
            {
                c=w*115;
            }
            break;
            case 'D':
            if(w<=100)
            {
                c=w*90;
            }
            else
            {
                c=w*125;
            }
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
        System.out.println("WEIGHT"+w);
        System.out.println("CHARGES"+c);
    }
}
            
            
            
            
            
            
            
                