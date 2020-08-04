package negocio;

import Excepciones.AccesoDatosEx;
import Excepciones.LecturaDatosEx;
import datos.AccesoDatos;
import datos.IAccesoDatos;
import domain.Pelicula;

public class CatalogoPeliculas implements  ICatalogoPeliculas{
    private final IAccesoDatos datos;

        public CatalogoPeliculas(){
            this.datos = new AccesoDatos();
        }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula,NOMBRE_RECURSO,anexar);

        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Error de acceso a datos");
            accesoDatosEx.printStackTrace();

        }
    }

    @Override
    //Imprime la lista de peliculas, una por una
    public void listarPeliculas() {
        try {
            var peliculas =  this.datos.listar(NOMBRE_RECURSO);
            //Recorremos cada pelicula de esa lista y la vamos imprimiendo.
            for (Pelicula pelicula : peliculas){
                System.out.println("pelicula = " + pelicula);

            }
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Error en el acceso de datos");
            accesoDatosEx.printStackTrace();
        }

    }

    //Imprime la pelicula buscada
    @Override
    public void buscarPelicula(String buscar) {
            //Inicializamos un resultado.
            String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO,buscar);

        } catch (AccesoDatosEx AccesoDatosEx) {
            System.out.println("Error de acceso de datos");
            AccesoDatosEx.printStackTrace();
        }
        System.out.println("resultado = " + resultado);

    }

    @Override

    //Si ya existe lo que vamos a hacer es borrarlo y crearlo de nuevo, sino existe solo creamos
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }
            else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx accesoDatosEx) {
            System.out.println("Error al iniciar catalogo de peliculas");
            accesoDatosEx.printStackTrace();
        }

    }
}
