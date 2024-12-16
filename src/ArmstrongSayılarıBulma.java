import java.util.Scanner;

public class ArmstrongSayılarıBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0, basVal = 0;
        int num;
        System.out.print("Sayıyı giriniz: ");
        num = inp.nextInt();

        while (num != 0) {
            total = (num % 10) +total;
            num /= 10;
            ++basVal;


        } System.out.print("Girdiğiniz sayının basamakları toplamı: "+total);


    }
}
