import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;

        System.out.println("\n" + a + " + " + b + " = " + result + "\n");
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;

        System.out.println("\n" + a + " - " + b + " = " + result + "\n");
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;

        System.out.println("\n" + a + " * " + b + " = " + result + "\n");
        return result;
    }

    static int diveded(int a, int b) {
        int result = a / b;

        System.out.println("\n" + a + " / " + b + " = " + result + "\n");
        return result;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        System.out.println("--- Hesap Makinesi ---");
        String menu = "1 - Toplama\n" +
                "2 - Çıkarma\n" +
                "3 - Çarpma\n" +
                "4 - Bölme\n" +
                "5 - Üslü Sayı Hesaplama\n" +
                "6 - Faktoriyel Hesaplama\n" +
                "7 - Mod Alma\n" +
                "8 - Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "9 - Çıkış";

        while (true) {

            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayıyı girin : ");
            int a = input.nextInt();
            System.out.print("İkinci Sayıyı girin : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    diveded(a, b);
                    break;
            }
        }

        System.out.println("\nGüle Güle...");


    }
}