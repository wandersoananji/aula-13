import java.util.Scanner;

public class NumerosView {
    private Scanner scanner;

    public NumerosView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int obterNumero() {
        System.out.println("Digite um número:");
        return scanner.nextInt();
    }

    public void mostrarResultadoBusca(boolean encontrado) {
        if (encontrado) {
            System.out.println("O número foi encontrado.");
        } else {
            System.out.println("O número não foi encontrado.");
        }
    }
}