import java.util.*;
public class OVERLOAD_007
    {
        void display(String str,int p)
        {
            int i;
            int l=str.length();
            if(p==1)
            {
                for(i=0;i<l;i++)
                {
                    char ch=str.charAt(i);
                    if(Character.isUpperCase(ch))
                    {
                        System.out.println(ch);
                    }
                }
            }
            else
            {
                for(i=0;i<l;i++)
                {
                    char ch=str.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        System.out.println(ch);
                    }
                }
            }
        }
            void display(String str,char chr)
            {
                int i;
                int l1=str.length();
                if(chr=='v')
                {
                    for(i=0;i<l1;i++)
                    {
                        char ch=str.charAt(i);
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        {
                            System.out.println(ch);
                        }
                    }
                }
                else
                {
                    for(i=0;i<l1;i++)
                    {
                        char ch=str.charAt(i);
                        System.out.println(ch);
                    }
                }
            }
        }
                    
                            
                    
                
        
        
    