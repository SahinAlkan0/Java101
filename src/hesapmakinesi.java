import java.util.Scanner;


public class hesapmakinesi {
    public static void main(String[]args){

        int n1 , n2 , select ;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz = ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz = ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz = ");
        select = input.nextInt();

switch (select){

    case 1 :
        System.out.print("Toplam = "+(n1+n2));
        break;

    case 2 :
        System.out.print("Çıkarma = "+(n1-n2));
        break;

    case 3:
        System.out.print("Çarpma = "+(n1*n2));
        break;

    case 4 :
        switch (n2 = 0) {
            case 1 :
            System.out.print("Bölme = " + (n1 / n2));
            default:
                System.out.print("Bir Sayı 0'a Bölünmez !");
                break;
        }
        break;
    default:
        System.out.print("Geçerli Bir Sayı Giriniz !");
        break;














}



















    }
}
