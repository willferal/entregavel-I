
import java.util.Scanner;
public class contagemJAVA {
    
    Scanner scn = new Scanner(System.in);
    int n, cont = 1, i = 1;

    public void Contagem(){
        System.out.println("Digite um numero: ");
        int n = scn.nextInt();
        System.out.println("1");

        while (i < n) {
            i++;
            cont = cont + 1;
            System.out.println(", "+ cont);
        }
    }
}