
/*
*
* switch case : compara el valor de una variable es decir toma el valor de una varaible y lo compara
* y va evaluando casos si hay un caso de este switch o interruptor que coincide con el valor dec
* esta variable entonces ejecuta esa acción o ese bloque de codigo
*
* */

public class SwitchCase {

    public static void main(String[] args) {

        //entonces la palabra clave es switch
        // y dentro recibe una variable con un valor
        // y este valor tiene que coincidir con alguno
        // de los casos si coincide se ejecuta esa acción
        // es como un interrupto o seleccion multiple
        // se pueden seleccionar distintos caminos segun
        // el valor de cierta variable  por ejemplo un nuemro

        //vamos definir un numero del tipo entero ejemplo 3
        //swithc case soportar enteros primitivos  pero tambien byte shor y tambinén
        // caracteres  y desde la version del jdk 7 sporta String y también en nuemradores
        // nuemradores es parecido a una clase pero tiene valores constantes si cologamos
        // un long no lo soporta
        //entonces serian las clases wraper que anidan a los primitivos de referencia
        // y tambiṕen del tipo String
        int num = 3; // long num = 3; // no sportado //podemos usar //Integer num = 2;  int num = 2; char num =2

        //switch evalua y va preguntando por ejemplo si es 3 evalua si  0 no ,1 no ,2 no y
        // pude tenr un bloque completo de  lineas de codigo
        //si ponemos mas de n casos encontramos más casos   que se van ir ejecutando si ponemos 1 va ejecutar los demas casos
        // para evitar este tema usamos la palabra break que nos permite salirno del switch-case para que no continue evaluando el redto
        // entocnes con braek entonces el brak va hacer el caso uno y no continua ni conel dos y el trer
        switch (num){
            //entonces a qui adentro poremos evalar casos por ejemplo
            case 0 :
                //ejecutamos algun codigo
                System.out.println("El  numero es cero");
                //pero tambien podriamos tambien tener más casos cuando es uno
            case 1:
                // y hacemos algo
                System.out.println("El  numero es uno");

            case 2:
                System.out.println("El  numero es dos");

            case 3:
                //cae en el 3 y ejecutar en el codigo de case3
                System.out.println("El  numero es tres");

        }
/////////////////////////////cuadno usamos un solo brek ////////////////////////////////////////////////////////////////////////////////////////////////////////////







///////////////////////////////cuando usamos los mas breaks




//////////////////////Evaliamos con caracter /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer num = 2; // long num = 3; // no sportado //podemos usar //Integer num = 2;  int num = 2; char num =2


        switch (num){
            case 0 :
                System.out.println("El  numero es cero");
            case 1:

                System.out.println("El  numero es uno");
                break;
            case 2:
                System.out.println("El  numero es dos");
                break;
            case 3:
                System.out.println("El  numero es tres");
                break;
        }


    }

}
