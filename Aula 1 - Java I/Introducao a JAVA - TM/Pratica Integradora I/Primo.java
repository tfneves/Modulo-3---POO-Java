import java.util.*;

public class Primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i=2; i<n; i++){
            if(n%i == 0){
                System.out.println(n + " não é primo");
                return;
            }
        }
        System.out.println(n + " é primo");
    }
}
