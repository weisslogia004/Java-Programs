import java.util.*;
public class ASS_13_2020
{
    public static void main(String args[])
    {
        ASS_13_2020 obj=new ASS_13_2020();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:"); //Accepting the sentence
        String str=sc.nextLine();
        StringTokenizer s=new StringTokenizer(str);
        int c=s.countTokens();
        String arr[]=new String[c];
        int a=0;
        while(s.hasMoreTokens()) // putting the words of the sentence in a string array
        {
            String wrd=s.nextToken();
            arr[a]=wrd;
            a++;
        }
        int f[]=new int[c];
        int t=0;
        for(int i=0;i<c;i++) // creating word frequency for each word
        {   
            for(int j=i;j<c;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    t++;
                }
            }
            f[i]=t;
            if(t>1) // if same word has more than once then this loop keeps the first one and deletes the rest
            {
                for(int k=i+1;k<c;k++)
                {
                    if(arr[i].equals(arr[k]))
                    {
                        arr[k]="";
                    }
                }
            }
            t++;
        }
        int max=0;
        for(int i=0;i<c;i++) // getting the max value
        {
            if(f[i]>max)
            {
                max=f[i];
            }
        }
        for(int i=0;i<c;i++) //printing the words according to their highest frequency
        {
            if(max==f[i])
            {
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println("");
    }
}
    
    
            
                
            

        
            
                
        
            
                    
                

            
                
            
