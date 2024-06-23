import java.util.Scanner;

public class Main {

    static boolean isPrime(int a) {

        if (a <= 1) {
            return false;
        }

        if (a == 2) {
            return true;
        }

        if (a % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= a/2; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("----Asal Kontrol----");

        System.out.print("Bir sayı girin : ");
        int a = inp.nextInt();

        boolean sonuc = isPrime(a);

        String result = sonuc ? " Asaldır" : " Asal değildir";

        System.out.println(a + result);


        isPrime(a);

    }
}