import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */
        int k,i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        k = inp.nextInt();

        while(k >= i){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }


    }
}