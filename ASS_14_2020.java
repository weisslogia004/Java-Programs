import java.util.*;
class ASS_14_2020
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     ASS_14_2020 o=new ASS_14_2020();
     System.out.println("Enter the String");
     String str=sc.nextLine();
     o.display(str);
  }
  public void display(String st)
  {
     int l=st.length();
     String arr[]=new String[l];
     String ak[]=new String[l];
     int counter[]=new int[l];
     char ch;
     int o1=0;
     StringTokenizer s=new StringTokenizer(st);
     while(s.hasMoreTokens())
     {
         String wrd=s.nextToken();
         arr[o1]=wrd;
         o1++;
     }
     int count=0;
     for(int i=0;i<o1;i++)
     {
            for(int j=0;j<o1;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    count++;
                    if(count>1)
                    {
                       arr[j]="";
                    }
                }
            }
            if(arr[i]!="")
            {
                System.out.println("Frequency of word: "+arr[i]+" "+ count);
                ak[i]=arr[i];
                counter[i]=count;
            }
            arr[i]=" ";
            count=0;
     }
     int t=0;
     String temp="";
     for(int i=0;i<o1;i++)
     {
        for(int j=0;j<(o1-1);j++)
        {
           if(counter[j]>counter[j+1])
           {
              t=counter[j];
              counter[j]=counter[j+1];
              counter[j+1]=t;
              temp=ak[j];
              ak[j]=ak[j+1];
              ak[j+1]=temp;
           }
        }
     }
     for(int i=0;i<o1;i++)
     {
        if(ak[i]!=null)
        {
           System.out.println(ak[i]+"\t"+counter[i]);
        }
     }
  }
}
