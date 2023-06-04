/*
* Ejericio pára implementar si un año  biciesto o no
*
* */


public class AnoBiciesto {

    public static void main(String[] args) {

        //comenzamos primero con un entero
        //con el número
        // por ejemplo septiembe
        int mes = 9;
        //y quiero determinar si tiene 30  o 31 días  vamos a usar un if

        //a qui definimos la variable dias
        // siempre tenemos que inicializar cuando es una variable local de un métod
        int numeroDias = 0;


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
            numeroDias = 28;
        }

    }

}
