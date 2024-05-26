import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, select, balance = 17500;
        Scanner inp = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanıcı adınızı girin : ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi girin : ");
            password = inp.nextLine();
            if (userName.equals("burak") && password.equals("123")) {
                System.out.println(userName.substring(0, 1).toUpperCase() + userName.substring(1) + " X bankasına hoşgeldin.");
                do {
                    System.out.println("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı girin : ");
                            int price = inp.nextInt();
                            if (price < 0) {
                                System.out.println("Yatırmak istediğiniz miktar 0 dan küçük olamaz !");
                            } else {
                                balance += price;
                                System.out.println("Yatırılan miktar : " + price);
                                System.out.println("Yeni bakiyeniz : " + balance);
                            }
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı girin : ");
                            price = inp.nextInt();
                            if (balance < price) {
                                System.out.println("Yetersiz Bakiye.");
                            } else if (price < 0) {
                                System.out.println("Çekmek istediğiniz miktar 0 dan küçük olamaz !");
                            } else {
                                balance -= price;
                                System.out.println("Çekilen tutar : " + price);
                                System.out.println("Kalan bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Yine bekleriz...");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya parola");
                System.out.println("Kalan hakkınız : " + right);
            }
        }


    }
}