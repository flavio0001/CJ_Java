package fundamentos;

public class Ex009 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            if (i == 5) {
                System.out.println("parando a contagem em: " + i);
                break;
            }
            System.out.println(i);
        }
    }
}
