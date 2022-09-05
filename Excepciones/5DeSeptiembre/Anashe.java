public class Anashe extends Exception{

    public nombreExeption(String nombre){
        /*super(nombre);*/ /* herencia */
    }

    public void Anashe (string nombrePersonalizado)throws nombreExeption {
        if(nombre == null){
            throw new nombreExeption("input field nombre sin argumento");
        } else {
            nombre = "juan";
        }
    }
}
