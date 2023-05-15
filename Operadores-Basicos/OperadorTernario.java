public class OperadorTernario {

    /*
    * ¿Por que se llama operador ternario?
    *
    *  ternario siginifica que esta formado por tres partes por
    *   3 elementos tambien esta formado por 2 argumentos
    *   donde la priemra evalua una expresión booleana
    *   entonces si se cumple esta condicioón  va a devolver
    *   un valor y si nose cumple va a devolver otro valor
    *   pero siempre del mismo tipo es decir el ternario
    *   es una version simplificada o abreviada del if-else
    *   cuando tenemos
    *
    *   el operador ternario siempre devuelve un valor
    *   a diferencia del if que ejecuta un bloque de codigo
    *   con las llaves  a ca asigna valor o devuelve
    *
    * */

    public static void main(String[] args) {

        //entonces el fromato o la estrcutura seria una variable
        //este oeprador siempre devuelve algo ya sea una variable
        // o para imprmir en la consola simerpe
        //igual
        // condicion seria esta expresion booleana que se evalua
        // utilizando por ejemplo operadores logicos
        // el OR AND etc
        //y evaluamos ocn el sigono pregunta ?
        // si esverdare devuelve un valor
        // : de lo contrario devuelve otro valor
        //ahora si lo llevamos a java la variable
        // del tipo String la condicion boolean
        // por ejemplo 7 igual a 7 retorna true si no es false
        // varaible= ? si es verdadero: si es falso ;
        // esto solo se puede con el operador ternario
        String  varaible= 7 == 7? "si es verdadero": "si es falso";
        //entonces lo vamos a imprimir
        System.out.println("varaible = " + varaible);

        //vamos a tener otro String
        // por ejemplo un estado --> aprobado o rechazado
        String estado= "";
        //y vamos a tener  un nota del tipo double
        double promedio = 6.5;
        //entonces deacuerdo al promedio vamos a marcarlo si es aprovado o rechazado
        // si es mayor a 5.5 esta aprobado si es menor esta rechazado
        // entonces estado es del tipo String y evaluamos
        // etonces si promedio es mayor igual que 5.49 entonces devolvemos el String aprovado
        // entonces asignamos rechazado
        estado = promedio >= 5.49 ?"Aprobado":"Rebrobado";
        System.out.println("estado = " + estado);
        System.out.println("*********************Con un if es más extenso******************************************");
        //esto  seria equivalente a if() a esta misma condicion si lo hacemos de esta manera
        if(promedio >= 5.49){
            estado="aprobado";
        }else {
            estado="reprobado";
        }
        System.out.println("estado = " + estado);



    }
}
