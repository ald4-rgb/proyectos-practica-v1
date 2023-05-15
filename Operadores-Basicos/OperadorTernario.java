import java.util.Scanner;

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
        double promedio = 0.0;

        //asignamos materias
        double matematicas = 0.0;
        double historia =0.0;
        double fisica =0.0;

        //el prmedio sumado y divido entre 3
        // hay que tener cuidado va a dividir historia entre 3 segun la presedencia
        // entonces usamos parentecis
        //pero tenemos que asignar esos valores la idea es que sea interactivo la idea es que el usuario pueda ingresar esos datos
        // usando la clase sCanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificaón de matematícas entre 2.8 - 7.8:");
        matematicas = sc.nextDouble();
        System.out.println("Ingrese la calificaón de historia entre 2.8 - 7.8:");
        historia = sc.nextDouble();
        System.out.println("Ingrese la calificaón de fisica entre 2.8 - 7.8:");
        fisica = sc.nextDouble();
        promedio = (matematicas + historia +fisica) /3;
        System.out.println("promedio = " + promedio);
        //entonces deacuerdo al promedio vamos a marcarlo si es aprovado o rechazado
        // si es mayor a 5.5 esta aprobado si es menor esta rechazado
        // entonces estado es del tipo String y evaluamos
        // etonces si promedio es mayor igual que 5.49 entonces devolvemos el String aprovado
        // entonces asignamos rechazado
        estado = promedio >= 5.49 ?"Aprobado":"Rebrobado";
        System.out.println("estado = " + estado);
        System.out.println("*********************Con un if es más extenso******************************************");
        //esto  seria equivalente a if() a esta misma condicion si lo hacemos de esta manera

//entonces por lo tanto lo podemos hacer con un ternario es una forma mas simplificada
/*  //Puedes descomentar estas lineas de codigo para comprobar que hace exactamente lo mismo
    if(promedio >= 5.49){
            estado="aprobado";
        }else {
            estado="reprobado";
        }
        System.out.println("estado = " + estado);*/
//El ejemplo anterioir esta muy plano podriamos mejorarlo que el promedio sea mucho más dinamico que el usuario pueda ingresar las notas
//por ejemplo de matematícas de fisica Química etc mediante el terminal la consola
// pdriamos utilizar la clase Scanner   modificamos el priomedio es decir lo inicializamos


    }
}
