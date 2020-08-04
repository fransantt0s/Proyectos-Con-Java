package datos;

import domain.Pelicula;
import Excepciones.*;

import java.util.ArrayList;
public interface IAccesoDatos {
    //Retorna si existe ese archivo en el disco duro.
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    //Retorna una lista de objetos de Tipo pelicula
    ArrayList <Pelicula> listar (String nombre) throws LecturaDatosEx;
    void escribir(Pelicula pelicula , String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    //Retorna un String si se encuentra la pelicula.
    String buscar (String nombreArchivo, String buscar) throws LecturaDatosEx;
    //Crear un archivo
    void crear(String nombreArchivo) throws  AccesoDatosEx;
    // Indicamos cual es el nombre del archivo que queremos borrar.
    void borrar(String nombreArchivo) throws  AccesoDatosEx;


}
