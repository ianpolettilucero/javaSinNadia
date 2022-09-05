public class ProductoFaltante extends Exception {
    public ComprobarProductos(String mensaje,bool faltanComponentes){
        /*super(mensaje); <- constructor*/
    }

    public ProductoFaltante(String msg){
        super(msg);
    }

    public void comprar(int producto)throws ProductoFaltante{
        if (this.producto == true){
            throw new ComprobarProductos("falta un producto principal");
        }
    }
}
