package ej4;
import java.util.Random;
import java.lang.Math;

public class Sala {
    private String pelicula;
    private int precio;
    private int fila;
    private char columna;

    /* getters y setters */
    public void setPelicula(){this.pelicula = pelicula;}
    public String getPelicula(){return pelicula;}

    public void setPrecio(){this.pelicula = pelicula;}
    public int getPrecio(){return precio;}

    public void setFila(){this.fila = fila;}
    public int getFila(){return fila;}

    public void setColumna(){this.columna = columna;}
    public char getColumna(){return columna;}

    public void sala(){
        pelicula = this.pelicula;
        precio = this.precio;
        fila = this.fila;
        columna = this.columna;
    }

    public static double genNumeroRandom(double fila){
        double x = Math.random();
        if(x >= 0 && x <= 4){
            fila = x;
        }
        return fila;
    }

    Random random = new Random();

    public void genLetraRandom(){
        char letra = (char) (random.nextInt(26) + 'a');
        if(columna != 'a' && columna != 'b' && columna != 'c' && columna != 'd' && columna != 'e' && columna != 'f' && columna != 'g' && columna != 'h' && columna != 'i'){
            columna = letra;
        }
    }    
} 
