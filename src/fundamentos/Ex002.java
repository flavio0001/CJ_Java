package fundamentos;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe nome e sobrenome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe a idade:");
        int idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println("Seja bem vindo"+nome+" você já pode fazer parte desta organização.");
        } else {
            System.out.println("Obrigado. é necessário ter ou ser maior que 18");
        }
    }
}
