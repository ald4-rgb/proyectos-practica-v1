public class OperadorIncrementoDecremento {
    /*
    * Ejercicio con Operadores decremento y incremento
    * también conocidos como opeadores incrementables
    *
    * en incremento tenemos el postincremento y el postdecremento
    * */

    public static void main(String[] args) {

/////////////////////////preincremento///////////////////////////////////////////////////////////////////
        //partimos con una variable i
        int i = 1;
        //partimos con el preincremento es cuanod partimos desde uno
        // con el doble signo +
        // cuando el operador de incremento con el signo + se antepone
        // a la variable
        // a qui primero se incrementa  y luego se asigna el valor
        // entonces i vale 1 se incrementa y j vale 2
        int j = ++ i; // es lo mismo que i = i +1;
        //entonces i vale 2 por que  i se incrementa
        System.out.println("i = " + i);
        // i = i +1 este valor se esta asignando al vaor de j
        System.out.println("j = " + j);
/////////////////////////////////postincremento//////////////////////////////////////////////////////////

        System.out.println("*************postincremento*********************");
        // reutilizamos ña variabñe i pero haora valdra 2
        i =2;
        //valor inicial de i
        System.out.println("incial de  i = " + i);
        // y tambien reutilizamos j pero ahora  es el post incremento de i
        // a qui seria diferente por que i vale 2 se incrementa en uno
        // pero que pasa con j se matiene en dos ya que primero se asigna
        j = i++;
        //postincremento
        //cuando es post primero se asigna a la variable por lo tanto i vale 2  y despues se incrementa
        // el valor de i siempre se incrmentea sea pos o pre sea cual sea la variable
        // la otra varaible depende si es pre o post se incrementa con ese valor
        System.out.println("i = " + i);
        // se queda con el interioir
        System.out.println("j = " + j);
/////////////////////////////predecremento//////////////////////////////////////////////////////////////
        System.out.println("*************predecremento*********************");
        //reutilizar la variable
        i = 3;
        //primero imprimimos el i 
        System.out.println("valor anterioir de i = " + i);
        // j es el predecrmento entonces en vez de usar el doble + usamos el doble --
        j =--i;// esto es lo mismo que decir  i = i -1 = 2; entonces i vale 2 y se asigna a j
        // valor despues
        System.out.println("i = " + i);
        //entonces i vale 3 cuanto vale j
        System.out.println("j = " + j);
////////////////////////////postdecremento//////////////////////////////////////////////////////////////
        System.out.println("*************postdecremento*********************");
        //reutilizar la variable
        i = 4;
        System.out.println("la variable i andes, i  = " + i);
        // j es el predecrmento entonces en vez de usar el doble + usamos el doble --
        // es del decremento de i
        // el valor i es el que se decrementa no el j
        j =i--;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
///////////////////////Que pasa si ////////////////////////////////////////////////////////////////////
        System.out.println("*************¿Que pasa si preincrementamos y postincrementamos j ?*********************");
    // para finalizar
    // ¿Que pasa si? si preincrementamos j
        System.out.println("j = " + (++j));
        // ¿Que pasa si? si postincrementamos j
        System.out.println("j = " + (j++));
        //el valor final de j no es 5 es 6 por que despues se incrmenta
        System.out.println("j = " + j);
        

    }
}
