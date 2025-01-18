import java.util.Scanner;


public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik dersinden aldığınız notu girin =");
        int mat = input.nextInt();

        System.out.print("Fizik dersinden aldığınız notu girin =");
        int fizik = input.nextInt();


        System.out.print("Kimya dersinden aldığınız notu girin =");
        int kimya = input.nextInt();


        System.out.print("Türkçe dersinden aldığınız notu girin =");
        int turkce = input.nextInt();


        System.out.print("Tarih dersinden aldığınız notu girin =");
        int tarih = input.nextInt();


        System.out.print("Müzik dersinden aldığınız notu girin =");
        int muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuç = toplam / 6.0 ;
        System.out.println("Ortalama=" +sonuç);
        if(sonuç>60)
        {
            System.out.println("Sınıfı Geçtin");

        }
        else
            System.out.println("Sınıfta Kaldın");




    }
}
