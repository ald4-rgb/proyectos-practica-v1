public class ConversionEntreTiposPrimitivos {
    

    public static void main(String[] args){

        //vamos a convertir este entero
        // para convertir en tipo short  solo puede ser 32767 no se puede pasar si lo convertimos a short
        //entonces para convertir los valores de los tipos de datos con menor capacidad no pasarse del rango
        int i = 32767;
        //a un tipo short pero esto nos daria un erro entonces ¿Como converitmos? con un cast forzar la conversion 
        //pero seguira marcando error por que son incopatibles por el tamaño de lo datos primitivos osea short e int 
        // son incompatibles por el tamaño de bytes
        // podemos hacer el cast con el tipo de dato short s = (short)i ---> a qui estamos 
        //el maximo vañor de Short en decimal 32767 
        short s = (short)i;
       //mostramos en la consola
        System.out.println("s = "+s);
        //otro ejemplo con longa qui se se puede convertir por que int es menor que el tipo long 
        //por lo tanto si puedo asignar un tipo int a n tipo long
        long l = i;
        System.out.println("l = "+l);
        //si queremos ver el maximo de el tipo de dato short podemos usar la clase SHORT
        System.out.println(Short.MAX_VALUE);
        //por ejemplo si queremos convertir a tipo boolena chart string etc 
        //(boolean) i --> si queremos convertir no se puede por que son totalmente incompatibles por el tipo de dato que es int
        //boolean b = (boolean) i; entonces como conclucion nos puede castar un boolean con un int 
        //probemos con un char 
        char c = (char)i;
        //etonces lo convierte a un char pero recordemos que el char soporta  caracteres cada caracter unicode esta asociado a un entero
        System.out.println("c = "+c);
        //ahora que pasa con un decimal a  un float por ejemplo 
        //automaticamnete lo convierte en un numero con . decimal a un numero real
        float f = (float) i;
        System.out.println("f = "+f);
        /*entonces para concluir en tipos de datos primitivos solo podemos hacer cast a tipo numerico
        * incluyendo los numeros reales y como vimos un cracter tambien se puede soportar por que esta mapeado 
        * o asignado en la tabla unicode como valor numerico. 
        */    

    }
}
