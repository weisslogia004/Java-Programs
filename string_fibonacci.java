import java.util.*;
public class string_fibonacci
{
    public static void main(String args[])
    {
        int i,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last number of the range:");
        int n=sc.nextInt();
        String s[]=new String[n];
        s[0]="a";
        s[1]="b";
        s[2]="ba";
        for(i=3;i<n;i++)
        {
            x=i-1;
            y=i-2;
            s[i]=s[x]+s[y];
            System.out.print(s[i]);
            s[x]=s[y];
            s[y]=s[i];
        }
    }
}
        