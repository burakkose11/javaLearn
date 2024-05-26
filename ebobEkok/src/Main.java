import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EKOK

        Scanner inp = new Scanner(System.in);
        int n1, n2, ebob = 0, ekok = 0;

        System.out.print("N1 sayısı : ");
        n1 = inp.nextInt();
        System.out.print("N2 sayısı : ");
        n2 = inp.nextInt();


        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println(ekok);
                break;
            }
        }


        // EBOB

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }

        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
        }


        System.out.println((n1 * n2) / ebob);


    }
}