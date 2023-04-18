public class OperdoresUnarios {

    /*
    * Ejercicio usando operadores unarios
    *
    * Hay dos unarios
    *
    * 1. Unario positivo (+)
    *
    * 2. Unario negativo (-)
    * simplemente operan con el signo de un valor pero numerico
    * este valor númerico
    * o si trabajamos con decimal un double
    *
    * */
    public static void main(String[] args) {
        //declarasmo un entero negativo
        int i = -5;
        // y vamos a tener a j que es igual al positivo de i
        int j = +i;//estos es igual que  j = (1) * i => -5
        System.out.println("j = " + j);
        int k =-i;
        System.out.println("k = " + k);//estos es igual que k = (-1) * i => 5
        // y que pasa si i vale 6
        i = 6;
        // y tenemos a j=+ i;
        j=+i;
        System.out.println("j = " + j);
        // y si tenemos k= -i un valor positivo multiplicado por un valor negativo
        k = -i;
        System.out.println("k = " + k);
    }
}
