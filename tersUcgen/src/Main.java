import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıldız sayısınız girin : ");
        int n = inp.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < (2 * (n - i)) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}