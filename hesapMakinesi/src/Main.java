import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("----- Hesap Makinesi -----");

        System.out.print("Lütfen İlk Sayıyı Girin : ");
        number1 = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Girin : ");
        number2 = input.nextInt();

        System.out.println("İşlemler : \n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        select = input.nextInt();
        
        switch (select) {
            case 1:
                System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.print(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.print(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                if (number2 <= 0) {
                    System.out.print("Bir sayı 0'a bölünemez !");
                } else {
                    System.out.print(number1 + " / " + number2 + " = " + (number1 / number2));
                }
                break;
            default:
                System.out.print("Hatalı İşlem");
        }
    }
}