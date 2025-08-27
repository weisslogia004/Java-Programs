import java.util.*;
public class RECORD_ARRAY
{
    public static void main(String args[])
    {
        int u=9,l=0,m,flag=0;
        Scanner sc=new Scanner(System.in);
        int year[]={2000,2001,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2012,2013,2014,2015,2016,2017,2018,2019,2020}; 
        System.out.println("ENTER YEAR TO BE SEARCHED:");
        int y=sc.nextInt();
        while(l>=u)
        {
            m=(l+u)/2;
            if(y>year[m])
            {
                l=m+1;
            }
            else if(y<year[m])
            {
                l=m-1;
            }
            else
            {
                flag=1;
                break;
            }
            if(flag==1)
            {
                System.out.println("RECORD EXISTS!!!");
            }
            else
            {
                System.out.println("RECORD DOES NOT EXIST!!!");
            }
        }
    }
}
        