import java.util.Scanner;

public class mdcJAVA {
    Scanner scn = new Scanner(System.in);
    int num1, num2, restoDiv;

    public int mdc(){
        System.out.println("Digite o primeiro numero: ");
        int num1 = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scn.nextInt();

        do {
            restoDiv = num1 % num2;
            num1 = num2;
            num2 = restoDiv;
        } while (restoDiv != 0);
        
        return num1;
    }
}
