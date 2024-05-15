import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k, i = 1;
        System.out.print("Bir sayı giriniz : ");
        k = scan.nextInt();

//        for(int i = 1; i <= k; i *=2){
//            System.out.println(i);
//        }

        for (i = 1; i <= k; i *= 4) {
            System.out.println(i + " 4 üssü");
        }

        for (i = 1; i <= k; i *= 5) {
            System.out.println(i + " 5 üssü");
        }




    }
}