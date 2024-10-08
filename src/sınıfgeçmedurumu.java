import java.util.Scanner;

public class sınıfgeçmedurumu {
public static void main(String[]args){
    int mat , fizik , türkçe , kimya , müzik ;

    Scanner inp = new Scanner(System.in);
    System.out.print("Matematik Notunuzu Giriniz : ");
    mat = inp.nextInt();
    System.out.print("Fizik Notunuzu Giriniz : ");
    fizik = inp.nextInt();
    System.out.print("Türkçe Notunuzu Giriniz : ");
    türkçe = inp.nextInt();
    System.out.print("Kimya Notunuzu Giriniz : ");
    kimya = inp.nextInt();
    System.out.print("Müzik Notunuzu Giriniz : ");
    müzik = inp.nextInt();

    double avarage =((mat+fizik+kimya+müzik+türkçe)/5);

if(avarage<55) {
    System.out.println("Sınıfta Kaldınız ");
}
    else{
        System.out.println("Tebrikler Sınıfı Geçtiniz ");
    }
System.out.print("Ortalamanız = "+avarage);





















}
}
