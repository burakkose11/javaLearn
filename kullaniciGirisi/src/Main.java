import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        String karar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("burak") && password.equals("123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Hatalı Giriş !");
            System.out.println("Şifrenizi sıfırlamak isterseniz 1e basın\nÇıkmak için 2ye basın");
            karar = inp.nextLine();
            if (karar.equals("1")) {
                System.out.print("Yeni şifrenizi girin : ");
                newPassword = inp.nextLine();
                if (newPassword.equals("123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz...");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else if (karar.equals("2")) {
                System.out.println("Çıkış yapıldı...");
            } else {
                System.out.println("Hatalı tuşlama yaptınız...");
            }
        }


    }
}