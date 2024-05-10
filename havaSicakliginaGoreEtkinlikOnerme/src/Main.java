import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Koşullar :

            Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
            Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
            Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
            Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

            Ödev
            Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Kaç Derece : ");
        int heat = input.nextInt();

        System.out.println("Hava şuan " + heat + " derece");

        if (heat > 25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
        } else if (heat > 5) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}