import java.util.*;
public class CALCULATOR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1. FOR ADDITION.");
        System.out.println("ENTER 2. FOR SUBSTRACTION.");
        System.out.println("ENTER 3. FOR MULTIPLICATION.");
        System.out.println("ENTER 4. FOR DIVISION.");
        System.out.println("ENTER 5. FOR SQUARE.");
        System.out.println("ENTER 6. FOR CUBE.");
        System.out.println("ENTER 7. FOR SQUARE ROOT.");
        System.out.println("ENTER 8. FOR CUBE ROOT.");
        System.out.println("ENTER 9. FOR SINE.");
        System.out.println("ENTER 10. FOR COSINE.");
        System.out.println("ENTER 11. FOR TANGENT.");
        for(;;)
        {
            System.out.println("ENTER YOUR CHOICE");
            int ch=sc.nextInt();        
             switch(ch)
            {
              case 1:
              int sum=0;
              int n;
              System.out.println("ENTER THE NUMBERS,ENTER 000 FOR GETTING THE FINAL RESULT:");
              for(;;)
             {
                n=sc.nextInt();
                if(n==000)
                {
                  break;
                }
              sum=sum+n;
              System.out.println("THE SUM THE NUMBERS IS:"+sum);
             }
              break;
              
              case 2:
              System.out.println("ENTER FIRST NUMBERS:");
              int a2=sc.nextInt();
              System.out.println("ENTER SECOND NUMBERS:");
              int b2=sc.nextInt();
              if(a2>b2)
                {
                    int diff=a2-b2;
                    System.out.println("THE DIFFERENCE OF THE NUMBERS ARE:"+diff);
                }
              else
                {
                    int diff=b2-a2;
                    System.out.println("THE DIFFERENCE OF THE NUMBERS ARE:"+diff);
                }
              break;
              
              case 3:
              int prod=1;
              int n3;
              System.out.println("ENTER THE NUMBERS,ENTER 000 FOR GETTING THE FINAL RESULT:");
              for(;;)
             {
                n3=sc.nextInt();
                if(n3==000)
                {
                  break;
                }
              prod=prod*n3;
              System.out.println("THE PRODUCT IS:"+prod);
             }
              break;
              
              case 4:
              System.out.println("ENTER FIRST NUMBERS:");
              int a4=sc.nextInt();
              System.out.println("ENTER SECOND NUMBERS:");
              int b4=sc.nextInt();
              int quot=a4/b4;
              System.out.println("THE QUOTIENT OF THE NUMBERS:"+quot);
              break;
              
              case 5:
              System.out.println("ENTER A NUMBER:");
              int a5=sc.nextInt();
              double sq=Math.pow(a5,2);
              System.out.println("THE SQUARE OF THE NUMBERS:"+sq);
              break;
              
              case 6:
              System.out.println("ENTER A NUMBER:");
              int a6=sc.nextInt();
              double cb=Math.pow(a6,3);
              System.out.println("THE CUBE OF THE NUMBERS:"+cb);
              break;
              
              case 7:
              System.out.println("ENTER A NUMBER:");
              int a7=sc.nextInt();
              double sqrt=Math.sqrt(a7);
              System.out.println("THE SQUARE ROOT OF THE NUMBERS:"+sqrt);
              break;
              
              case 8:
              System.out.println("ENTER A NUMBER:");
              int a8=sc.nextInt();
              double cbrt=Math.cbrt(a8);
              System.out.println("THE CUBE ROOT OF THE NUMBERS:"+cbrt);
              break;
              
              case 9:
              System.out.println("ENTER AN ANGLE:");
              int a9=sc.nextInt();
              double s=Math.sin(a9);
              System.out.println("THE SINE OF THE ANGLE:"+s);
              break;
              
              case 10:
              System.out.println("ENTER AN ANGLE:");
              int a10=sc.nextInt();
              double c=Math.cos(a10);
              System.out.println("THE COSINE OF THE ANGLE:"+c);
              break;
              
              case 11:
              System.out.println("ENTER AN ANGLE:");
              int a11=sc.nextInt();
              double t=Math.tan(a11);
              System.out.println("THE TANGENT OF THE ANGLE:"+t);
              break;
              
              default:
              System.out.println("PLEASE KINDLY CHECK THE CHOICE YOU HAVE ENTERED!!!");
            }
        }
    }
}
              
              
              
              
              
              
              
              
              
              
              
           
                   
        
