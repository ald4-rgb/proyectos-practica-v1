public class MetodosStrings {

    /*La idea de este ejercicio es ver cada metodo de la clase String
    *
    * 1. ¿Qué podemos hacer con esto ?
    *       si es para validar para convertir  manipular el String
    * */

    public static void main(String [] args){
        //vamos a esperar con algo simple con una varaibel de tipo String

        String nombre = "Chubaldo";

        //vamos a empezar con el mas simple length() para sabe la longitud de la cadena cuantos aracteres tiene
        System.out.println("nombre.length() = " + nombre.length());// nombre.length() => 8 caracteres importante cada caracter  forman un String  por lo tanto un String forma una secuencia de caracteres

        //¿Como convertir por ejemplo a Mayuscula? con toUpperCasse();
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        //pero tambien podemos convertir en minusculas nombre.toLowerCase()
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        //¿Como comparar un String a nivel de valor no de instnacia? con equals("Chubaldo")
        System.out.println("nombre.equals(\"Chubaldo\") = " + nombre.equals("Chubaldo"));
        //vamos a probar si lo cambio ya que es distinto Chubaldo con mayusqula que con minuscula
        //recordemos que java es sencible a minusculas y mayusculas
        System.out.println("nombre.equals(\"chubaldo\") = " + nombre.equals("chubaldo"));
        //¿pero que pasa con? equalsIgnoreCase()
        System.out.println("nombre.equalsIgnoreCase(\"chubaldo\") = " + nombre.equalsIgnoreCase("chubaldo"));

    }
}
