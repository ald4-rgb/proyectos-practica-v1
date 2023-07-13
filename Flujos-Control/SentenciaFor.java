/*
* Nos permite trabajar con bluces o ciclos en java son setnecias de control repetitivas
* iteraciones que modifican  el flujo secuencial de nuestra app
* pero ejecutando una o mas veces un bloque de codigo
* de forma reiterativa en donde se tiene que conocer los limites del cliclo
* del for el valor inicial de la iteración cunado comienza y cuando termina
* es decir cuantas veces se va reptir este fragmento de codigo
* */

public class SentenciaFor {
    public static void main(String[] args) {


        //pero el for esta separado por 3 partes con ;
        /*for(;;) //for infinito
        {
            System.out.println("2222");
        }*/

        //la palabra  clave  o reservada  y va con parentesis
        //se inicializa una sola vez
        // si esta expresion es booleana terminar el for
        // o un valor limite por ejemplo 5
        // e incrementamos
        for (int i = 0; i < 5; i++) {
            // se imprimde del 0 -4
            System.out.println(i);
        }
        System.out.println("------------------------");
        // y si ponemos el igual en la expresión boolean
        for (int i = 0; i <= 5; i++) {
            // se imprimde del 0 -4
            System.out.println(i);
        }
        System.out.println("-----------otra forma de hacer el for inizializando fuera del for-------------");
        //otra forma de hacer el for
        int i = 0;
        for (; i <= 5; i++) {
            // se imprimde del 0 -4
            System.out.println(i);
        }
        System.out.println("-----------otra forma quitando el incremento dentro del for-------------");
        //la inizialicacion la dejamos a fuera
        int j = 0;

        for (; j <= 5; ) {
            // se imprimde del 0 -4
            System.out.println(j);
            //el incremento lo mandamos al final
            j++;
        }
        System.out.println("-----------otra forma quitando el incremento y la validación dentro del for-------------");
        //la inizialicacion la dejamos a fuera
        //la inizialicacion la dejamos a fuera
        int k = 0;

        for (; ; ) {
            // se imprimde del 0 -4
            //cuado k sea mayor a 5
            if (k > 5) {
                //detenemos el ciclo
                break;
            }
            System.out.println(k);
            k++;
            //el incremento lo mandamos al final

        }
/////////////////regresamos a la forma anterioir/////////////////////////////////////////////////////

        System.out.println("********************** original for");
        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
        }
        // queremos imprimir desde a tras
        System.out.println("********************** for decrementatdo");
        for (int x = 10; x >= 0; x--) {
            System.out.println(x);
        }
        System.out.println("********************** for combinado");

//incluso podriamos tener mas de una variabel de inicio e incrementar ambas o decrementar o hacer combianciones
        //por ejemplo
        //tenemos un for a = 1 , b = 5
        // si a es menor a b
        // enotnces incrementamos a y decrementamos b
        for(int a = 1, b= 10;a<b; a++,b--   ){
            System.out.println(a +" - " + b);
        }
        System.out.println("********************** ejeplo usando for numeros pares e impares");

        for (int x = 0; x <= 10; x++) {
            // si  modulo 2 es iguacl a 0
            // significa a x  0
            if(x %2 == 0)
            {
                //saltamos ao terminamos esta iteración
                //lo que terminamos es la iteación acutal
                // nos salimos  incrementa y vuevle con la siguiente iteracion se la salta
                // por lo tanto no imprme
                // para eso utilizamos continue
                System.out.println("paraes -"+x);
                continue;
            }
            // se sale solo va a imprmir numero impares
            System.out.println("imparaes -"+x);
        }



        //estos for no se interrumpen
        //podemos tener mezclas extrañas con más de un for  trabajar con esta variable compararlas
        //incrementarlas y decrementarlas
    }
}
