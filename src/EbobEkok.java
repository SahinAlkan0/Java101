import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ebob = 1, ekok , n1, n2, i = 1, k = 1;

        System.out.print("İlk Sayıyı Giriniz = ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz = ");
        n2 = inp.nextInt();
        System.out.println("---------------------------------------");
        if (n1 > n2) {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB = " + ebob);

        } else {
            while (k <= n1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;

                }
                k++;

            }
            System.out.println("EBOB = " + ebob);


        }
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK = " + ekok);


















    }
}
