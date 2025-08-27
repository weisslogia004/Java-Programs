public class Factorial {
    //public static void fact(int n){
    public static int fact(int n){
        int f=1;
        for(int i=n; i>=1; i--)
        {
            f=f*i;
        }
        //System.out.println(f);
        return f;
    }
    public static void main(String[] args) {
        int no=6;
        //fact(no);
        System.out.println(fact(no));
    } 
}
