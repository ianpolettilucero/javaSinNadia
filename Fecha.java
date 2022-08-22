package ej2;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    /* GETTERS Y SETTERS */
    /* ------------------------------------- */
    public int getDia(){return this.dia;}
    public void setDia(){this.dia = dia;}
    /* ------------------------------------- */
    public int getMes(){return this.mes;}
    public void setMes(){this.mes = mes;}
    /* ------------------------------------- */
    public int getAño(){return this.año;}
    public void setAño(){this.mes = mes;}
    /* ------------------------------------- */

    /* FECHA */
    /* ------------------------------------- */
    public Fecha(int dia1, int mes1, int año1){
        dia = dia1;
        mes = mes1;
        año = año1;
    }

    Fecha fecha1 = new Fecha(21,06,1987);

    /* DIA POSIBLE ? */
    public void diaCorrecto(){
        if(fecha1.dia >= 32){
            System.out.println("fecha invalida");
        }else{
            System.out.println("los dias respetan el calendario gregoriano");
        }
    }

    /* AÑO BISIESTO ? */
    public void añoBisiesto(){
        if ((fecha1.año % 4 == 0) && ((fecha1.año % 100 != 0) || (fecha1.año % 400 == 0))){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }

    /* DIAS SIGUIENTES */
    public void diaSiguiente(int diaIngresado, int siguienteDia, int contador){
        contador = 0;
        while (contador <= 10) {
            
            if(this.dia <= 31){
                siguienteDia = this.dia + 1;
                System.out.println("el siguiente dia es: " + siguienteDia);
            }else{
                siguienteDia = 0;
                this.mes = this.mes + 1;
            }

            if(this.mes >12){
                this.mes = 1;
                this.año = this.año + 1;
            }
            this.dia = this.dia + 1;
            contador = contador +1;

            System.out.println("dias siguientes: " + this.dia + this.mes + this.año );
        }
    }
}
