import java.util.Scanner;

public class userlogin {
public static void main(String[]args){

    String userName , password;

    Scanner inp = new Scanner(System.in);

    System.out.print("Kullanıcı Adınızı Giriniz : ");
    userName = inp.nextLine();
    System.out.print("Şifrenizi Giriniz : ");
    password = inp.nextLine();

    if(userName.equals("patika")&&password.equals("java123")) {
        System.out.print("Giriş Başarılı");
    }
        else {
        System.out.print("Hatalı kullanıcı Adı Veya Şifre");
    }






















}
}
