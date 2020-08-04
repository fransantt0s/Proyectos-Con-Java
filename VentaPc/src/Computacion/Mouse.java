package Computacion;

public class Mouse extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    public Mouse(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idRaton = ++contadorRatones;

    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Mouse.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + '}';
    }

}
