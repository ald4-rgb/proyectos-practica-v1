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
        //¿pero que pasa con? equalsIgnoreCase() ignora la mayusucla o minuscula
        System.out.println("nombre.equalsIgnoreCase(\"chubaldo\") = " + nombre.equalsIgnoreCase("chubaldo"));
        //otro metodo parecido al equals para comparar  caracteres comapreTo("...."); el oreden de este metodo es lexico grafico que esta basado en orden
        // sobre el valor de la tabla unicode en otras palabras realiza comparacion sobre el orden numerico  de cada codigo  que esta en la tabla unicode
        // va comparando estos caracteres y los va ordenando y a esto se le llama orden lexico grafico por ejemplo chubaldo compareTO("ubaldo") si el valor
        // da cero son identicos .
        System.out.println("nombre.compareTo(\"Chubaldo\") = " + nombre.compareTo("Chubaldo"));
        //vamos a comparar con otro nombre
        //como vemos asigna un ordenamiento deacurdo a la tabla unicode lo va ordenando segun un entero
        // recordemos que compareTo("...") va a tener siempre tendra int esta basado en los valores de cada caracter en la tabla unicode
        System.out.println("nombre.compareTo(\"Ubaldo\") = " + nombre.compareTo("Ubaldo"));
        //otro metodo el charAt() nos permite convertir un String en caracteres
        // podemos tener un caracter en particular lo que recibe este emtodo es un valor entero en el metodo  un integer
        // y retorna un caracter entonces por ejemplo 0 correcponde a la C
        // y si quiero la h seria el uno
        // y si quiero el ultimo caracter seria el 7
        System.out.println("nombre.charAt( ) = " + nombre.charAt(0) +"\nnombre.charAt( ) = " + nombre.charAt(1)+"\nnombre.charAt( ) = " + nombre.charAt(7));


        
    }
}
