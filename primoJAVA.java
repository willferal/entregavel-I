import java.util.Scanner;

public class primoJAVA {
    Scanner scn = new Scanner(System.in);
    int numero, contPrimo = 0, i = 1;
    
    public void primo(){
        System.out.println("Digite um numero: ");
        int numero = scn.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contPrimo = contPrimo + 1;
            }
        }

        if (contPrimo != 2) {
            System.out.println("Nao eh primo!");
        }else{
            System.out.println("Eh primo!");
        }
    }
}