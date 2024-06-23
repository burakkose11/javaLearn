import java.util.Scanner;

public class Main {

    static int minusNumber(int processValue) {

        if (processValue <= 0) return processValue;
        System.out.print(processValue + " ");


        return minusNumber(processValue - 5);
    }

    static void plusNumber(int processValue, int userInput) {

        if (userInput >= processValue) {
            System.out.print(processValue + " ");
            plusNumber(processValue + 5, userInput);
        }


    }


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int userInput = inp.nextInt();

        int processValue = minusNumber(userInput);

        plusNumber(processValue, userInput);


    }
}