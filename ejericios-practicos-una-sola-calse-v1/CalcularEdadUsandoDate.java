/* ingresar una fecha de nacimiento en formato string, convertirla a una
 * fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadUsandoDate {
    public static void main(String[] args) throws ParseException {
    
        String IngresoFecha ;

        System.out.println(" Ingrese su fecha de nacimiento ");
        Scanner sc = new Scanner(System.in);
        IngresoFecha = sc.next();
       //uso de la clase Date para
        SimpleDateFormat personalizar = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaNac = personalizar.parse(IngresoFecha);

        System.out.println("Mi fecha de nacimiento= " + fechaNac);

        Date fechaActual = new Date();

        personalizar = new SimpleDateFormat("yyyyMMdd");
        Integer nacio = Integer.parseInt(personalizar.format(fechaNac));
        Integer actualemnte = Integer.parseInt(personalizar.format(fechaActual));

        int resultado =  (actualemnte - nacio) /10000;

        System.out.println("resultado = " + resultado);
        
        
    }

}
