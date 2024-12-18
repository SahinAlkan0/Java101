import java.util.Scanner;

public class HarmonikSayıBulma {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Harmonik sayı bulma" );
        System.out.println("----------------------------");

        int n ;
        double result=0.0 ,i;

        System.out.println("Bir n değeri giriniz: ");
        n = inp.nextInt();

        for (i=1 ; i<=n ; i++){
            result += (1/i);
        }System.out.print("Sonuç: "+result);


    }
}
