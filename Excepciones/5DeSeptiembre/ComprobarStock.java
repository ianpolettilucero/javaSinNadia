import java.lang.reflect.Executable;

public class ComprobarStock extends Exception {
    public ComprobarStock(bool hayStock){
        super();
    }

    public void comprar(int stock)throws ComprobarStock{
        if (this.componente <= stock && stock == 0){
            throw new ComprobarStock("no hay stock");
        }
    }
}
