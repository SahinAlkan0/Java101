import java.util.Scanner;

public class MukemmelSayı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Mükemmel sayı bulan program");
        System.out.println("----------------------------------");
        System.out.print("Bir Sayı Giriniz = ");
        int sayı = inp.nextInt();

        for (int i = 1; i <= sayı; i++) {
            if (sayı % i == 0) {
                toplam += i;
            }


        }
        if (toplam == sayı){
          System.out.print("Girdiğiniz sayı bir mükemmel sayıdır ");
        }else{
            System.out.print("Girdiğiniz sayı bir mükemmel sayı değildir");
        }


    }
}
