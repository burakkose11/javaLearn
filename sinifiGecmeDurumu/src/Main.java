import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

            Geçme Notu : 55

            Ödev
            Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuzu girin : ");
        mat = input.nextInt();

        if(mat < 0 || mat > 100){
            System.out.print("Notunuz 0 dan küçük 100'den büyük olamaz !");
            return;
        }

        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        if(fizik < 0 || fizik > 100){
            System.out.print("Notunuz 0 dan küçük 100'den büyük olamaz !");
            return;
        }

        System.out.print("Türkçe notunuzu girin : ");
        turkce = input.nextInt();

        if(turkce < 0 || turkce > 100){
            System.out.print("Notunuz 0 dan küçük 100'den büyük olamaz !");
            return;
        }

        System.out.print("Kimya notunuzu girin : ");
        kimya = input.nextInt();

        if(kimya < 0 || kimya > 100){
            System.out.print("Notunuz 0 dan küçük 100'den büyük olamaz !");
            return;
        }

        System.out.print("Müzik notunuzu girin : ");
        muzik = input.nextInt();

        if(muzik < 0 || muzik > 100){
            System.out.print("Notunuz 0 dan küçük 100'den büyük olamaz !");
            return;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;

        if(average < 55){
            System.out.println("Kaldınız, seneye tekrar bekleriz.");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }

        System.out.println("Notunuz : " + average);
    }
}