import java.util.Scanner;

public class Pares{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n*2; i+=2){
            System.out.println(i);
        }
        scan.close();
    }
}