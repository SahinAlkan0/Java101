import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, num, n, r, f, total = 1 ,factn = 1 , factr = 1 ,factf = 1 ;

        //Faktoriyel Hesaplayan Program n!
        System.out.print("Faktoriyelini Hesaplamak İstediğiniz Sayıyı Giriniz: ");
        num = inp.nextInt();

        for (i = 1; i <= num; i++) {

            total *= i;
        }
        System.out.println("Girdiğini Sayının Faktoriyeli: " + total);

        //Kombinasyon Formülü Hesaplayan C(n,r) = n! / (r! * (n-r)!)
        System.out.print("n değerini giriniz: ");
        n = inp.nextInt();
        System.out.print("r değerini giriniz: " );
        r = inp.nextInt();

        for (i = 1; i<= n ; i++){
            factn *= i ;
        }
        for (i=1;i<=r;i++){
            factr *= i;
        }
        for (f=(n-r);f>=1;f--){
            factf *= f;
            total= factn / (factr*factf);
        }

        System.out.println("Kombinasyon: "+total);

    }
}
