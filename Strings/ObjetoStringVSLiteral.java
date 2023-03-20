public class ObjetoStringVSLiteral {


    /*¿Cuales la diferencia entre crear una instancia con un bojeto stering con el operador new 
        vs crear de la forma literal?*/
    public static void main (String [] args){

        //creamos una variable del tipo string
        //recordemos que el tipo string no es un primitivo como pareciera ser 
        //pero en realidad es un objeto por debajo java va a crear el objeto String
        //y se lo asigna a la variable curso  por debajo con el operador new
        //¿Por que se crea a si? por que es uno de los pocos tipos en java donde podemos crear las instancia en la literal de froma directa 
        String curso  ="Curso de Apigee";

        //pero tambien por ejemplo podemos  crear con el newy la clase String y por constructor  cuadno creamos el objeto 
        // y recibimos argumentos algun valor en este caso el texto 
        // la clase String y se la asignamos  a curso 2  String curso2 --> new String("..");
        String curso2 = new String("Curso de Apigee");
        
        //pero como son objetos y en java todo objeto de nuestro ecosistema  nuestra aplivacion de java son distintos unicos
        // y cada uno tiene su propio identificador

        //Apsear de que curso y curso2 comparten  el mismo valor ambos tienen el mismo text Cruso de Apigee pero sin duda son
        // objetos completamente distintos  por lo tanto  si queremos comparar  por ejemplo boolean
        boolean esIgual = curso == curso2;
        //¿Cual sera el resultado? nos dara false por que son dos instancias diferentes a pesar de que tiene el mismo valor
        System.out.println("curso == curso2 = "+esIgual);
        //¿Pero cual seria la froma corecta si yo quisiera comparar esos strings pero no por la instancia no por el objeto
        //si no por el valor? para eso tnedriamos que usar el metodo equals
        esIgual = curso.equals(curso2);
        //vemos el resutlado el meotod equals tiene que retornar true o false
        System.out.println("curso.equals(curso2) = "+esIgual);
        // el metodo equals lo que hace es comparar  por valor  compara el valor de curso =  Curso de Apigee con curso2 =  Curso de Apigee
        // comprueba si son iguales pero compara el texto 
        //cuando trabajamos con instnacias  con == la referencia  pero si queremos comparar  por algun valor  algun atributo 
        //se hace atraves del metodo equals(); compara directamente el valor del string no el objeto si no  el valor  con el metodo equls()
        //que pasa si cambiamos letras o acentos por defecto nos daria false pero hay una condicion de euquals() que se llama InoreCase()
        //entonces si podemos ese metodo equalsIgnoreCase() nos dara un true por que ignora si hay mayusuculas o minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = "+esIgual);

        //Ahora en java hay otra particularidad 

        //creamos otro objeto de froma literla implicita asignamso el mismo valro qeu en cruso

        String curso3 = "Curso de Apigee";
        
        //ahora vamos a  comparar curso con curso3 nos da un true
        //¿Por que? por que curso3 tiene el mimo valor de un objeto que ya esta creado  en nuestra aplicación por ejemplo
        //Curso de Apigee existe con ese valor  en el curso y curso3  lo que hace es no crear un nuevo obejto  para 
        //optimizar para no crear un nuevo objeto lo que hace es asignar la referencia que ya existe de forma automatica
        //ya detecta que existe ese la misma instancia con ese objeto.
        esIgual = curso == curso3; 
        System.out.println("curso == curso3 = "+esIgual);
    }

}
