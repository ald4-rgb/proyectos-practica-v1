
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
                //si i es igual a 2
                if (i == 2) {
                    //el resultado seria exactamente el mismo
                    continue bucle1;//si quitamos continue  continue bucle1;
                }
                System.out.println(i);
            }

        }


    }
}
