

import java.util.Scanner;
/*
Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

 */
public class ucakBileti {
    public static void main(String[]args){

       int yas,tip,mesafe;
       double  tutar,toplamtutar,indtutar,indyas,indtip;
     Scanner input = new Scanner(System.in);
     System.out.print("Mesafeyi km cinsinden giriniz : ");
     mesafe = input.nextInt();

     System.out.print("Yaşınızı Giriniz : ");
     yas = input.nextInt();

     System.out.print("Yolculuk tipinizi seçiniz (1=> Tek yön , 2=> Gidiş-Dönüş) : ");
     tip = input.nextInt();


     if(yas>0 && mesafe>0 && (tip==1||tip==2) )
     {
     tutar=mesafe*0.10;

         if(yas<12)
         {
         indyas=tutar*0.50;
         indtutar=tutar-indyas;
         indtip= tip==2 ? indtutar* 0.20:0;
         toplamtutar=indtutar-indtip;
             System.out.print("Toplam Tutar :"+toplamtutar);
         }

         else if (yas<24)
         {
             indyas=tutar*0.10;
             indtutar=tutar-indyas;
             indtip= tip==2 ? indtutar* 0.20:0;
             toplamtutar=indtutar-indtip;
             System.out.print("Toplam Tutar :"+toplamtutar);
         }
          else if (yas>65)
          {
              indyas=tutar*0.3;
              indtutar=tutar-indyas;
              indtip= tip==2 ? indtutar* 0.2:0;
              toplamtutar=indtutar-indtip;
              System.out.print("Toplam Tutar :"+toplamtutar);
         }else{
              System.out.print("Hatalı giriş yapıldı");
         }






     }else{
         System.out.print("Hatalı giriş yapıldı");
     }



    }


}
