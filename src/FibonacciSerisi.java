import java.util.Scanner;
public class FibonacciSerisi {
public static void main(String[]args){
    Scanner inp = new Scanner(System.in);

    int n0 = 0, n1 = 1, n , nbr ;

    System.out.print("Fibonacci sayı adetini giriniz = ");
    n = inp.nextInt();

    for (int i = 1; i < n; i++) {
        nbr = n1;
        n1 = n1+n0;
        n0 = nbr;
        System.out.println(n0 + "+" + n1 + "=" + (n0+n1));

    }

}
}
