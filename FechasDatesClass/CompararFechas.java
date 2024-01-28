import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Como comparar fechas si una es mayor que otra o una despues o antes la otra
 *
 */

public class CompararFechas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat custom = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyy-MM-dd' ");
        try {
            Date fecha = custom.parse(sc.next());



            //pintamos al fecha
            System.out.println("fecha ==>".concat(String.valueOf(fecha)));
            
            //como se haria la tranformacion
            System.out.println("personalizacion ==>" + custom.format(fecha));

            //vamos a tener otra fecha para ña fecha actual 
            Date fecha2 = new Date();

            //vamos a comparar las fechas con el metodo after 
            //entonces si la feha es mayor o despues que fecha2
            if (fecha2.after(fecha)) {
                
                //vamos a imprimir fecha1 o del usuario 
                System.out.println("Fecha del usuario es después o mayor que la fecha actual");
            //puede ser anterioir o menor que la fecha actual 
            }else if(fecha.before(fecha2)){
                System.out.println("fecha es anteroir a fecha2 ");

                //podrian ser iguales
            }else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha 2");
            }


        } catch (ParseException e) {
            e.printStackTrace();

        }

    }

}
