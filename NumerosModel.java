
import java.util.ArrayList;
import java.util.List;

public class NumerosModel {
    private List<Integer> numeros;

    public NumerosModel() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public boolean buscarNumero(int numero) {
        return numeros.contains(numero);
    }
}
