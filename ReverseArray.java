import java.util.*;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();    
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i= 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        CustomPrint(array);
    }
    
    static void CustomPrint(int a[]) {
        for(int i=0; i< a.length; i++) {
            System.out.print(a[i]);
        }
    }        
}
