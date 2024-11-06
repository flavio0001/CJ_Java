package fundamentos;

public class Temporisador {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Temporisador: " + i);
            Thread.sleep(1000); // Pausa de 1 segundo entre cada número
        }
        System.out.println("Tempo esgotado!");
    }
}
