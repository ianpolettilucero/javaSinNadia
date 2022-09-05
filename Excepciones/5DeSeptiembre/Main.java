/*  

  $$\   
$$$$ |  
\_$$ |  
  $$ |  
  $$ |  
  $$ |  
$$$$$$\ 
\______|
        

public class Main {
    public static void main(String[] args) {
        try{
            String nombre = null;
            System.out.println("El nombre es: " + nombre.length());
        }catch(ArrayIndexOutOfBoundsException exc){
            System.err.println("el nombre es invalido");
        }
    }
} 

*/

/* ------------------------------------------------------------------ */

/*  

 $$$$$$\  
$$  __$$\ 
\__/  $$ |
 $$$$$$  |
$$  ____/ 
$$ |      
$$$$$$$$\ 
\________|
          
         

public class Main {
    public static void main(String[] args) {
        String nombre = null;
        System.out.println("El nombre es: " + nombre.length());
        nombrar();
    }
}

*/

/* ------------------------------------------------------------------ */

/*

 $$$$$$\  
$$ ___$$\ 
\_/   $$ |
  $$$$$ / 
  \___$$\ 
$$\   $$ |
\$$$$$$  |
 \______/ 


public class Main {
    public static void main(String[] args) {
        String nombre = null;
        System.out.println("El nombre es: " + nombre.length());
        try {
            comprobarNombre(null);
        }catch (Exception e){
            System.out.println("error input field nombre vacio" + e);
        }
    }
}

*/

/* ------------------------------------------------------------------- */

/*

$$\   $$\ 
$$ |  $$ |
$$ |  $$ |
$$$$$$$$ |
\_____$$ |
      $$ |
      $$ |
      \__|
          

public class Main {
    public static void main(String[] args) { 
            String nombre = null;
            System.out.println("El nombre es: " + nombre.length());
        try{
           setNombre(nombre); <-- setter
        }catch(nombrePersonalizado e){
            e.getNombre();
            System.out.println("input field nombre sin argumento");
        }
        System.out.println("registrado correctamente");
    }
} 

*/

/* 5 en folder /alarmas/CantidadDeAlarmas.java && /alarmas/Excepcionparticular.java */

/* 

 $$$$$$\  
$$  __$$\ 
$$ /  \__|
$$$$$$$\  
$$  __$$\ 
$$ /  $$ |
 $$$$$$  |
 \______/ 

*/

/*

public class Main {
    public static void main(String[] args) { 
        try{
            componente.compar(*cantidad a comprar*)
        }catch(stock e){
            e.getStock();
            System.out.println("no hay stock de este producto"+producto);
        }
        System.out.println("añadido correctamente al carrito");
    }
} 

*/
/*

public class Main {
    public static void main(String[] args) { 
        try{
            producto.compar(*cantidad a comprar*)
        }catch(stock e){
            e.getStock();
            System.out.println("falta producto principal"+producto);
        }
        System.out.println("añadido correctamente al carrito");
    }
} 

 */

