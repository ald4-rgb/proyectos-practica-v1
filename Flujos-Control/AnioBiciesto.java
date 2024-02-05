/*
* Ejericio pára implementar si un año  biciesto o no
*
* */


import java.util.Scanner;

public class AnioBiciesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //comenzamos primero con un entero
        //con el número
        // por ejemplo septiembe
        int mes = 2;
        //y quiero determinar si tiene 30  o 31 días  vamos a usar un if

        //a qui definimos la variable dias
        // siempre tenemos que inicializar cuando es una variable local de un métod
        int numeroDias = 0;
        // entonces es anio
        //definimos con el sccaner para que el usuario ingrese
        System.out.printf("ingrese un año veremos si es bisiesto o no fomrato yyy\n");
        int anio= sc.nextInt();
        //hay algunos meses que son 30 y otro 31 dias
        //entonces tenemos que tener un if si el mes es igual a enero 1 o si es igual a
        // marzo 3  y asi sucecivamente  con el operador or
        // entonces mes  si es igual a 1  o bien  si es igual  3  o bien si es 5  7
        // son los mese impares y algunas excepciones
        if(mes == 1  || mes == 3 || mes ==5 ||mes== 8 || mes==10  || mes==12){
            // entonces todos estos meses va a tenr  31 dias
            //aqui lo dejamos en 31
            numeroDias = 31;
        // sin no preguntamos  si el mes es 4  mes 6 es decir para abril o junio
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ){

            numeroDias = 31;
         // que psa con el mes 2  febrero es un mes especial puede tener 28 o 30 dias lo que necesitamos para calcular si es biciesto a ono es el año
        }else if(mes== 2){
            //entonces hay varias reglas pra calcular un anio biciesto  por ejemplo cualquier año que sea divisible por 400 es decir tiene 29 dias
            //pero tambien si es divisible entrew 4  y si no es divisible en 100
            //entonces aplicamos un fi
            //año el modulo es igual a 0  o
            // si el año  es divisible por 4  igual a 0
            // AND anio  por 100 es  igual a 0 pero recordemos es la negacion
            // colo camos parentesis
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio * 100== 0))){
                System.out.println("el anio es bisiesto");

                numeroDias = 29;
            }else
                System.out.println("el anio no es bisiesto");
                numeroDias = 28;
        }

        //entonces a qui vamos a imprimir némero de días

        System.out.println("numeroDias = " + numeroDias);

    }

}
