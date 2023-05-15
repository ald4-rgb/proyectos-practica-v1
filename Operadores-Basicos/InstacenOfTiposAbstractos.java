
/*
* Ahora lo veremos con tipos abstractos
* es decri por ejemplo crear una instancia de un Integer
* pero que este asociado a la clase padre por ejemplo
* a la clase Number o bien del tipo Object
* Recordemos que todas  clases son del tipo
* generico padre Object
* Entonces podriamos tener el texto que
* es un String  pero asociado a un tipo Object
* y el Integer asociado a un tipo Number
* la clase padre de todos los numeros
* o del tipo Object la idea es utilizar
* tipos genericos abstractos con
* instaceof y para validar a partir de
* este ejemplo generico si el valor corresponde
* o si es instancia
* */
public class InstacenOfTiposAbstractos {
    public static void main(String[] args) {

        //partimos con el String
        // Object es decir el texto que tiene un valor String pero esta
        // aociado al tipo generico es decir a la clase padre a la clase Object
        // Object es el root es la clase padre de la  gerarquia en java
        // es decri cada clase en Java hereda de la super clase object
        // siempre
        Object texto= "Creando un objeto de la clase String..que onda!";
        //Numero es del tipo integer claro que si por que tiene asociado
        //un valor un objeto que es del tipo Integer es decir cuando es
        //decimal cuando sea sin el punto por defecto es un entreo primitivo
        //de manera automaitca esto se le conoce como  autoboxing
        // se convierte este objeto primitivo del tipo Integer pero como
        // teiene asociado el tipo Number se va a guardar el Integer del tipo generico
        Number num = Integer.valueOf(7); // Number num= 7;// descomanentar
        //¿Que pasa con el instanceof? por supuesto texto es insntancia de Object
        // pero tambien es instnacia de String sigue siendo un String
        // por que la instnacian que tenga el valor que tiene es del tipo String

        Boolean b1= texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);
        b1= texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);
        //como ahora es del tipo generico tambien podriamos validar por ejemplo
        // si String es del tipo por ejemplo Integer
        // podemos preguntar sobre un objeto que es del tipo Object que es generico
        //preguntar si pertenece a una instancia del tipo integer
        // pero Object --> texto no contien una no contiene una instnacia de Integer pero
        // va hacer falso almenos va a dejar realizar  esta expresión evaluarla  sin que de
        // erro de compilación
        // texto es Object y un Integer igual ambos esatán asociados a Object por eso
        // nos permite relizar esta validación
        //sin enmbargo texto el valor que contiene esta variable es un String por lo tanto
        // no va hacer del tipo Integer
        b1= texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);
        //preguntamos Numer es del sipo integer
        b1= num instanceof Integer;
        //si
        System.out.println("num es del tipo Integer = " + b1);
        //pero podmeos preguntar si es por ejemplo del tipo Long o Double
        //entonces b1 <=num instancia Long
        // lo permite por que numbero  esta acosiado a Number  apesar de que contiene una referencia
        // del tipo Integer  pero un Integer no es instancia de Long
        b1 = num instanceof Long;
        //pintamos el resultado
        // nos da false pero si del tipo Integer
        System.out.println("num es del tipo Long = " + b1);
        //veamos con Double
        b1 = num instanceof Double;
        //va hacer falso con cualquier tipo que no sea Integer
        // sea short double con byte con cualquiera que herede
        // o extienda la clase abstracta number
        System.out.println("num es del tipo Double = " + b1);
        //veamos con decimal es del tipo Double ¿Qué pasa si los cambiamos a un tipo generico?
        //recordemos que todos lo números en Java son númber ya sea real o entero
        //se asocia a un tipo Double por defecto automaticamente
        //amenos que coloquemos f si colocamos f por ejemplo ya seria un floar Number decimal = 2.3f;
        Number decimal = 2.34;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double: "+b1);
        //hacemos lo mismo si es del tipo Float
        //reocrdemos que decimal es del tipo number pero tiene referencia Double
        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float: "+b1);
        //y claro que con integer con Long con short va hacer false
        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer: "+b1);

        //y si colocamos en la literal f digamos decimal2
        Number decimal2 = 2.34f;
        b1 = decimal2 instanceof Float;
        System.out.println("decimal2 es del tipo Float " + b1);

        /*
        * Como nota no podemos crear un new Integer(); esta decrapted oea
        * obsoleta la forma que mas se recomienda es el autoboxing es
        * decir la literal el valor primitivo del entero tal como el Num = 7;
        * entonces en ves de usar el new podemos usar el método valueOf(5)
        * esto se aplica a todos los tipo
        * */
    }
}
