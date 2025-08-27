import java.util.*
public class binary_sort
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,j,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE TEN NUMBERS IN THE ARRAY:");
        for(i=0;i<9;i++)
        {
            a[i]=sc.nextInt();
            for(i=0;i<10;i++)
            {
                for(j=0;j<(9-i);j++)
                {
                    if(a[j]>a[j+1])
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            System.out.println(
            