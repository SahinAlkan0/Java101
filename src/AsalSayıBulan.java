import java.util.Scanner;

public class AsalSayıBulan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            int adet = 0;

            for (int k = 1; k <= i; k++) {
                if (i % k == 0)
                    adet++;
            }
            if (adet <= 2)

                System.out.print(i + " ");
        }


    }
}
