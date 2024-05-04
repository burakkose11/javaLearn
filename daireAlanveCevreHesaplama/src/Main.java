import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360

         */



        int r;
        double pi = 3.14,alan,cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Girin : ");
        r = input.nextInt();

        alan = pi * r * r;
        System.out.println("Dairenin Alanı : " + alan);

        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi : " + cevre);


    }
}