package negocio;

public interface ICatalogoPeliculas {
    //Definimos una constante.
    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarCatalogoPeliculas();
}
