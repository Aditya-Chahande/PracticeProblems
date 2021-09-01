import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("A Basic arithmetic calculator");
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in); 
        String a= input.nextLine();
        System.out.println(a);
        input.close();
    }
}
