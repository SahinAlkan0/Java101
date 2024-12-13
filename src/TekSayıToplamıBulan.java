import java.util.Scanner;
public class TekSayıToplamıBulan {
public static void main(String[]args){
    Scanner input =new Scanner(System.in);
    int n,total =0;
    //Tek sayı bulan

    /*do {
        System.out.print("Sayı Giriniz : ");
        n= input.nextInt();
        if (n % 2 == 1){
            total += n ;
        }
    }while (n>0);
    System.out.print("Toplam : "+total);*/

    //Girilen sayılaın çift ve 4'e tam bölünenlerini toplayan

    do {
        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        if (n % 2 == 0 && n % 4 == 0){
            total += n;

        }

    }while (n%2==1);
System.out.print("Toplam : "+total);











}
}

