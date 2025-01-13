import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz = ");
        int sayı = inp.nextInt();

        for (int i = sayı; i > 0; i--) {
            for (int k = (sayı - i); k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = (2 * i - 2); l >= 0; l--) {
                System.out.print("*");

            }

        System.out.println(" ");
        }

    }
}
