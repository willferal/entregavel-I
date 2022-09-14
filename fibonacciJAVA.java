import java.util.Scanner;

public class fibonacciJAVA {
    Scanner scn = new Scanner(System.in);
    int n, a = 0, b = 1, i = 2;
    
    public void sequenciaFibo(){
        System.out.println("Numero de termos da sequencia: ");
        int n = scn.nextInt();

        while (i < n) {
            System.out.println(a+ ", "+ b+ ", ");
            a = a + b;
            b = a + b;
            i = i + 2;
        }

        if (i == n) {
            System.out.println(a+ ", "+ b);
        }else{
            System.out.println(a);
        }
    }
}
