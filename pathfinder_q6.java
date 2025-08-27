public class pathfinder_q6
{
    void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            System.out.println("THE SQUARE OF THE NUMBERS="+(num*num));
        }
        else
        {
            System.out.println("THE CUBE OF THE NUMBERS="+(num*num*num));
        }
    }
    void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        {
            System.out.println("THE PRODUCT OF THE NUMBERS+"+(a*b));
        }
        else
        {
            System.out.println("THE SUM OF THE NUMBERS+"+(a+b));
        }
    }
    void num_calc(String s1,String s2)
    {
        if(s1.equals(s2))
        {
            System.out.println("TWO STRINGS ARE EQUAL!!!");
        }
        else
        {
             System.out.println("TWO STRINGS ARE NOT EQUAL!!!");
        }
    }
}
            


        
            
        
            

    
        