package fundamentos;

public class Ex006 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            soma += i;
            System.out.println("Soma parcial com i = " + i + ": " + soma);
        }

        System.out.println("Soma total de 1 a 20: " + soma);
    }
}
