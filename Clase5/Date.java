package ClasesJava.Clase5;

public class Date{
    
    //Atibutos de date, son privados, recuerden, encapsulación (meter todo en una caja negra)
    private int dia;
    private int mes;
    private int year;
    // Relacionamos los días meses del mes, y los días del mes basados en su posición
    String [] months = {"Jan", "Feb", "March", "May", "April", "June", "July", "Sep", "Aug", "Oct", "Nov", "Dec"};
    int [] diasEnElMes={31,  28,     31,         30,    31,      30,     31,    31,    30,    31,    30,    31};
    
    //Constructor
    public Date(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public void giveDay(){
        System.out.println(dia + "/" + mes + "/" + year);
    }

    public void giveDate(){
        System.out.println(mes + "/" + dia + "/" + year);
    }

    //Método si no relacionamos las posiciones y los meses
    //By: @Rafa
    //Este método no nos regresa algo :(
    public void nextDayOriginal(){

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia < 31){
                System.out.println((dia ++) + "/" + mes + "/" + year);
            }
            else{
                System.out.println( 1 + "/" + mes ++ + "/" + year);
            }
        }
        else if (mes == 2){
            if(dia < 28){
                System.out.println((dia++) + "/" + mes + "/" + year);   
            }
            else{
                System.out.println(1 + "/" + (mes++) + "/" + year);
            }            
        }
        else {
            if (dia < 30){
                System.out.println((dia++)+ "/" + mes + "/" + year);
            }
            else{
                System.out.println(1 + "/" + (mes++) + "/" + year);
            }
        }
    }
    
    //Método para mostrar el día de mañana
    //Ya haciendo uso de los arrays
    public void nextDay (){
        //DD/MM/YYYY
        //Le sumamos 1 a mi día:
        dia++;
        int diasEnMes = diasEnElMes[mes-1];
        if (dia > diasEnMes){
            mes++;
            dia = 1;
        }
        if (mes > 12){
            year++;
            mes = 1;
        }
        System.out.print(dia + "/"+ mes + "/" + year);
    }

    //Programa que te regresa un Date
    //El tipo de dato date, está definido por el programador
        // Recuerden, una clase es un tipo de dato
    public Date nextDate(){
        int diaT = dia+1;
        int mesT = mes;
        int diasEnMes = diasEnElMes[mes-1];
        if (diaT > diasEnMes){
            mesT++;
            diaT = 1;
        }
        if (mesT > 12){
            year++;
            mesT = 1;
        }
        //Como se regresa el objeto, tenemos que construirlo
        return new Date (diaT, mesT, year);
    }   
    
    
}