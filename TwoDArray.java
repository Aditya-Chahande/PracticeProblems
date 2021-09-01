import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int a = s.nextInt();
                array[i][j] = a;
            }
        }
        s.close();
        int max = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                int tempsum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
                        + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (tempsum > max) {
                    max = tempsum;
                }
            }
        }
        System.out.println(max);
    }
}
