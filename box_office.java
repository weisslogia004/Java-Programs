import java.util.*;
public class box_office
{
    int year;
    String title;
    double rating;
    public box_office()
    {
        year=0;
        title="";
        rating=0.0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TITLE OF THE MOVIE:");
        title=sc.nextLine();
        System.out.print("ENTER THE YEAR OF RELEASE:");
        year=sc.nextInt();
        System.out.print("ENTER THE POPULARITY RATING(OUT OF 5.0):");  
        rating=sc.nextDouble();
    }
    void display()
    {
        if(rating>=2.1 && rating<=3.4)
        {
            System.out.println(title+" :This movie is a FLOP.");
        }
        else if(rating>=2.1 && rating<=3.4)
        {
            System.out.println(title+" :This movie is a SEMI-HIT.");
        }
        else if(rating>=3.5 && rating<=4.5)
        {
            System.out.println(title+" :This movie is a HIT.");
        }
        else
        {
            System.out.println(title+" :This movie is a BLOCKBUSTER.");
        }
    }
    public static void main(String args[])
    {
        box_office obj=new box_office();
        obj.accept();
        obj.display();
    }
}
    

        
        