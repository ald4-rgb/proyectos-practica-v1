public class Inmutabilidad{
    /*Cracteristicas del String es inmutable
     *  
     * Por lo  tanto su valor  no cambia una vez que se crea el objeto su valor se mantiene inalterable
     * cuando cambiamos el valor lo que sucede es crear  un nuevo objeto y se guarda en esa variable
     * y cambia la diferencia hacia otro objeto hacia otra insntacia pero si el objeto el string 
     * no cambia incluso podriamos modificar el string con el metodo concat(String string); , replace()
     * o con el susbString() se puede modificar pero no es que modifique el string original la instanicia
     * lo que hace es retonar una nueva instncia de un String con ese  cambio con esa modificación 
     * 
     */
    public static void  main(String []args){
          /*Declaramos la vairable curso como literal  */ 
          String curso  ="Curso de Apigee";

          String profesor=  "\sChubaldo";

          //vamos a concaquetnar curso con profesor
          //podriamos  pensar curso concat() lo concatena pero esta concatenando en el objeto curso
          curso.concat(profesor);
          //probamos
          System.out.println("curso ="+curso);
        // y como resultado nos da curso = Curso de Apigee a pesar de que concatena profesor
        // el concat() --> retorna una nueva instnaica un nuevo objeto no altera a curso entonces vamos a crear un objeto
           String resultado =   curso.concat(profesor);

           System.out.println("resultado = "+resultado);
          //vamos a revisar si curso es igual a resutlado  esto nos dara un false por que son dos objetos distintos
          System.out.println(curso == resultado);  
    ////////////////////////////////otro ejemplo/////////////////////////////////////////////////////////////////////
    /*en jdk once no se encuenta transform es a partir de jdk once
    *         curso.transform(c ->{
                return c + "impartido por el profesor" + profesor;
            });
            * como tal curso con el metodo transofrom lo que recibe es una expresión lambda que al final es un bloque de codigo
            * y este bloque de cogido  lo que hace es  recibir  este parametro  el Strig  y lo modifica retornamos el String modificado
            * entonces  se pasa por argumento o se emite el string
    * */

           //lo llamamos c -> {}: esto indica el bloque con los brackets
           //dentro del bloque tenemos que retornar  c que es el curso que se esta emitiendo modificado
           // lo concatenamos con el profeosr  entonces estamos modificando estamos tranformando el String original que es curso
           // en c estamso pasando el valor de curso se emite por argumento  e incluso podemos colocar parentensis por que se pasa por
           // argumento (c)->{}
           // entonces lo que hace trnasform es retonar una nueva instancia modificada  entonces en otroas palabras se aplica una funcion de flecha para
           // modificar el valor del String y tambien se le podria asignar por que tambien retonar un resultado
       String resultado2 = curso.transform(c ->{
            return c + "\simpartido por el profesor\s" + profesor;
            });
        System.out.println("curso = " + curso);
        //entonces curso se mantiene inmutable no se altera  solamente retonramos otro objeto  con el cambio
        System.out.println("resultado2 = "+resultado2);
   //---Ejemplo 3 tomado solo resultado o resultado2

        //entonces vamos remplazar por ejemplo un caracter  oldchar o antigua caracter vamos a remplazar una a o cualquier a por una a mayuscula
       // pero que pasa si asignamso del replace() a resutlado  a una variable resutlado3  
        String reusltado3 =resultado.replace("a","A");

        // vamos a volver a imprmir  resultado nos queda igual
        System.out.println("reusltado = " + resultado);
        // pero a qui remplazo las a minusculas por las A mayusculas
        System.out.println("resultado = "+reusltado3);

        /*
        *   Entonces cualquier cualquierr cambio modifica  el String  lo que hace es retornar  una nueva isntnacia pero la original se
        *   matiene intacta no varia a eso nos refereimos con inmutabilidad
        * */

    }


}