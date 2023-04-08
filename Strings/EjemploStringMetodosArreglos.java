public class EjemploStringMetodosArreglos {

    /**************************************************************
    *La idea de este ejercicio es convertir Stings en arreglos    *
    *   Arreglos con Strings                                      *
    *                                                             *
    * *************************************************************
    * */

    public static void main(String [] args) {

        //El objetivo es convertir trabalenguas en un arreglo
        String trabalenguas = "trabalenguas";
        //vamos a comprobar cuantos caracteres tiene la palabra trabalenguas
        System.out.println("trabalenguas.length() = " + trabalenguas.length());

        //entonces usamos el metodo toCharArray() --> lo  que hace este método eas converitr nuestro String en un arreglo de caracteres
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        //¿Que pasa si imprmimos esto? en realidad lo que imprime es el identificador el hahs del objeto [C@5caf905d
        // todo objeto en java es una instancia una referencia entonces la unica forma de mostrar los elementos
        //es mediante una itearación por ejemplo usando un for o un while
        // podriamos implementar el for para mostrar cada caracter de este String
        // lo primero es crear una variable del tipo char[] con corchetes
        // toCharArray(); retorna una char[] un arreglo del tipo char
        char[] arreglo = trabalenguas.toCharArray();
        //recordemos que para un for es inicializar el contador y en cada iteracion este se va ir  incrementando en uno y evaludando si el contador es
        // mayor a cierta cantidad de la iteracion
        //for (int i = 0; i < arreglo.length ; i++){System.out.println(arreglo[i]);}//descomentar si lo quieres optimizado
        // declaramos otra vairable para obtener la cantidad de elementos
        // un int largo y un atributo arreblo.lenth diferencia de length()
        // length --> retonar la cantidad de elementos
        // si nos fijamos la cntidad de elementos del arreglo debiera ser igual a la cantidad de elementos del string
        int largo = arreglo.length;
        //vamos a imprmir el largo
        System.out.println("largo =" + largo);
        //inicializar el contador en cero
        // evaluar una experesión booleana  mientrar i sea menor qeu largo que la cantidad de elementos
        // iteramos
        for (int i = 0; i < largo; i = i + 1) {
            //vamos a imprimir cada caracter
            // no nos interesa imprimir el contador
            // el caracter es un elemento del arreglo
            // cada elemento esta dentro de una posición
            //    System.out.println( " arreglo = " + arreglo[i]); // si deseas descomentar
            //imprimir en horizontal lo transformamos a caracteres a travez de un arreglo
            System.out.print(arreglo[i]);
        }
        //entonces usamos el metodo split() --> lo  que hace este método eas converitr nuestro String en un arreglo de caracteres
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        //este arreglo es del tipo String por que del tipo String por que un elmento puede tener más de un caracter
        // la palabra a es el separador es el patrón el separador tr dos caracteres el metodo split(); usa expresiones regulares

        String[] arreglo2 = trabalenguas.split("a");
        // la longitud
        int longitud = arreglo2.length;
        // y vamos a tener el for  mientras j sea menor a la longitud
        // entonces iteramos
        for (int j = 0; j < longitud; j++) {

            //imprmimos
            // un arreglo conformado por trblengus donde  a es el separador
            // separado con letras y las convierte como elementos de un arreglo
            System.out.print(arreglo2[j]);
        }
        System.out.println();
        //y esto podria ser bastante util con
        // ahora el separador va hacer el punto
        // vamos a convertir un arreglo a partir del nombre de archivo
        // que contenga 3 elementos algun elemento va hacer opdf
        String archivo = "alguna_imagen.pdf";
        //  archivo.split("."); con un patron
        //  el punto es una plabra clave para las expresiones regulares
        //  pero si la podemos utilizar si la escabas con dos backslash
        // y no el punto que utiliza la expresion regular archivo.split("\\.") si quitamos eso
        // el doble backslash '\\' no lo toma
        // String [] archivoArray = archivo.split("\\."); //descomenta si quieres ver que pasa si no respetamos la expresion regular
        String[] archivoArray = archivo.split("\\."); // expresion resultar recrodar siempre escapar '\\.' /\b

        //vamos a reciclar la variable longitud no afecta al resultado anteroir
        // recordemos que empezamos por el punto por eso son 2 el resultado empezamos en 0
        longitud = archivoArray.length;

        System.out.println("longitud = " + longitud);
        // y ahora si podemos iterar
        for (int k = 0; k < longitud; k++) {

            System.out.print(archivoArray[k]);
        }
        // imprmmamos la extension del archivo entonces es archivoArray[longitud - 1] al archivo partimos desde el punto
        // matematicamnete la longitud cuanta desde 2 entonces es 2 - 1 y vamos recorriendo todo desde fdp hasta el cero
        // longitud - 1
        System.out.println("\nextension = " + archivoArray[longitud - 1 ]);
        
        /*Como nota
        *
        * length() es metodo que se encuentra dentro de la clase String
        * y length es un atributo que se encuentra en un arreglo viene como atributo
        * */

    }
}
