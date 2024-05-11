import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int customerDistance, customerAge, tripType;
        double distancePrice = 0.10, price;
        String currency = " TL";

        System.out.println("***** Uçak Bileti *****\n");

        System.out.print("Gideceğiniz mesafeyi Km cinsinden girin : ");
        customerDistance = input.nextInt();

        System.out.print("Yaşınızı girin : ");
        customerAge = input.nextInt();

        System.out.print("Tek Yön : 1\nÇift Yön : 2\n");
        tripType = input.nextInt();


        if (customerDistance < 1 || customerAge < 1 || tripType < 1 || tripType > 2) {
            System.out.print("Hatalı veri girdiniz!");
            return;
        } else {
            System.out.println("Teşekküler, size en uygun uçak bileti fiyatını bulmak için çalışıyoruz...");
        }

        // Fiyat Hesaplama
        price = distancePrice * customerDistance;

        // Yaş indirimi
        if (customerAge <= 12) {
            price = price / 2;
        } else if (customerAge < 25) {
            price *= 0.90;
        } else if (customerAge >= 65) {
            price *= 0.70;
        }

        // Gidiş - Dönüş indirimi
        if (tripType == 2) {
            price *= 2 * 0.8;
        }
        
        System.out.println("İndirimsiz fiyat : " + price + currency);
        System.out.println("İndirimli fiyat : " + price + currency);

    }
}