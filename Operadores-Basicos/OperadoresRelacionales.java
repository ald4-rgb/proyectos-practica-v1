public class OperadoresRelacionales {


    /*
    * Ejercicio con operadores Relacionales
    *
    * Estos operadores se utilizan para verificar las relaciones
    * por ejemplo de igualdad entra dos variables
    * del tipo primitivo si son iguales si son distintas si
    * una es mayo que otra si es menor que mayor que menor igual etc..
    * pero no solamente para comparar variables  del tipo primitivo
    * sino tambien objetos a un que podrian funcionar un poco disitinto
    * a un que lo objeto siempre comparan su valor con el equals
    * o las clases que envuelven al primitivo estas clases Wrapper()
    * Long() Integer() estos tipo de clase hay que compararlos con el equals();
    * y no con el igual igual(==).
    *
    * Esta combinación que devuelve un resultado y este resultado es del tipo booleano
    * es decir true o false compara y se evalua esta comparacion a un resultado de
    * verdadero o false y tambien en los bucles  como el for(..){...}, while(..){..} y do{...}while(...)
    * */

    public static void main(String[] args) {

        // vamos a definir algunas variables para comparar sus relaciones por ejemplo
        int i = 3;
        // vamos a tener un byte
        byte j = 7;
        //otra varaible del tipo float 127e-7f que sea exponente
        float k = 127e-7f;
        // del tipo double l
        double l = 2.1413e3;
        //de momento para que sea distinto o reales vamos a tener un boolean
        boolean m = false;


        //primero vamos a ver la relación de igualdad es decir comparar  dos variables a un que tambien  literales son litaresl si son iguales
        //i si es igual igual a j
        //recordemos que lo que devuelve es a un valor booleano entonces tenemos que asignar un valor booleano
        // este tipo de operadores solo se usa en tipos primitivos compara un primitivo con otro primitivo i literales
        boolean b1= i== j;//descomenta // booleano b1= 5 ==5 // a qui comparamos literales
        // i = 3 & j = 7 por su puesto que es falso
        //pero si queremos comparar objetos por lo general se compara el valor no la instancia si compara
        //si comparamos que un objeto con igual igual va comparar que le igual sea al otro objeto pero al termino instnaica
        // es decir que estas dos referencias apunten a otro objeto que esta almacenado en algun puntero en la memoria es decir que haga
        // referencia hacia el mismo objeto
        // objetos con el metodo equals();
        System.out.println("b1 = " + b1);

        //vamos a tener otro booleano
        // b2 va a hacer b2 lo va almacenar
        // hay un operador que  es especial que se le conoce como negacion como el unario el sigono !
        // ! => lo que hace el sigono de exclamación invertido es invertir el valor a qui es false el resutlado seria
        boolean b2 = !b1;
        //true
        System.out.println("b2 = " + b2);
        //como tambien tenemos el igual tambien tenemos el distinto
        // si i es distinto a j
        // != : esto siginifica distinto
        boolean b3 = i != j;
        // sin son distintos retorna true si son iguales retorna false
        System.out.println("b3 = " + b3);// otros lenguajes el != <>
        // pero tmabién tenemos un booleano podemos compararlo
        // m es igual a true o tambien distinto
        // solo el mayor y menor que no se pueden utilizar en estos casos por que es para comparar si es igual a true o no
        boolean b4 =  m == true;
        System.out.println("b4 = " + b4);
        // distinto
        boolean b5 =  m != true;
        System.out.println("b5 = " + b5);
        //veamos otros mayor que si i es mayor por ejemplo  que j
        boolean b6 = i > j;
        System.out.println("b6 = " + b6);
        //veamos otros mayor que si i es menor por ejemplo  que j
        boolean b7 = i < j;
        System.out.println("b7 = " + b7);
        // si l es mayor o igual  que k
        boolean b8 = (l >=k);
        System.out.println("b8 = " + b8);
        // si l es menor o igual  que k
        boolean b9 = l <=k;
        System.out.println("b9 = " + b9);

        //y para finalizar en todos estos ejemplos hay una mezcla y combinació de operadores
        // tenemos el operador de asignacion el =  asigna un valor booleano de una comparacion
        // == con el igual igual verficamos las relaciones de igualdad podemos usar cualquiera
        // boolean b10 = i == j;
        //entonces es importante la presedencia de los operadores  vs los operador de asignación;
        // y para poder entender mejor y no confundir podemos poenrle parentesis  por presedencia
        // primero evalua los opereadores y luego los operadores de asignación


    }

}
