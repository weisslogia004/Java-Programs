public class Main{

     public static void main(String[] args) {

           for(int i = 10 ; i < 1000 ; i++){

                 int reversed = 0;

                 int num = i;

                 while(num != 0) {

                       int digit = num % 10;

                       reversed = reversed * 10 + digit;

                       num /= 10;

                 }if(i == reversed){

                       boolean flag = false;

                       for(int j = 2; j <= i/2; ++j){

                             if(i % j == 0){

                                   flag = true;

                                   break;

                             }

                       }if(!flag){

                             System.out.print(i+",");

                       }

                 }

           }

     }

}