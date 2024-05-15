import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            k = scan.nextInt();
            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }
        } while (k > 0);

        System.out.print("Çift ve 4'ün katları olan sayılarım toplamı = " + total);

    }
}