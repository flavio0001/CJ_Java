package fundamentos;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String aluno = entrada.nextLine();
        System.out.println("Digite a nota de português");
        int nota1 = entrada.nextInt();
        System.out.println("informe a nota de matemática: ");
        int nota2 = entrada.nextInt();
        System.out.println("Informe a nota de geografia: ");
        int nota3 = entrada.nextInt();
        var media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média de:"+aluno+" é:"+media);
    }
}