import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Vücut Kitle İndeksi Hesaplama

            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
            Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

            Formül
            Kilo (kg) / Boy(m) * Boy(m)
         */

        double boy,hesaplama;
        int kilo;


        Scanner input = new Scanner(System.in);

        System.out.println("Vücut Kitle İndeksi Hesaplama Programına Hoşgeldiniz");
        System.out.print("Lütfen Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextInt();
        
        hesaplama = kilo / (boy * boy);

        System.out.println("Vücüt Kitle İndeksiniz : " + hesaplama);


    }

}