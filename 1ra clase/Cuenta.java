public class Cuenta {
    private String nombre;
    private int numeroDeCuenta;
    private int tipoDeInteres;
    private int saldoDisponible;


    /* GETTERS Y SETTERS */
    /* ------------------------------------------ */

    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    /* ------------------------------------------ */

    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(){
        this.numeroDeCuenta = numeroDeCuenta;
    }

     /* ------------------------------------------ */

     public int getTipoDeInteres(){
        return tipoDeInteres;
    }
    public void setTipoDeInteres(){
        this.tipoDeInteres = tipoDeInteres;
    }

     /* ------------------------------------------ */

     public int getSaldoDisponible(){
        return numeroDeCuenta;
    }
    public void setSaldoDisponible(int nuevoSaldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    /* CUENTA POR DEFECTO */
    /* ------------------------------------------------------------------------------------------- */
    public Cuenta(){
        this.nombre = "juan";
        this.numeroDeCuenta = 10;
        this.tipoDeInteres = 2;
        this.saldoDisponible = 10000;

    }

    /* CUENTA FLEXIBLE */
    /* ------------------------------------------------------------------------------------------- */

    public Cuenta(String nombreCuenta, int numDeCuenta, int Interes, int dineroDisponible){
        nombre = nombreCuenta;
        numeroDeCuenta = numDeCuenta;
        tipoDeInteres = Interes;
        saldoDisponible = dineroDisponible;

    }

    /* INGRESAR DINERO */
    /* ------------------------------------------------------------------------------------------- */

    public void ingresarDinero(int dineroAIngresar){
        if(dineroAIngresar > 0){
            System.out.println("dinero ingresado con exito");
        }
    }

    /* EXTRAER DINERO */
    /* ------------------------------------------------------------------------------------------- */

    public void extraerDinero(int dineroAExtraer){
        if(dineroAExtraer > 0 && dineroAExtraer < this.saldoDisponible){
            System.out.println("dinero extraido con exito");
        }
    }

    /* ENVIAR / TRANSFERIR DINERO */
    /* ------------------------------------------------------------------------------------------- */

    public void transferirDinero(int dineroATransferir, int nuevoSaldoDisponible){
        if(dineroATransferir < this.saldoDisponible && dineroATransferir > 0){
            nuevoSaldoDisponible = this.saldoDisponible - dineroATransferir ;
            this.setSaldoDisponible(nuevoSaldoDisponible);
            System.out.println("dinero transferido con exito a" + this.nombre);
            System.out.println("nuevo saldo disponible =" + nuevoSaldoDisponible);
        }else{
            System.out.println("problema detectado, el importe" + dineroATransferir);
            System.out.println("inflinge las normas, esto puede ser devido a que:");
            System.out.println("1.El dinero a transferir es menor o igual a cero");
            System.out.println("2.El dinero a transferir supera el saldo actual");
        }
    }

    /*  RECIBIR DINERO */
    /* ------------------------------------------------------------------------------------------ */

    public void recibirDinero(int dineroARecibir, int nuevoSaldoDisponible2){
        if(dineroARecibir > 0){
            nuevoSaldoDisponible2 = this.saldoDisponible + dineroARecibir;
            this.setSaldoDisponible(nuevoSaldoDisponible2);
            System.out.println("dinero de " + this.nombre + "recibido con exito");
            System.out.println("dinero total recibido =" + dineroARecibir);
            System.out.println("muchas gracias");
        }else{
            System.out.println("problema detectado, el dinero a recibir es menor o igual a cero");
        }
    }

    
}