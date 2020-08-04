
package Computacion;


public class Computadora {
    private int idComputadora;
    private double precio;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private int contadorComputadora;

    private Computadora(){
        this.idComputadora = ++contadorComputadora;
    }

    public Computadora(String nombre,double precio, Monitor monitor , Teclado teclado , Mouse mouse){
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.monitor = monitor;
        this.teclado = teclado ;
        this.mouse = mouse  ;

    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getContadorComputadora() {
        return contadorComputadora;
    }



    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + mouse + '}';
    }




}
