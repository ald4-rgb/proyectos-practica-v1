
        /*
        La idea de este ejemplo es tener 3 números y calcular el mayor

        * */

        import java.util.Scanner;

        public class OperadorTernarioNumeroMayor {
    public static void main(String args[]){

        //empezamos declarado la variable integer
        int max =0;
        //usarmos la clase Scanner
        Scanner sc = new Scanner(System.in);
        //por ejemplo ingrese un númuero
        System.out.println("Ingrese un número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese un segundo número");
        int num2 = sc.nextInt();
        System.out.println("Ingrese un tercer número");
        int num3 = sc.nextInt();
        System.out.println("Ingrese un cuarot número");
        int num4 = sc.nextInt();


        //como buscamo o calculamos el número mayor de estos 3 usando operadores condicionales o ternarios
        //entonces asinamos el nuemro mayor o maximo segun la comparación
        // vamos a realizar si el nuemro uno es mayo a nuemro2 si es meyor retornamos num1
        // si es menor que num2 entonces retornamos false
        max =(num1 > num2) ? num1:num2;
        //ahora calculamos el maximo por que ya sabemos cual es el maximo entre el uno y el dos
        //ahora comparamos el maximo con el numero 3
        //entonces si max es mayor que nuemro 3
        // si es  a si retornamo mx si no es a si retonarmos num3
        max = (max > num3)?max:num3;
        //¿Que pasa si tenemos un cuarto nuemro?
        max = (max > num4)?max:num4;
        //ahora vamos a imprimir el num1,num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num3 = " + num4);
        //y el maximo
        System.out.println("El número mayor es: " + max);

    }
}

