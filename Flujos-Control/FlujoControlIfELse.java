/*
* Comenzamo con el if es la estructura más simple para modificar el flujo
* normal de nuetra app mediante una condición se puede evaluar dentro del if
* y si se cumple ejecutamos un bloque de codigo de lo contrario si no cumle
* la condición si la expresion es falsa
* if -->  si se cumple y else --> si no que cumple
* */

public class FlujoControlIfELse {
    public static void main(String[] args) {

        //entoces con la palabra reservada if
        //dentro de los parentesis evaluamos una experesion boolean
        //que también se el conoce como condicion por lo tanto esta
        // condición tiene qur evaluar un true o false
        /*if(expresion){
            //en las llavesa se delimita el contexto  del if que justamente seria este bloque de cogido  o fragmento se ejcuta cuando la expresion es true es
            //verdadera


        }else{
            //camino alternativo

        }//if & else son excluyentes jamas se van a ejecutar de forma simultania siempre es uno o el otro
        para ejemplo pondermos un promedio
    //los brtackets o mejor dicho las llaves no siempre son obiligacion simepre y cuanedo se una sola sentencia una sola linea de codigo del fi y else
        */

    //con un tipo de dato float
    //recordemos que el float requiere la f por que por defecto es es double
    float promedio = 6.2f;

    //ahora vamos a evaluar promedio usando un operador realcional
    // promedio si es mayor o igual que 6.5 entonces es exlcelente
        if(promedio >= 6.5) {
            System.out.println("Felicitacion excelente prmedio!");
        }
        else {
            System.out.println("Suerte para la prixima esfuerzate un poco mas c:");
        }
   // y si hacemos este ejemplo un poco más completo podriamos usar else-if
        System.out.println("*****************************************else-if");
        float promedio2 =6.7f;
        if(promedio2 >= 6.5) {
            System.out.println("Felicitacion excelente prmedio!");
        //entonces si no se cumple la condición de arriba evaluamos otra
        }
        //entonces ahora si el promedio es mayor o igual  a 6  vamos a
        else if (promedio2 >= 6.0 ){
            // ejecutar esta sentencia
            System.out.println("Muy buen promedio promedio!");
        //ahoa que pasa si es mayor  o igual que 5.5 es decir el pomedio esta entre 5.5 y 6
        }else if(promedio2 >= 5.5){
            System.out.println(" Bueno");
        }else if(promedio2 >=  5.0){
            System.out.println("Regula");
        }else if(promedio2 >= 4.0){
            System.out.println("Insuficiente ");
        }else{
            System.out.println("NA");
        }

        //independiente sea cual sea imprimimos el prmedio

        System.out.println("tu promedio es"+promedio2);
    }
}

