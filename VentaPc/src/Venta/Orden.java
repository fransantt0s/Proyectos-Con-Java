
package Venta;
import Computacion.*;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        // Inicializamos el arreglo con la cantidad de elementos que va a tener el arreglo
        //  En este caso va a contener el MAX_COMPUTADORAS = 10
        computadoras = new Computadora[MAX_COMPUTADORAS];

    }

    public void AgregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < this.MAX_COMPUTADORAS) {
            //Agregamos ++ al final porque se va a incrementar la variable la siguiente vez que se utlice.
            //Arranca en  0  pero cuando le agregamos un producto se incrementa y asi sucesivamente.
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de productos" + this.MAX_COMPUTADORAS);
        }

    }



    public double calcularTotal(){
        var total = 0;
        for (var i =0; i< this.contadorComputadoras; i++){
            Computadora computadora = this.computadoras[i];
            total += computadora.getPrecio();



        }
        return total;


    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("Total de la orden : $ " + totalOrden);
        System.out.println("Computadoras de la orden :");

        for (int i = 0; i <contadorComputadoras; i++){
            Computadora computadora = computadoras[i];
            System.out.println(computadora);
        }

    }

}
