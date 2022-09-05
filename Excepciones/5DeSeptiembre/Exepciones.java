public class Exepciones {
    public static void nombrar() {
        try {
            if(nombre == null) {
                throw new IllegalArgumenExeption("el input field de nombre esta vacio");
            }
            System.out.println("nombre ingresado correctamente");
        }catch (IllegalArgumentException e){
            System.err.println(e);
        }    
    }
}