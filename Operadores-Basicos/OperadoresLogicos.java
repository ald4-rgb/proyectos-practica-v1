public class OperadoresLogicos {

    /*
    *Ejericio con operadores logicos
    *
    * van muy de la mano con los operadores relacionales
    * es decir que hay dos tipos de operadores logicos
    * el and y el or
    * podemos evaluar dos operaciones relacionales dos o más
    *
    * AND => evalua que todo se cumpla que todos sean true, pero si almenos una falla la expresión completa es flase,hay que tener en cuenta
    *        que tener presente por ejemplo si evaluamos  dos expresiones  y la primera falla la segunda  ya no sse evalua no tiene sentido
    *        como es falso y no se cumple la primera no tiene sentido evaluar la segunda y queda con valor false
    *
    * OR => Si almenos uno es true la expresión completa es true, ahora si tenemos varios  expresiones  con or y la primera se cumple
    *       con true la siguiente tampoco se evalua no es necesario ya se cumplio  la primera condicion para que la primera condicion
    *       se true también hace efecto corto circuito ala inversa con true
    *
    * conclucion
    *
    * El AND todas las operando o condiciones se tienen que cumplir para tomar una deisicion y no se sigue evaluando con las demas
    * mientras que con el OR si almenos una condición se cumple esta expresión completa es true
    *
    * */

    public static void main(String[] args) {

        int i = 3;
        // vamos a tener un byte
        byte j = 7;
        //otra varaible del tipo float 127e-7f que sea exponente
        float k = 127e-7f;
        // del tipo double l
        double l = 2.1413e3;
        //de momento para que sea distinto o reales vamos a tener un boolean
        boolean m = false;
        //entonces un operador logico toma expresiones  y las va comparando  expresiones booleans por ejemplo de relaciones
        // podemos tener i igual a j AND k sea mayor que l
        //condicion totalmente verdadera
        // pero podemos tener mas condiciones con el operador AND
        boolean b1 = i == j && k < l && m == false;//condicion falsa descomenta // boolean b1= i== j && k > l ;
        //es falso la expresion completa es falsa  y no continua evaluando la siguiente por lo tanto k es mayo a l
        // no se evalua y es falsa la expresion completa es falsa
        System.out.println("b1 = " + b1);
        //mismo ejemplo con OR
        // como detecta que la primera es true no se evalua no es necesario almenos una ciondicion se tiene que cumplir
        // entonces el resultado seria true
        boolean b2 = i == j || k < j;
        System.out.println("b2 = " + b2);
        //vamos la presedencia de los operadores la primera condicion si i es igual a j AND k que sea mayor que l
        // y la tercera con un or m igual false
        // importante se evaluan de izquierda a derrecha entonces va a evaludar i == j && k > l y despues el resultado
        // la evalua con el or va a preguntar si m es igual a false y esto es true y si almenos una condición se cumple
        // con el OR la expresión completa  seria true
        boolean b3 = i == j && k > l || m == false;
        System.out.println("b3 = " + b3);
        //¿Que pasa si lo hacemos diferente?
        // colocamos un parentesis
        // evalua primero i == j es falsa
        // AND esta expresión (k > l || m == false)
        // en el parentensis lo priemro que hace es evaluar k > l es falso
        // OR m == false es verdadero
        // almenos si se cumple una condicion
        boolean b4 = i == j && (k > l || m == false);
        // pero que pasa nos da false por que i == j && => como falla la primera vez como i no es iigual a j
        // por lo tanto lo que hay en los parentesis no se evalua
        //cambia automaticamente de true a false con los parentesis
        System.out.println("b4 = " + b4);
        //¿Que pasa si?
        // siempre se evalua el lado izquierdo  b5 es igual a b3
        boolean b5 = (i == j && k > l) || m == false;
        // cambiaria todo a true
        System.out.println("b5 = " + b5);

        /*
        * Es muy importante cuando tenemos varias expresiones o condiciones que queremos evaluar o preiridad
        * a cierta evaluacion tenemos que usar si o si los parentesis ya que el resultado es muy distinto
        * con parenersis o sin parentesis
        *
        *And => devuelve true cuando ambas condiciones son verdaderas y si una falla la siguiente no se evalua
        *OR  => devuelve true si almenos una condición es verdadera
        *
        * tambien es impornte usar parentesis si tenemos varias o mas de dos  operaciones logicas y le queremos
        * dar alguna prioridad a ellas ya que el resultado peude varias completamente si usamos o no los parentesis
        * */

    }
}
