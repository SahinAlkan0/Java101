import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz = ");
        int n = inp.nextInt();

        for (int i = n; i > 0; i--) {
            for (int k = (n - i); k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = (2 * i - 2); l >= 0; l--) {
                System.out.print("*");

            }

        System.out.println(" ");
        }

    }
}
