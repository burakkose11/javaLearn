import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

            𝑢 = (a+b+c) / 2

            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        int a,b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("A kenarı Girin : ");
        a = input.nextInt();

        System.out.print("B kenarı Girin : ");
        b = input.nextInt();


        // karekök alma

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " + c);



    }
}