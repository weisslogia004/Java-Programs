import java.util.*;
public class Vowel_TOKEN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,p;
        char ch1,ch2;
        String st[]=new String[10];
        System.out.println("ENTER TEN WORDS IN LOWER-CASE:");
        for(i=0;i<10;i++)
        {
            st[i]=sc.next();
        }
        System.out.println("THE TOKENS WHICH BEGIN & END WITH A VOWEL ARE:");
        for(i=0;i<10;i++)
        {
            p=st[i].length();
            ch1=st[i].charAt(0);
            ch2=st[i].charAt(p-1);
            if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') && (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'))   
            System.out.println(st[i]);
        }
    }
}

            