package fundamentos;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[6];
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno: " + (i + 1));
            notas[i] = entrada.nextInt();
            soma += notas[i];
        }

        double media = soma / (double) notas.length;
    System.out.printf("A média das notas é: %.2f%n", media);

    entrada.close();
    }
}
