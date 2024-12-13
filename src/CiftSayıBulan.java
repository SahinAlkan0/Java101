import java.util.Scanner;
public class CiftSayıBulan {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
    int k;
    System.out.print("Sayıyı Giriniz : ");
    k= input.nextInt();

// Cift sayı bulan program
for(int i=0 ; i<=k; i++){
    if (i%2==0) {
        System.out.println(i);
    }
}
//3 ve 4'e tam bölünen sayıların ortalamasını bulma
          int toplam=0 , adet=0;

          for(int i=0 ; i<=k ; i++){
              if (i % 4 ==0 && i % 3 ==0 ) {
                  toplam  += i;
                  adet ++;
              }
          }


          double ortalama = toplam/adet;
          System.out.print("0'dan girdiğiniz değere kadar olan sayıların 3 ve 4'e tam bölünenlerin ortalaması : "+ortalama);



}
}
