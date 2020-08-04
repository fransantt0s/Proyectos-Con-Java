package presentacion;

import negocio.CatalogoPeliculas;
import negocio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPelisPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculas();

        while(opcion != 0){
            System.out.println("Elige una opcion : \n"
                + "1. Iniciar Catalogo de peliculas \n"
                + "2. Agregar Pelicula \n"
                + "3. Listar Pelciulas \n"
                + "4. Buscar peliicula \n"
                + "0. Salir");
                // Llamamos a la opcion y la convertimos a un entero.
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula que quieres agregar");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula que quieres buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0 :
                    System.out.println("Hasta pronto, gracias por utlizar la aplicacion");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;

            }

        }
    }
}
