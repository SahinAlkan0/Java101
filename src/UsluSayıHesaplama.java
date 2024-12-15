import java.util.Scanner;
public class UsluSayıHesaplama {
public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    int i , total = 1 ;
    int n,r ;
    System.out.print("Üssü alınacak sayıyı giriniz: ");
    n = inp.nextInt();
    System.out.print("Üs olacak sayıyı giriniz: ");
    r = inp.nextInt();

    for (i=1 ; i<=r ; i++ ){
        total *= n;

    }
    System.out.println("Sonuç: "+total);

}
}
