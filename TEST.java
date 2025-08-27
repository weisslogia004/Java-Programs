import java.util.*;
public class TEST
{
    public static void main(String args[])
    {
        String w[]=new String[40];
        Scanner sc=new Scanner(System.in);
        String k;
        for(int i=0;i<=39;i++)
        {
            System.out.println("ENTER STRING:");
            w[i]=sc.next();
        }
        for(int i=0;i<=38;i++)
        {
            for(int j=i+1;j<39;j++)
            {
                if(w[i].compareTo(w[j])<0)
                {
                    k=w[i];
                    w[i]=w[j];
                    w[j]=k;
                }
            }
        }
        for(int i=0;i<=39;i++)
        {
            System.out.println(w[i]);
        }
    }
}
            