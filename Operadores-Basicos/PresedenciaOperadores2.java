/*
* Presedencia de los operadores algunos ejemplos
* para tener un poco más claro cual es la prioridad
* cuales se van a resolver cada expresión de cada operador
* hay una prioridad de izquierda a derecha segun el tipo de operador
* por ejemplo el AND tiene prioridad sobre el OR
* */

public class PresedenciaOperadores2 {
    public static void main(String[] args) {
        //Emepzamos con varialbes del tipo integer
        int i = 17;
        int j =8;
        int k = 20;
        //como vamos a dividir lo ideal es que sea un tipo decimal
        // aqui tenemos un dilema cual se va a resolver primero 
        // la divicion va a tener prioridad es igual a poner parentecis sobre la divicion
        double promedio = i + j + (k/7d); //double promedio = (double)i + (double)j + k/3d;//descomenta
        //primero divide despues encuentra la suma y hacel la operacion de izquierda a derecha
        //pintamos el promeedio
        System.out.println("promedio = " + promedio);
        //ahora si queremos que primero sume
        promedio = (i + j + k)/7d;
        System.out.println("promedio2 = " + promedio);
        //¿Qué pasa con la multiplicación?
        // en este caso primero divide despues multiplica
        // por la divición y luego suma es decir i + j
        promedio = i + j + k/7d*10;
        System.out.println("promedio3 = " + promedio);
        // resultado cambia si colocamos los parentecis en la divicion y en la suma
        promedio = (i + j + k)/(7d * 10);
        System.out.println("promedio4 = " + promedio);
        //aqui primero suma luego divide entre 3 y despues multiplica netre 10
        promedio = (i + j + k)/7d*10;
        System.out.println("promedio5 = " + promedio);

        //¿Qué pasa con el postdecremento y el predecrmento?
        //por ejemplo quiero preicrmentar el i y decrementar la j
        //pero precaución por que a qui tenemos un predeincremento y un postdecremento
        //recordemos que el pre primero incrementa y luego asigna el valor y luego devuelve el valor
        // en este caso despues va a sumar con j pero con el postdecremento
        // pero que pasa con el postdecremento primero se asigna o devuelve
        // entonces devuelve primero el valor de j y lo suma con el i por lo tanto todavia
        // no se decrementa  el postdecremento no j no se decrementa
        // el post no se aplica en una operación solo el pos incremento o decremento
        promedio = ++i + j-- + k/7d * 10;
        //lo pintamos
        System.out.println("promedio6 = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
