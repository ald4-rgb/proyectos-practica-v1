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

          String profesor=  "Chubaldo";

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
    /*en jdk once no se encuenta transform es a partir de jdk once  */


    }


}