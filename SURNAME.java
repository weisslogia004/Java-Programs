import java.util.*;
class SURNAME
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER A NAME");
        String str=sc.nextLine();
int l = str.length();
int a = 0;
for(int i = 0;i<l;i++)
{
char ch =str.charAt(i);
if(Character.isWhitespace(ch))
a++;
}
if(a==2)
{
int c = str.indexOf(' ');
int d = str.lastIndexOf(' ');
System.out.print(str.substring(0,c)+str.substring(d,l));
}
else
System.out.println("Wrong input");
}
}

