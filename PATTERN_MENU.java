import java.util.*;
public class PATTERN_MENU
{
    public static void main(String args[])
    {
        int t,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER WHICH TYPE OF PATTERN YOU WANT :D :D");
        System.out.println("ENTER 1 FOR ALPHABETICAL PATTERN(1)");
        System.out.println("ENTER 2 FOR ALPHABETICAL PATTERN(2)");
        System.out.println("ENTER 3 FOR WORD PATTERN");
        System.out.println("ENTER 4 FOR FLOYD'S TRIANGLE PATTERN");
        System.out.println("ENTER 5 FOR -ICSE- PATTERN");
        System.out.println("ENTER 6 FOR * & # PATTERN");
        System.out.println("ENTER 7 FOR NUMBER PATTERN(1)");
        System.out.println("ENTER 8 FOR NUMBER PATTERN(2)");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            char a,b;
            for(a='E';a>='A';a--)
            {
                for(b='A';b<=a;b++)
                {
                    System.out.print(a);
                }
                System.out.println();
            }
            break;
            
            case 2:
            char c,d;
            for(c='E';c>='A';c--)
            {
                for(d='A';d<=c;d++)
                {
                    System.out.print(d);
                }
                System.out.println();
            }
            break;
            
            case 3:
            int i,j;
            String str="BLUE";
            int l=str.length();
            for(i=1;i<=l;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(str.charAt(i-1));
                }
                System.out.println();
            }
            break;
            
            case 4:
            int i1;
            int j1;
            int k=1;
            for(i1=1;i1<=5;i1++)
            {
                for(j1=1;j1<=i1;j1++)
                {
                    System.out.print(k);
                    k++;
                }
                System.out.println();
            }
            break;
            
            case 5:
            int i2,j2;
            String str1="ICSE";
            int l1=str1.length();
            for(i2=1;i2<=l1;i2++)
            {
                for(j2=1;j2<=i2;j2++)
                {
                    System.out.print(str1.charAt(i2-1));
                }
                System.out.println();
            }
            break;
            
            case 6:
            int i3;
            int j3;
            for(i3=1;i3<=5;i3++)
            {
                for(j3=1;j3<=i3;j3++)
                {
                    if(j3%2==0)
                    System.out.print("*");
                    else
                    System.out.print("#");
                }
                System.out.println();
            }
            break;
            
            case 7:
            int e,f;
            for(e=1;e<=5;e++)
            {
                for(f=5;f>=e;f--)
                {
                    System.out.print(f);
                }
                System.out.println();
            }
            break;
            
            case 8:
            int e1,f1;
            for(e1=1;e1<=5;e1++)
            {
                for(f1=5;f1>=e1;f1--)
                {
                    System.out.print(e1);
                }
                System.out.println();
            }
            break;
            
            default:
            System.out.println("THE CHOICE YOU HAVE ENTERED IS INVALID :( :(");
            System.out.println("KINDLY PLEASE ENTER A CORRECT CHOICE FROM THE MENU :D :D");
        }
    }
}
            
            
            
            
                