import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        // Scanner tanımlandı
        Scanner input = new Scanner(System.in);


        // Kullanıcıdan fiyat alma
        System.out.print("Fiyatı Giriniz : ");
        double fiyat = input.nextDouble();
        System.out.println("KDV'siz Tutar : " + fiyat);

        // Kdv hesaplamak için true yada false olarak hesaplama yaptım. 0 ve 1000 lira arasındaysa true (KDV %18), false olursa KDV %8
        boolean kdvHesaplama = fiyat >= 0 && fiyat <= 1000;

        double kdvSonuc = kdvHesaplama ? fiyat * 0.18 : fiyat * 0.08;

        System.out.println("KDV Tutarı : " + kdvSonuc);

        // KDV oranını hesaplama
        String kdvTutari = kdvHesaplama ? "KDV Oranı : %18 " : "KDV Oranı : %8";
        System.out.println(kdvTutari);

        // KDV dahil fiyat hesaplama
        double kdvDahil = fiyat + kdvSonuc;
        System.out.println("KDV Dahil Fiyat : " + kdvDahil + "TL");

    }
}