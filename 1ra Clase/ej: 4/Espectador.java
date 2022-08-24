public class Espectador {
    private String nombre;
    private int edad;
    private int dineroQuePorta;

    /* Getters y Setters */
    public void setNombre(){this.nombre = nombre;}
    public String getNombre(){return nombre;}

    public void setEdad(){this.edad = edad}
    public int getEdad(){return edad;}

    public void setDineroQuePorta(){this.dineroQuePorta = dineroQuePorta}
    public int getDineroQuePorta(){return dineroQuePorta;}

    public void espectador1(){
        nombre = this.nombre;
        edad = this.edad;
        dineroQuePorta = this.dineroQuePorta;
    }
}
