import java.util.*;
public class pattern_menu_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,p,k;
        char ch;
        String st;
        System.out.println("ENTER A WORD AS TOKEN FOR PATTERN PRINTING:");
        st=sc.next();
        p=st.length();
        System.out.println("ENTER YOUR CHOICE:");
        k=sc.nextInt();
        switch(k)
        {
            case 1:
            System.out.println("THE PATTERN IS:");
            for(i=0;i<p;i++)
            {
                for(j=0;j<=i;i++)
                {
                    ch=st.charAt(j);
                    System.out.print(ch);
                }
                System.out.println();
            }
            break;
            
            case 2:
            System.out.println("THE PATTERN IS:");
            for(i=p;i>=1;i--)
            {
                for(j=0;j<i;j++)
                {
                    ch=st.charAt(j);
                    System.out.print(ch);
                }
                System.out.println();
            }
            break;
            
            default:
            System.out.print("THE CHOICE YOU HAVE ENTERED IS NOT IN MENU!!!");
        }
    }
}
    
        

