import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map<String, Integer> contactbook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = s.next();
            int phnn = s.nextInt();
            contactbook.put(name, phnn);
        }
        while(s.hasNext()){
            String name = s.next();
            int phnn = contactbook.get(name);
            if(contactbook.get(name) != null){
                System.out.print(name+"="+phnn);
            }
            else{
                System.out.println("Not Found");
            }
        }
        s.close();
    }
}