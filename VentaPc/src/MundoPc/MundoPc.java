
package MundoPc;
import Computacion.*;
import Venta.*;


public class MundoPc {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 20);
        Teclado teclado1 = new Teclado("USB", "GX");
        Mouse mouse1 = new Mouse("usb", "tt");
        Computadora computadora1 = new Computadora("gamer", 20000, monitor1, teclado1, mouse1);
        Computadora computadora2 = new Computadora("gamer", 60000, monitor1, teclado1, mouse1);
        Orden orden1 = new Orden();
        orden1.AgregarComputadora(computadora1);
        orden1.AgregarComputadora(computadora2);
        orden1.mostrarOrden();


    }

}
