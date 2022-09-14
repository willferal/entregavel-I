import java.util.Scanner;
public class contagemJAVA {
    
    Scanner scn = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;

    public void Contagem(){
        System.out.println("Quantidade de alunos: ");
        int n = scn.nextInt();

        while (i < n) {
            i = i + 1;
            System.out.println("Nota do aluno "+ i+ ": ");
            if (nota < 7) {
                cont = cont + 0;
            }else {
                cont = cont + 1;
            }

        }
        System.out.println("Sao "+ n+ " alunos e "+ cont+ " foram aprovados!");
    }
}
