package ej3;
import java.lang.Math;

public class Mate {
    private int a;
    private int b;
    private int c;

    public int getA(){return a;}
    public void setA(){this.a = a;}

    public int getB(){return b;}
    public void setB(){this.b = b;}

    public int getC(){return c;}
    public void setC(){this.b = b;}

    public Mate(int a1, int b1, int c1){
        a = a1;
        b = b1;
        c = c1;
    }

    public void menosB(){    
        if(a > 0 && b > 0 && c > 0){
            this.b = this.b * - 1;
        }
    }

    public void menosBMasmenos(){
        if(true){
            this.b + 
        }
    }
}
