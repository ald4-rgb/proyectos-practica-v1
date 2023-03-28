public class TestRendiminetoMetodoConcatVSStringBuilder {
        /*
        * Ahora veremos cuales la diferencia entre los diferentes tipos de concatenación  por
        * ejemplo cuando concatenamos  con el signo + cuando usamos el metodo concat() o bien utulizando la clase StringBuilder
        * vamos a usar una u otra dependiendo el escenario el contexto
        * */
        public static void main(String [] args ){
            //Vamos a definir  3 String
            String a  = "a";
            String b = "b";
            String c = a;
            //Ahora lo haremos con el la clase  StrintgBuilder creamos la instancia y le pasamos un Striin por defecto
            StringBuilder sb  = new StringBuilder(a);
            //entonces cmomnsmaos con el String a
            //Entonces StirngBuilder : tal como dice el nombre nos permite crear  un String  empezar a anexar elementos  con el metodo append()
            //vamos agragando concatendo y depsues con el metod toString() generamos el completo de unafroma mucho mas optimizada
            // una de las caracteristicas es que el StringBuilder es mutable  a diferencia del String que inmutable  por lo tanto se puede ir modificando
            // el StringBuilder con los elementos

            //la idea es impletmentar una iteración  un loop  un for  y por ejemplo concatena unas 100 veces
            // o 500 veces un contenido  un texto y ver cuanto se demora en cada una de las formas y tomar un timepor inicial
            // y un tiempo final y calcular el tiempo total.

            //definimos timempo en un long definimos tiempo en ms
            // la clase Sytem de java yaa contieen el tiempo actual
            // System.currentTimeMillis() --> nos retorna un tipo long un tipo númerico
            long inicio = System.currentTimeMillis();

               //para poder probar necesitamos una iteracion repetir 500 veces un proceso  de concatenacion y ver cuadno se demora
            //usamos for iniciamso  en 0  nuestro contador i , va a terminar hasta que la iteracion i sea mayor que 500 , incrementamos la iteracion
            // esto es igual a decir que i++ == a i = i + 1
            // el operador ++ siginifica postincremento
                //inicia   ;evalua; incrementa
            //que pasara con mil
            for (int i = 0 ;i < 100000;i++){
                //vamos a evaluar la concatenacion con el metodo concat(String string)
                //entonces c va hacer igual a concat(a).concat(b);
                //concat("\n") este salto de linea es para que podamso ver cada iteracion en un buen orden
                //c = c.concat(a).concat(b).concat("\n");// --> ejemplo con concat lo pueddes descomanetar
                //c =c + a + b  + "\n";// ejemplo con el operado +
                // c += a + b  + "\n"; forona simplificada
                //Realizaremos el test con StringBuilder
                //entonce sb invocamos el metodo append concatenamos con a
                // si nos fijamos estamos invocando los metodos de forma encadenada
                // ¿por que? el append retonar la misma instancia el mismo objeto  o referencia del StringBuiler
                // entonces como retorna el SringBuilder podemos volver a invocar a su metodo
                sb.append(a).append(b).append("\n");

            }

            //vamos a tenr tambien un fin
            long fin = System.currentTimeMillis();

            // y luego vamos  a restar ambos, como son tipos numericos del tipo long  estamso restando  entonces restamso el tulimo tiempo en milisegundos
            //  y cuando comenzamos
            System.out.println(fin - inicio);

            System.out.println("c ="+c);
            System.out.println("sb= " + sb.toString());




            //imprimios el resultado final de la concatenacion


            /*
            * Se puede demorar 2 ms o 1 son 55 iteraciones esta concatenando 500 veces
            *
            * Conclucion por donde se le mire el StringBuilder es maw rapido que el metodo concat() el operador +
            *
            * */

        }
}
