public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinimaPermitida;
    private String director;

    /* Getters y Setters */
    public void setTitulo(){this.titulo = titulo;}
    public String getTitulo(){return titulo;}

    public void setDuracion(){this.duracion = duracion;}
    public int getDuracion(){return duracion;}

    public void setEdadMinimaPermitida(){this.edadMinimaPermitida = edadMinimaPermitida;}
    public int getEdadMinimaPermitida(){return edadMinimaPermitida;}

    public void setDirector(){this.director = director;}
    public String getDirector(){return director;}
    public void pelicula1(){
        titulo = this.titulo;
        duracion = this.duracion;
        edadMinimaPermitida = this.edadMinimaPermitida;
    }
}
