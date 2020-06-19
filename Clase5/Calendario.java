package ClasesJava.Clase5;

public class Calendario {
    
    //Está hecha de Días -> Date
    //Array de Dates
    private Date [] diaSemana = new Date [7];

    public Calendario (Date diaInicial){
        diaSemana[0]= diaInicial;
        //Domingo, Lunes, 
            //Lunes, Martes
        for (int i = 1; i< diaSemana.length; i++){
            //Llenamos los días de la semana diciendo:
            //El día i = el día de mañana del día anterior
            diaSemana[i] = diaSemana[i-1].nextDate();
        }
    }

    public void show (){
        //For each
        //  (tipoDeDato nombreTemporal : arrayVaARecorrer)
        //Mostramos la fecha de todos los días de la semana
        for (Date dia : diaSemana){
            dia.giveDay();
        }
    }
}