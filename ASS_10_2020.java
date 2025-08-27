import java.util.*;
class pig_latin
{
    public static void main(String args[])
    {    
         String a,ans="",temp;
             char c;int i,l,k=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter english sentence to convert to piglatin:");
         a=sc.nextLine();
         a+=" ";            
         l=a.length();
         for(i=0;i<l;i++)
         {
         c=a.charAt(i); 
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
         {    
             temp=a.substring(k,i);            
             k=a.indexOf(" ",i);
             ans=ans+a.substring(i,k)+temp+"AY";    
             i=k;    
             k++;
         }
             }
             System.out.println("Pig Latin form for the  word is:"+ans);
    }
}

    