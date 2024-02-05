/*Stencia Foreach simila al foreach es similar al for
* es mucho mas declarativa y mas facil de leer
* y solamente se utiliza para iterar sobre arreglos
* o objetos de coleccion de java  que son tipo
* de iterable entonces por cada elemento de un arreglo
* hacer algo con este elemento
* entonces en cada iteración vamos a obtener el elemento de forma automatica
*
*
* */


import java.lang.reflect.Array;
import java.util.ArrayList;

public class SentenciaForEach {
    public static void main(String[] args) {


        //definimos un arregl ode tipo String

        String [] canicas  = {"canica azul","canica verde", "canica roja","canica amarilla","canica naraja"};

        // la estrcutura es diferente primero el tipo de dato  de los elementos
        // en este caso son del tipo String entonces por cada elemento obetenemos
        // este elemento String obtenemos este elemento por cada elemento del arreglo
        // a medida que vamos iterando
        // entonces cuando comienza cuando comienza parte del primer elemento
        // y lo asigna a la variable local del tipo String por que es de tipo
        for (String canicasColores: canicas) {
            // y vamos a imprimir colores
            //lo asigna en este caso lo vamos a imprimir
            // de forma automatica y hacemos algo cualquier tares
            // en este caso solo vamos a imprimir
            // luego de forma automatica mueve el cursor
            // en este for y se poiciona en el siguiente elemento y el siguiente elemento
            // se guarda  en la variable canicasColores
            // que es local del for que empieza a recorrer se guarda
            // y se pasa a cada iteración de la varaible
            System.out.println("colores = " + canicasColores);
        }

        System.out.println("¨**********con tipo primitivo");
        //ahora lo haremo con un tipo

        int boletos[] = {132132,132,1,12,32,1,321,};

        for (int costos : boletos){
            System.out.println("costos = " + costos);
        }
                
        
        
        System.out.println("*********+usando algo mas sofisticado como ArrayList<tipoDeDato> ");
        ArrayList<String> conciertosForoSol = new ArrayList<>() ;

            conciertosForoSol.add("The holies ");
            conciertosForoSol.add("Grupo frime");
            conciertosForoSol.add("corona caítal");
            conciertosForoSol.add("Vive Latino");
            conciertosForoSol.add("Tylor switf ");

        for (String conciertos:conciertosForoSol) {
            System.out.println("conciertos = " + conciertos);
        }



    }

}
