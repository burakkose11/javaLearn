import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

                Koç Burcu : 21 Mart - 20 Nisan
                Boğa Burcu : 21 Nisan - 21 Mayıs
                İkizler Burcu : 22 Mayıs - 22 Haziran
                Yengeç Burcu : 23 Haziran - 22 Temmuz
                Aslan Burcu : 23 Temmuz - 22 Ağustos
                Başak Burcu : 23 Ağustos - 22 Eylül
                Terazi Burcu : 23 Eylül - 22 Ekim
                Akrep Burcu : 23 Ekim - 21 Kasım
                Yay Burcu : 22 Kasım - 21 Aralık
                Oğlak Burcu : 22 Aralık - 21 Ocak
                Kova Burcu : 22 Ocak - 19 Şubat
                Balık Burcu : 20 Şubat - 20 Mart

            Ödev
                Aynı örneği switch-case kullanmadan yapınız.
         */

        int mounth, day;
        String horoscope = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğdunuz ayı girin : ");

        mounth = inp.nextInt();


        // girilen ayın geçerli bir aralıkta olup olmadığını kontrol ediyorum.
        if (mounth < 1 || mounth > 12) {
            System.out.println("Geçersiz bir ay girdiniz.");
            return;
        }

        System.out.print("Doğduğunuz günü girin : ");
        day = inp.nextInt();

        if (mounth == 1) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 21) {
                horoscope = "Kova";
            } else {
                horoscope = "Oğlak";
            }
        } else if (mounth == 2) {
            if (day < 1 || day > 28) {
                isError = true;
            } else if (day > 19) {
                horoscope = "Balık";
            } else {
                horoscope = "Kova";
            }
        } else if (mounth == 3) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 20) {
                horoscope = "Koç";
            } else {
                horoscope = "Balık";
            }
        } else if (mounth == 4) {
            if (day < 1 || day > 30) {
                isError = true;
            } else if (day > 20) {
                horoscope = "Boğa";
            } else {
                horoscope = "Koç";
            }
        } else if (mounth == 5) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 21) {
                horoscope = "İkizler";
            } else {
                horoscope = "Boğa";
            }
        } else if (mounth == 6) {
            if (day < 1 || day > 30) {
                isError = true;
            } else if (day > 22) {
                horoscope = "Yengeç";
            } else {
                horoscope = "İkizler";
            }
        } else if (mounth == 7) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 22) {
                horoscope = "Aslan";
            } else {
                horoscope = "Yengeç";
            }
        } else if (mounth == 8) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 22) {
                horoscope = "Başak";
            } else {
                horoscope = "Aslan";
            }
        } else if (mounth == 9) {
            if (day < 1 || day > 30) {
                isError = true;
            } else if (day > 22) {
                horoscope = "Terazi";
            } else {
                horoscope = "Başak";
            }
        } else if (mounth == 10) {
            if (day < 1 || day > 31) {
                isError = true;
            } else if (day > 22) {
                horoscope = "Akrep";
            } else {
                horoscope = "Terazi";
            }
        } else if (mounth == 11) {
            if (day < 1 || day > 30) {
                isError = true;
            } else if (day > 21) {
                horoscope = "Yay";
            } else {
                horoscope = "Akrep";
            }
        } else {
            if (day < 1 || day > 30) {
                isError = true;
            } else if (day > 21) {
                horoscope = "Oğlak";
            } else {
                horoscope = "Yay";
            }
        }


        if (isError) {
            System.out.print("Bir şeyler yanlış gitti...");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }


    }
}