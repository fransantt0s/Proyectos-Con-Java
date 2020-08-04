package Computacion;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idTeclado = ++contadorTeclados;

    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }

}
