import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {

        int yildiz;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıldız sayısını girin : ");
        yildiz = inp.nextInt();


        for (int i = 1; i <= yildiz; i++) {

            for (int k = 1; k <= yildiz - i; k++) {
                System.out.print(" ");
            }

            for (int y = 1; y <= (i * 2) - 1; y++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}