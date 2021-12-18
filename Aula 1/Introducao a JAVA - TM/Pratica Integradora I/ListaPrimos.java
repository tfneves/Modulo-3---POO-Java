import java.util.Scanner;

public class ListaPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        for(int i=m; i>=2; i--){
            boolean isPrimo = true;

            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrimo = false;
                    break;
                }
            }
            if(isPrimo) System.out.println(i);
        }
        scan.close();
    }
}
