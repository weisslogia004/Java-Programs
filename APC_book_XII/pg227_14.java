import java.util.*;
public class pg227_14
{
    public static void main(String args[])
    {
        int count=0;
        int flag=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int a=n*1;
        int b=n*2;
        int c=n*3;
        String sta=Integer.toString(a);
        String stb=Integer.toString(b);
        String stc=Integer.toString(c);
        String ct=sta+stb+stc;
        System.out.println("The concatenated number is:"+ct);
        for(int i=1;i<=9;i++)
        {
            num=n;
            while(n>0)
            {
                int r=n%10;
                if(n==i)
                count++;
                n=n/10;
            }
            if(count>1)
            {
                flag=1;
                break;
            }
            n=num;
        }
        if(flag==0)
        System.out.print("Fascinating.");
        else
        System.out.print("Not Fascinating.");
    }
}
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
