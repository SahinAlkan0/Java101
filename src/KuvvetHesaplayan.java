import java.util.Scanner;
public class KuvvetHesaplayan {
public static void main(String[]args){
    int i,n;
    Scanner input = new Scanner(System.in);

    System.out.print("Sınır Sayısını Giriniz: ");
    n = input.nextInt();
    System.out.println("1'den girilen sayıya kadar 4'ün katları olan sayılar: ");
    for (i=1;i<=n;i *= 4){
     System.out.println(i);
    }
System.out.println("-------------------------------------");
    System.out.println("1'den girilen sayıya kadar 5'ün katları olan sayılar: ");
    for (i = 1 ; i<= n ; i *= 5 ){
        System.out.println(i);
    }
}
}
