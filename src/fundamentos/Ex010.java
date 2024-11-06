package fundamentos;

public class Ex010 {
    public static void main(String[] args) {
        int produto = 1;

        for (int i = 1; i <= 5; i++) {
            produto *= i;
            System.out.println("Produto parcial com i = " + i + ": " + produto);
        }

        System.out.println("Produto total de 1 a 5: " + produto);
    }
}
