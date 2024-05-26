import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sayi, min, max;


        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç sayı girmek istersiniz : ");
        number = sc.nextInt();
        System.out.print("1. sayıyı girin : ");
        sayi = sc.nextInt();

        min = sayi;
        max = sayi;

        for (int i = 2; number >= i; i++) {

            System.out.print(i + " . sayıyı girin : ");
            sayi = sc.nextInt();

            if (sayi < min) {
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("Minimum sayı : " + min);
        System.out.println("Maximum sayı : " + max);


//        for (int i = 0; i < number; i++) {
//            if (number < i) {
//                min = i;
//            } else {
//                max = i;
//            }
//        }
//
//        System.out.println(min);
//        System.out.println(max);


    }
}