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
            for (int i = 0 ;i < 500;i++){
                //vamos a evaluar la concatenacion con el metodo concat(String string)
                //entonces c va hacer igual a concat(a).concat(b);
                //concat("\n") este salto de linea es para que podamso ver cada iteracion en un buen orden
                //c = c.concat(a).concat(b).concat("\n"); --> ejemplo con concat lo pueddes descomanetar
                //c =c + a + b  + "\n"; ejemplo con el operado +
            }

            //vamos a tenr tambien un fin
            long fin = System.currentTimeMillis();

            // y luego vamos  a restar ambos, como son tipos numericos del tipo long  estamso restando  entonces restamso el tulimo tiempo en milisegundos
            //  y cuando comenzamos
            System.out.println(fin - inicio);

            System.out.println("c ="+c);




            //imprimios el resultado final de la concatenacion


            /*
            * Se puede demorar 2 ms o 1 son 55 iteraciones esta concatenando 500 veces
            * */

        }
}
