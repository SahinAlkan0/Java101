

import java.util.Scanner;
public class daire {
   public static void main(String[]args){
double pisayısı = 3.14 , r , alan , daireacı ;


Scanner input = new Scanner(System.in);
System.out.print("Açıyı Giriniz = ");
daireacı = input.nextDouble();
System.out.print("Çapı Giriniz = ");
r = input.nextDouble();

alan = ((pisayısı * ( r * r) * daireacı) / 360);
System.out.print("Daire Diliminin Alanı = "+alan);









   }
}
