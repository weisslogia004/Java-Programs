import java.util.*;
class calculation
{
    public static void main(String args[])
    {
        int a,ch;
        double l,ab,sq,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for natural logarithm");
        System.out.println("2. for absolute value");
        System.out.println("3. for square root");
        System.out.println("4. for random");
        System.out.println("ENTER THE NUMBER");
        a= sc.nextInt();
        for(;;)
        {
        System.out.println("ENTER A CHOICE");
        ch= sc.nextInt();
      
        switch (ch)
        {
            case 1:
            l= Math.log(a);
            System.out.println("The natural logarihtm is"+ l);
            break;
            case 2:
            ab= Math.abs(a);
            System.out.println("The absolute value is"+ ab);
            break;
            case 3:
            sq= Math.sqrt(a);
            System.out.println("The square root is"+ sq);
            break;
            case 4:
            r= Math.random();
            System.out.println("The random numbers between 0 and 1 are"+ r);
            break;
            default:
            System.out.print("WRONG CHOICE :( xxxxx  :(   xxxxx   :( ");
        }
    }
}
}

            