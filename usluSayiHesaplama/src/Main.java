import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, u, total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = inp.nextInt();

        System.out.print("Üs sayısını giriniz : ");
        u = inp.nextInt();

        for (int i = 1; i <= u; i++) {
            total *= n;
        }

        System.out.println(n + " in " + u + " üssü = " + total);


    }
}