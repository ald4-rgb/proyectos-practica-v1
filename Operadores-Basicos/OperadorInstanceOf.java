
/*
* El opreador instanceof: nos permite validar sabe si una instnacia un objeto es refeerencia de un tipo
*                         por ejemplo de una clase de una interface de una clase abstracta o incluso de un subtipo
*                         es decri puede que sea  del tipo de una clase pero a su vez esa clase extiende hereda
*                         de otra clase una clase mas generica tambien podemos saber si ese objeto es desendiente
*                         de ese tipo, o si ese tipo es un ancestro de ese objeto
*  */

public class OperadorInstanceOf {
    public static void main(String[] args) {
        //vamos a crear dos objetos Primero del tipo String
        //creamo un objeto de la clase String
        String texto= "Creando un objeto de la clase String..que onda!";
        //creamo el otro objeto de la clase Integer
        //Integer es la clase que envualve o reperesenta equivale al entero primitivo al int
        //tiene mayor funcionalidad metodos para convertir para reasliazar
        Integer num= 7;
        //Ahora podemos usar el operador InstanceOf para validar si un objeto es un tipo de una clase
        //creamo la varaible boolean
        //aqui estamos preuntando si texto es instancia de String
        Boolean b1= texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);
        //si pregutnamos si texto sera del tipo integer b1= texto instanceof Integer; --> nos marcaria error
        // quiere decir que el objeto  que no se puede validar un objeto con el instanceof si corresponde a un tipo  que es de otra clase
        //y que pasa con el Obect
        //Obect: es la clase padre de todos los objetos es decir toda clase de java cualquier clase hereda de Object a un que no se ve
        //       de forma implicita todos lo tipos todas las clases  y los objetos son del tipo Object
        b1= texto instanceof Object;
        //lo probamos debiera dar true
        System.out.println("Texto es del tipo Object = " + b1);
        //¿Qué pasa con número?
        // b1= num instanceof Long; && b1= num instanceof Short;//nos marca error no podemos hacer un cast son distintos
        // lo unico que tienen en comun es S tipo Number que es el ancestro el tipo generico en otro ejemplo podriamos usar Number
        b1= num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);
        //Integer es instnacia de number
        b1= num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);
        //ahora vamos con el ejemplo de objec
        b1= num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);
        //vamos a crear un objeto del tipo Double
        Double decimal = 2.3;
        //preguntamos si decimal es instnacua de number
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);
        //tmabien podriamos hacerlo con Boolean si b1 es instnacia del mismo Boolean
        b1 = b1 instanceof  Boolean;
        // y lo pintamos
        System.out.println("b1 es del tipo Boolean= " + b1);


        /*
        * Nota solo con tipo de Referencia osea clases por que si lo hacemos con primitivos iniciando en minusculo
        * ya estamos indicando que es del tipo primitivo no es del tipo de refreencia solo recordemos que
        * siemrpe que usemo instnaceof siempre son objetos para validar si es tipo de .
        * */
    }
}
