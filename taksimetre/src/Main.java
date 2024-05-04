import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        double mesafe,hesapla =10.0,kmBasi = 2.20;
        
        Scanner input = new Scanner(System.in);

        System.out.println("----- TAKSİMETRE -----");

        System.out.print("Mesafeyi Girin : ");
        mesafe = input.nextDouble();

        hesapla += mesafe * kmBasi;

        hesapla = (hesapla >= 20) ? hesapla : 20;

        System.out.println("Kilometre : " + mesafe + " KM ");
        System.out.println("KM başı ücret : " + kmBasi + " TL");
        System.out.println("Ödemeniz Gereken Ücret : " + hesapla + " TL");
    }
}