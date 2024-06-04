import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumerosModel modelo = new NumerosModel();
        NumerosController controller = new NumerosController(modelo);
        NumerosView view = new NumerosView(scanner);

    
        for (int i = 1; i <= 10; i++) {
            controller.adicionarNumero(i);
        }

        int numeroBusca = view.obterNumero();
        boolean encontrado = controller.buscarNumero(numeroBusca);
        view.mostrarResultadoBusca(encontrado);

        scanner.close();
    }
}