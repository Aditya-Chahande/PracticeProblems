public class RecursionTest{
    public static void main(String[] args) {
        System.out.println(Power(6, 3));
    }

    public static int Power(int a, int b) {
        if(b <= 0){
            return 1;
        }
        else {
           return a * Power(a,b-1);
        }
    }
}