/*
*
* Vamos a crear una clase personalizada viendo como se pasa por referencia
* y como cambia el estado el valor del objeto  del metodo main por ejemplo
* si lo modificamos en el metodo test pero tambien va a afectar y modificarse
* en el método main por lo tanto de referencia
*
*
*
* */

//vamos a crear una clase a qui arriba
//esta clase se va a llamar persona  para este ejemplo solo lo hare dentro de este mismo archivo
class Persona{
    //esta clase va a tener un atributo  conceptos de visibilidad los atributos o variables  de la clase
    //tenemos modificadores de accesos pueden ser privados es decir solamente se pueden manipular leer o modificar
    //en la propia clase dentro de los métodos no puede modificar desde a fuea y tampoco nos pueden accdeer ni leer
    //desde afuera entonces como buena practica implementamos el principio de vidsibilidad con  el modificador private
    //entonces tenemos el tipo nomre
    //entonces una atributo consta de 3 partes la visibilidad  o modificador de accesos el tipo  y el nombre
    //ahora para poder modificar esta variable la vamos a relizar dentro de un método un método especial para modificar
    //el atributo nombre
    private String nombre;

    //entonces tiene que ser del tipo publico para podedr acceder a cualquier parte desde dentro
    //y fuera del objeto entonces public void nombre
    //public: para que podamos acceder en cualquier parte desde dentro y fuera del objeto
    // void : no devuelve nada no retorna ningun valor
    //modificadrNombre (recibo un paramaetro): nombre del metetoso
    public void modificadorNombre(String  nuevoNombre){
        //a qui nombre que corresponde a este atributo
        //y le asignamos el nuevo valor que se pasa por argumento
        //tambien se utiliza this para hacer referencia a que corresponde a un elemento
        //en este casio a un atributo de la clase
        //this: se referie a esta misma instancia
        //de esta forma podemo modificar el valor del nombre de la clase persona
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }


}

public class PasarObjetoPorReferencia {

    //la clase persona la vamos a ocupar a qui la vamos a instanciar  con el operador new
    public static void main(String[] args) {

        //vamos a crear  parsona
        //vamos a instanciar la clase
        //aqui creamos un instancia un objeto de la clase persona
        Persona persona  = new Persona();

        //por lo tanto le damos una nombre
        //creamos un objeto persona con un nombre
        persona.modificadorNombre("\sEduardoDrunks");
        //sin moficar

        System.out.println("persona : "+persona.leerNombre());

       //cambia
       test(persona);

        System.out.println("Nuevo cambio de nombre : "+persona.leerNombre());
       //modificado

    }

   public static  void  test(Persona persona){

        persona.modificadorNombre("Mike Ross");



   }



}
