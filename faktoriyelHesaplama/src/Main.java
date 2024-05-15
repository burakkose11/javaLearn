import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, total = 1, i = 1;
        Scanner sc = new Scanner(System.in);


        System.out.println("********** Faktöriyel Hesaplama ***********\n");

        System.out.print("Faktöriyel Sayısını Girin : ");
        k = sc.nextInt();

//        for (int i = 1; i <= k; i++) {
//            total = total * i;
//        }


        while (i <= k) {
            total = total * i;
            i++;
        }
        System.out.print(k + " sayısının faktöriyeli : " + total);

    }
}