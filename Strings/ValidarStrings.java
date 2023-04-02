public class ValidarStrings {


    /*
    *En este ejercicio sabremos como vlaidar un String
    *        ¿Si es una instancia  en null  si tiene buenas referencia  la variable tipo String o almenos si tiene un long
    *       O si el String tiene un espacio en blanco?
    *
    *  */
    public static  void main(String [] args){

            //vamos a definir una variable sin referencian sin una instancia
            String curso = null;
            //¿Como se valida esto ?
            // por ejemplo cuando la instancia de un objeto vamos a tener la instancia del tipo String
            // pero en general para cualqueiro tipo de objeto validat por que podria ocurri un error
            // por que si el objeto es null  y queremos invocar algun atributo  o metodo de este objeto nuestra app se va a quebrar el tipico
            // error nullpointerException.
            // entonces definimos un boolean
            // comparamos curso  si es igual a null
            boolean esNulo = curso == null;
            // ya tenemos nuestra validacion sabremos si es nulo o no
            // entonces no da true como reusltado
            System.out.println("esNulo = " + esNulo);

            //hay que tener cuidado  por que cuando un objeto es null apsesar de que nos permite ejecutar metodos
            //para cuando ejecutemos nuestra app va a lanzar una error por ejemplo
            //System.out.println("curso = " + curso.toUpperCase());
            //como resultado nos da el error java.lang.NullPointerException nos da este error por que estamos ejecutando algun metodo
            // nos da error como es null se quiebra se rompe  y hasta a qui se termina la ejecución podriamos utilizar try{} catch(exception e){}
            // pero siemrpe es bueno prevenir antes de invocar algun metodo a atributo  es bueno prevenir

            //vamos a hacer el ejemplo dentro de un if
            // si es distinto es null
            if (esNulo == false ) {
                //si es falso convertimos el valor convertido a mayusculas
                System.out.println("curso = " + curso.toUpperCase());
                System.out.println(curso.concat(" desde cero!"));
            }
            //como resultado no nos aparece nada por que se cumple la condicion

            //podemos concatenar con el metodo concat() pero tambien nos ddara como resultado java.lang.NullPointerException entonces tambien tendria
            // que estar dentro de un if
            //System.out.println(curso.concat(" desde cero!")); //--> te genera un error
            //--- concat al reves
            //podriamso usar un o bjeto creado con  "algo".concat(curos);
            // System.out.println("Bienveniddo al curso ".concat(curso)); // nos regresara un java.lang.NullPointerException
            // -- usando el opresador +
            // que pasa si usamso el operador +
            System.out.println("Bienveniddo al curso "+curso);// no lanza el java.lang.NullPointerException el operador + solo nos da la referencia de que es null
            //entonces con esto ya sabemos que el metodo concat() solamente lo utiliamos cuando el String tiene una instancia nos nulll

            // que pasa si definimos si es null si es trus
            // es lo mismo que decir que esNulo es  igual a true osea es lo mismo if(esNulo){...} que if(esNulo == true){...}
            // o incluso podriamos if(curso == null){...}
            // lo dejaremos ejecutar todo como variables ya que es lo mismo
            if(esNulo){
                //si se cumple la condición le damos un valor por defecto
                // podemmos comentar y descometnar  curso
                curso = "Apigee con el profesor Chubaldo";

               // ¿Que pasa si curso es un String vacio
                // ¿Que pasa si curso le damos un spacio en blanco?
                // deja de levantar
                // vacio sin espacio
                //curso =""; //pueedes descomentar
                //descometna si quieres ver como funciona el metodo isBlank() con un espacio
               //  curso = " "; // existe el objeto tieene referencia pero no tiene contenido pero no da error. Puedes descomentarlo
            }

 /////////////////////////////////////////Validaccion su es vasio un String//////////////////////////////////////////////

        boolean esVacio = curso.length() ==  0 ;
        //esto lo podemos imprimir  siempre y cuando no sea vacio sea dsitinto  de vacio
        // este if(esvacio == false){...} tambien se puede escribir de esta forma if(!esvacio){...}
        // si es distinto a vacio podemso imprimir
        // tambien podemos hacerlo de este moodo if(curso.length() ==  0){} o if(curso.length() >  0){}
        System.out.println("esvacio = " + esVacio);


        /////////////////////////////////////otra forma con el metodo isEmpity()/////////////////////////////////

        //String tambien tiene un  otro atajo que es  isEmpity() qye al final hace exactamente lo mismo

        //creamos el boolean
        boolean  esVacio2= curso.isEmpty();

        System.out.println("esVacio2 ="+esVacio2);
        //entonces negamo si es  esVacio2 == false


        if(!esVacio){
           // System.out.println(curso.toUpperCase());
           //System.out.println("Bienvenido al curso\s".concat(curso));
            // es vacio como vemos este bloque no se ejecuta nunca de va a ejecutar
        }
        if(esVacio2 == false){

            //mostramos el vacio 2 si nos fiajos el resutlado es igual al anteroir
        //    System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso\s".concat(curso));
        }
        /////////////////uso el metodo isBlank()/////////////////////////////////////////////////////////////

        //isBlank() --> valida que sea distinto de null  tambien valida que swa distinto de empty ademas valida
        // que tenga contenido que sea distinto de un espacio en blanco

        boolean esBlanco= curso.isBlank();

        System.out.println("esBlanco = " + esBlanco);

        //etnocnes si esblanco == false if(!esBlanco) {...} recordesmo que no se ejecute lo omite ya que lo esta validando
        // y  si descomentamos lo imprime deja de ser blanco
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso\s".concat(curso));
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("***************************Descomentar curso**************************************");
        //entonce que pasa si ponemos el metodo toUpperCase() lo convierte a mayusculas
        System.out.println(curso.toUpperCase());
        //a qui lo imprimimos sin que sea mayusculas podemos concatenar incluso con el concat()
        System.out.println("Bienvenido al curso\s".concat(curso));
        //¿como podriamso validar que un String tenga un tamaño?
        //entonces esvacio es igual a curso.length() el metodo length() retorna un Integet
        //entonces con eso podemos saber si la cantidad de caracteres es igual a cero  es por que es vacio

      /*puedes descomentar y comentar para ver como funcionan estas validaciones
      * Tener en cuenta qeu en java 8 no exite el metodo isBlank() apartir de java 11
      *
      *  */


            }
}
