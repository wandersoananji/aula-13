public class NumerosController {
    private NumerosModel modelo;

    public NumerosController(NumerosModel modelo) {
        this.modelo = modelo;
    }

    public void adicionarNumero(int numero) {
        modelo.adicionarNumero(numero);
    }

    public boolean buscarNumero(int numero) {
        return modelo.buscarNumero(numero);
    }
}