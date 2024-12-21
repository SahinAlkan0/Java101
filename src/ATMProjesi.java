import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 12750;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi Giriniz: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba , Kodluyoruz Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma \n"
                            + "2-Para Çekme \n"
                            + "3-Bakiye Sorgulama \n"
                            + "Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = inp.nextInt();

                    switch (select) {
                        case (1):
                            System.out.println("Yatırmak istediğiniz miktar: ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case (2):
                            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                            int withdrawal = inp.nextInt();
                            if (balance < withdrawal) {
                                System.out.println("Yetersiz Bakiye");

                            } else {
                                balance -= withdrawal;

                            }
                            break;
                        case (3):
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. Hoşçakalın");
                break;


            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }


        }


    }
}
