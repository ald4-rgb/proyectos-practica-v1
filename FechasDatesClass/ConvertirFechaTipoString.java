
/*La idea es convertir un String en un formato de fecha convertir este String en un oibjeto
 * Date  en un objeto fecha  y este objeto nos permite asignar una fecha en especifico 
 * pero a travez de una cadena de un String que incluya la fecha completa por ejemplo 
 * el año mes y día.
 * como si ingresaramos la fecha en un formulario podemos ingresar la fecha escrita con 
 * -,/ etc 
 * Vamos manejar la fecha con le formato que queramos recibir
 * de todos modos es con SimpleDateformat y el método parse();
 * parse() --> recibe este String lo analiza y lo conveirte al objeto Date de java.uitl
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirFechaTipoString {
    public static void main(String[] args) {

    //entonces comenzamos con objeto SimpleDateFormat tenemos que identificar el patron con el 
    //cual lo vamos a analizar este patron se tiene que respetar es decir la fecha que ingresemos com0
    //usuario con el teclado por ejemplo ya sea con la clase Scanner o con la ventana de dialogo 
    //atravez dedl jOptionPane de cualquier forma incluso un formulario web html de cualquier forma 
    //que ingresemos cualquier fecha tiene que tener este patron que vamos a colocar que vamos a
    //configurar por ejemplo el año el dia y el mes entonces vamos a recibir este patron de fecha 
    //yyyy-MM-dd
        SimpleDateFormat custom = new SimpleDateFormat("yyyy-MM-dd");
    
    //entonces DAte fecha ahora con  custom, atravez de objeto custom vamos a obtener 
    //la fecha con el metodo parse custom.parse(null); y recibe un String
     //este metodo nos pide manejar Exceptions try y catch de forma obligatoria
     // por que puede que ingresemos una fecha incorrecta entonces va a lanzar una Exception
     //nos pide un try{..} catch(Exception e){...}
    try{
        Date fecha  = custom.parse("2023-12-31");
        //si todo sale bien vamos a imprimir la fecha
        System.out.println("fecha ==>"+fecha);
        //fecha con formato
        //rescordemos custom.format(DATE)
        System.out.println("personalizacion ==>" +custom.format(fecha));    
    } catch(ParseException e){
        e.printStackTrace();


    }   
     

        



    }



}
