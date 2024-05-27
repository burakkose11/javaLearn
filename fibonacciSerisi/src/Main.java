import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Fibonacci sayısını girin : ");
        int n = sc.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam = 0;

        // fibonacci : 0,1,1,2,3,5,8

        for (int i = 0; i < n; i++) {
            System.out.print(s1 + " , ");

            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;

        }


    }
}