import java.util.Scanner;

public class somatorioJAVA {
    Scanner scn = new Scanner(System.in);
    int n, num, soma = 0, i = 0;

    public void somaNumeros(){
        System.out.println("Quantos sao os numeros a serem somados: ");
        int n = scn.nextInt();
        while (i <= n) {
            num = scn.nextInt();
            soma = soma + num;
            i++;
        }

        System.out.println("A soma dos numero e : "+ soma);

    }
}
