import java.util.*;
public class Magic
{
    int sumofdgt(int no)
    {
        int s=0,r;
        while(no>0)
        {
            r=no%10;
            s=s+r;
            no=no/10;
        }
        return(s);
    }
    public static void main(String args[])
    {
        int a,b,x,i,no=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A RANGE:");
        a=sc.nextInt();
        b=sc.nextInt();
        Magic obj=new Magic();
        for(i=a;i<=b;i++)
        {
        while(i<9)
        {
            x=obj.sumofdgt(no);
            i=x;
        }
        if(i==1)
        {
            System.out.println("MAGIC NUMBERS ARE:"+i);
        }
        else
        {
             System.out.println("THE NUMBER YOU HAVE ENTERED IS NOT A MAGIC NUMBER!!!");
        }
    }
}
}






















 

    
            
    
    
            
        