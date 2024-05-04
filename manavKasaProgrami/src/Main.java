import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Manav Kasa Programı
            Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

            Meyveler ve KG Fiyatları

            Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL
         */

        String paraBirimi = " TL";
        
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.println("MANAVA HOŞGELDİNİZ...\n");

        System.out.println("Ürünlerimiz : \n Armut : " + armut + paraBirimi + "\n Elma : " + elma + paraBirimi + "\n Domates : " + domates + paraBirimi + "\n Muz : " + muz + paraBirimi + "\n Patlican : " + patlican + paraBirimi );

        System.out.print("Armut Kaç Kilo ?  : ");
        double armutKg = inp.nextDouble();
        double armutToplam = armutKg * armut;

        System.out.print("Elma Kaç Kilo ?  : ");
        double elmaKg = inp.nextDouble();
        double elmaToplam = elmaKg * elma;

        System.out.print("Domates Kaç Kilo ?  : ");
        double domatesKg = inp.nextDouble();
        double domatesToplam = domatesKg * domates;

        System.out.print("Muz Kaç Kilo ?  : ");
        double muzKg = inp.nextDouble();
        double muzToplam = muzKg * muz;

        System.out.print("Patlıcan Kaç Kilo ?  : ");
        double patlicanKg = inp.nextDouble();
        double patlicanToplam = patlicanKg * patlican;

        double toplamTutar = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;

        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}