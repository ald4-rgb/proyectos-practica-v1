
/*
 * Con etiquestas break o cntinue vamos a permitir o interrumpi que
 * se ejecute ese bulce
 *
 * */


public class EtiquetasSentenciasForWhile {

    public static void main(String[] args) {

        //supongamos un ejemplo clasico
        //tendremos un for cuando el i sea  menor que  5  va a iterar
        //¿Que pasa si quiero hacer referencia a un for en particular un for
        // etiqutado como puedo dar etiquetas  a los bules puede ser arriba
        // de un for while con un nombre calquier nombre un identificador
        // igual que las regals de un nombre variable comenzando en minusculas
        //esta etiqueta debe ir justo pegada al for puede ir a lado
        // este for esta etiquetado con  esta etiqueta identificador entonces en el
        // continue o en el break podemos hacer referencia   a esta etiqueta
        bucle1:
        for (int i = 0; i < 5; i++) {

            //Que pasa si tengo otro bulce otro for anidado
            for (int j = 0; j < 5; j++) {
                System.out.println();
                //si i es igual a 2
                if (i == 2) {
                    //el resultado seria exactamente el mismo
                    // la etiqueta es importante damos referencia a que bucle quiero continuar con la siguiente iteración o a que bucle quiero salir
                    // podemos hacer un for en el continue en for padre que esta con una  etiquets
                    continue bucle1;//si quitamos continue bucle1  de esta manera -> se va a salir se salta la iteración//  continue ;
                    //se salto la segunda iteración cuando el i es 2
                }
                // por cada i en cero comienza el j
                System.out.print("[i = " + i + "\s,j = " + j + "], ");
            }

        }

        //mismo ejemplo con break
        System.out.println("\n******************* Etiquestas y for anidadosbreak******************************");
        bucle2:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                //si i es igual a 2
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + "\s,j = " + j + "], ");
            }
        }
/////////////////////////hacer los mismo con el while

        System.out.println("\n**************************con while etiquetas usando anidaciones******");

        bucleConWhile:
        for (int i = 0; i < 5; i++) {

            int j = 0;
            while ( j < 5) {
                j++;
                //si i es igual a 2
                if (i == 2) {
                    continue bucleConWhile;
                }
                System.out.print("[i = " + i + "\s,j = " + j + "], ");
            }
        }
///////Otro ejemplo quiero ir iterando días de la semana 8 horas por dia de la semana
        // una persona va ir trabajando por cada dia de la semana 8 horas  pero menos el sabado y el domingo
        // entonces podemos recorrer con un for  por cada dia  y por cada hora por ejemplo dias
        // son siete dias a la seaman

        System.out.println("\n**************************con while etiquetas usando anidaciones Otro ejemplo quiero ir iterando días de la semana 8 horas por dia de la semana******");

        //i = a los dias de la semana  j= igual a las horas
        //entonces si i es menor igual a 7
        etiqueEjemplo:
        for (int i = 1; i <= 7; i++) {

            int j = 1;
            //por cada dia recorremos sus 8 horas
            while ( j <= 8) {

                //si i es igual a 6 o a 7 no trabaja
                if (i == 6 || i == 7) {
                    System.out.println("Dia  " + i +": descanso de fin de semana");
                    // lo saltamos
                    continue etiqueEjemplo;
                }
                System.out.println("Dia = " + i + "\s,Trabajando a las = " + j + "hrs, ");
                j++;
            }
        }

    }
}
