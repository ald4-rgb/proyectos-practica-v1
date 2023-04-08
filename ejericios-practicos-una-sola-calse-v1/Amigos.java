import java.util.Scanner;


    /*
    * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

    *   Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

    *Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

    * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe
    * */

public class Amigos {

    public static void main(String[] args) {


        String nombreAmigo = "Chubaldo";

        String cambio = nombreAmigo.toUpperCase().charAt(2) + ".".concat(nombreAmigo.substring(nombreAmigo.length() - 2));

        String nombreAmigo2 = "Erick";

        String cambio2 = nombreAmigo2.toUpperCase().charAt(2) + ".".concat(nombreAmigo2.substring(nombreAmigo2.length() - 2));

        String nombreAmigo3 = "Alan";

        String cambio3 = nombreAmigo3.toUpperCase().charAt(2) + ".".concat(nombreAmigo3.substring(nombreAmigo3.length() - 2)) ;

        System.out.println(cambio.concat("_").concat("\n").concat(cambio2.concat("_")).concat("\n".concat(cambio3.concat("_")))   );


    }

}

