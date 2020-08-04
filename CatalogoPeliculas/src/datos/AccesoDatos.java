package datos;

import Excepciones.AccesoDatosEx;
import Excepciones.EscrituraDatosEx;
import Excepciones.LecturaDatosEx;
import domain.Pelicula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos  implements IAccesoDatos{
    @Override
    public boolean existe(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        // este meotodo retorna verdadero si existe este archivo y falso si no existe.
        return archivo.exists();
    }

    @Override
    public ArrayList<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre);
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea!= null){
                //Creamos la pelicula utilizando la linea como el nombre de la pelicula,
                    // cada linea que leemos es un nombre de pelicula.
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                //Avanzamos de linea
                linea = entrada.readLine();
            }
            //Despues de recorrer todas las lineas, cerramos el flujo.
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + e.getMessage());
        }
        return  peliculas;


    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo  = new File(nombreArchivo);
        PrintWriter salida = null;
        try {
            //Con anexar indicamos si se va a agregar informacionn o no
            salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir Peliculas:" + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //La linea que leemos "en este caso vendria a ser el nombre de la pelicula"
            String linea = null;
            //Inicializamos un indice
            int i = 0;
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " encontrada en indice " + i;
                    //Agregamos un break, en caso de que si la encuentra se rompa este ciclo while.
                    break;
                }
                //En caso de que  no se haya encontrado, leemos la prox linea e incrementamos el indice.
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula:" + ex.getMessage());
        }
        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            //Despues de crear el archivo cerramos el flujo
            salida.close();
            System.out.println("Se ha creado el archivo");
        }
        catch (IOException ex){
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo: " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo)  {
        File archivo = new File(nombreArchivo);
        //Comprobamos que el archivo exista
        if (archivo.exists()){
            archivo.delete();
            System.out.println("Se ha borrado el archivo correctamente");

        }

    }



}
