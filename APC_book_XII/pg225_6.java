import java.util.*;   
class pg225_6
{ 
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        triangular_series(n); 
    } 
    static void triangular_series(int n) 
    { 
        int i, j = 1, k = 1; 
        for (i = 1; i <= n; i++) 
        { 
            System.out.printf("%d ", k); 
            j=j+1; 
            k=k+j;
        } 
    } 
} 
