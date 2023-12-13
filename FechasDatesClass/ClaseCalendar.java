
/*Clase calñendario o clase clanedar de java para poder asignar una fecha en especifico ya sea en pasado ocfuruto
*
* */


import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {

    //entonces mandamso a llamra la clase calendar
    //esta clase es un poco particular no es como la mayoria que por ejemplo poriamos crear por ejemplo el objeto la instancia
    //con el operador new esta es una clase abstracta eso no quiere decir que no permite crear la instnacia completa con el
    //operador new por lo tanto no podemos hacer new de Calendar por que es abstracta por diseño es a si la instancia la maneja
    //por diseño es a si, la instnacia la maneja por debajo invocando el métod oestatico Calendar.getInstance() entonces
    //con este método invocamos la instnacia de calendar
    //todo lo que sea un metodo static simplemente se invocan con el metodo de la clase  no con el objeto no es necesrio hacer el new
    // Calendar.getInstance(); --> este método se encarga de crear el objeto clandar;
        Calendar calendario =  Calendar.getInstance();
    //podemos agregar fecha y podemos custumizar por ejemplo
        // calendario.set(2023,11,13,6,20,25); --> esta es una forma
//al final hacerlo con constantes nos retrona un entero con el valor
        calendario.set(2023,Calendar.DECEMBER,13,6,20,25); //--> podemos colocar el número a secas de forma estatica Calendar.


        //antes de imprmiri en consola hay que mostrar el formato de fecha que queremos
        Date fecha = calendario.getTime();

        System.out.println("calendario = " + fecha +"\n*******************otra forma***********************");





    }
}
