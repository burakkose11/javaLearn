import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int number, total = 0, select;


        System.out.print("Bir sayı girin : ");
        number = inp.nextInt();


        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }

        }

        if (total == number) {
            System.out.println(number + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " Mükemmel bir sayı değildir.");
        }


    }
}