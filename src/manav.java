
import java.util.Scanner;

public class manav {
public static void main(String[]args){
    double  armut = 2.14 , elma =3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5 ,
            armutkg,elmakg,domateskg,muzkg, patlıcankg , toplamtutar ,armuttutar , elmatutar ,
            domatestutar, muztutar,patlıcantutar;


    Scanner input = new Scanner(System.in);
System.out.print("Armut Miktarını Giriniz = ");
armutkg = input.nextDouble();
System.out.print("Elma Miktarını Giriniz = ");
elmakg = input.nextDouble();
System.out.print("Domates Miktarını Giriniz = ");
domateskg = input.nextDouble();
System.out.print("Muz Miktarını Giriniz = ");
muzkg = input.nextDouble();
System.out.print("Patlıcan Miktarını Giriniz = ");
patlıcankg =input.nextDouble();

armuttutar = armut*armutkg;
elmatutar= elma*elmakg;
domatestutar= domates*domateskg;
muztutar = muz*muzkg;
patlıcantutar = patlıcan*patlıcankg;

toplamtutar = armuttutar+elmatutar+domatestutar+muztutar+patlıcantutar;

System.out.print("Toplam Tutar = "+toplamtutar);










}
}

