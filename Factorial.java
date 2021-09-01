import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        System.out.println(factorial(a));
    }
    
    public static int factorial(int b){
        if(b<=0){
            return 1;
        }
        else{
            return b*factorial(b-1);
        }
    } 
}
