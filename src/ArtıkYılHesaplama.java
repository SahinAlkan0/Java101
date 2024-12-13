import java.time.Year;
import java.util.Scanner;

public class ArtıkYılHesaplama {
public static void main(String[]args){

    int year;

    Scanner input = new Scanner(System.in);
    System.out.print("Yılı Giriniz : ");
    year = input.nextInt();
    boolean artıkyıl = (year % 4 == 0 && year % 100 != 0)||(year%400==0);


    if(artıkyıl){
        System.out.print("Girdiğiniz Yıl Bir Artık Yıldır");{
        }
    }    else {
        System.out.print("Girdiğiniz Yıl Bir Artık Yıl Değildir");
         }





}
}
