import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int number, basamakSayisi = 0;
        number = input.nextInt();

        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow = 1;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }

        if (number == result) {
            System.out.println(result + " armstrong bir sayıdır. ");
        } else {
            System.out.println(result + " armstrong bir sayı değildir. ");
        }

    }
}