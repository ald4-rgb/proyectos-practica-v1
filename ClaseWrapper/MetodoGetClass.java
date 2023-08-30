/*Metodo Get Class
*
* Recrodemos que todo objeto en java hereda el tipo de la clase Object
* getClass() --> Es un metodo que nos permite obtener información sobre la reflexión del objeto es decir todo su estructura
* es decri toda su estructura interna la reflexión o metadata por ejemplo el método de la clase completa ejemplo
* el package de la clase completa a la cual pertenece su metodo o sus aatributos sus constructores de la clase padre de
* la cual hereda o extiende un monton de infromación.
*
* Es como el esquema o la estructura interna de la clase
*
*
* */

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {

        //Entonces declarasmo un String un Texto Cualqueira}
        String texto ="Con ganas como en el 2011 2012 2013" ;

        //por ejemplo texto y hay muchos métodos en comun que son  parte de la clase object
        // usamos getClass() que es de la clase object
        // con este método hacemos reflexión o la estructura interna del objeto o de la clase
        // este método lo que retorna es una instnacia  del tipo Class
        // entonces Classe str
       Class  str = texto.getClass();

       //entonces imprimimos
       //retorna el nombre de la clase y su package str.getName() --> java.lang.String
        System.out.println("str.getName() = " + str.getName());
        //también tenemos getSimpleName() --> solo nos da el nombre de la clase
        System.out.println("str.getSimpleName()= " + str.getSimpleName());
        //tmabién tenemos getPackage() --> retonar el objeto  package java.
        System.out.println("str.getPackage() = " + str.getPackage());
        System.out.println("str.getPackageName() = " + str.getPackageName());

        System.out.println("******************************************+Listodo con getMethods()");
        /*Tambien podemos mostrar cuales son sus cmapos sus métodos sus atributos
        * simplemente usanndo un forech el tipo de datos que retorna
        * si quiero recorrer  los metodos por ejemplo si quiero recorrer getMethod
        * en el foreach siempre tiene que ir el tipo de los elementos del arreglo
        */
        for (Method method :str.getMethods() ) {
            //quiero imprimir el metodo  pero el metodo es un objeto  quiero
            // imprmir el nombre del método entonces invocamos el metodo getName()
            //esto va a listar todos los método de la clase String cada uno
            System.out.println("method = " + method.getName());

            //entonces el método getClass nos retorna infromación sobre el objeto
            //su estructura interna de la clase
        }

        System.out.println("***************Ejemplo con Integer**********************************************");

        //por ejemplo Integer num
        Integer num = 34;
        //Class Integre class igual a num.getClass()
        //entonces obtenemos el objeto class del objeto Integer
        Class intClass = num.getClass();
        Class objClass =  intClass.getSuperclass().getSuperclass();
        //imprmimor el objeto
        System.out.println("intClass = " + intClass);
        //imprmiendo el nombre completo
        System.out.println("getName() = " + intClass.getName());
        //imprmiendo el nombre getPAckageName()
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        //por ejemplo Superclass ¿Cual es la super clase? o la clase padre recordemos que todos lo objetos en java heredan de object
        //pero a su vez Integer Hereda  de Number
        System.out.println("intClass.getPackageName() = " + intClass.getSuperclass());
        //ahora a esta clase q  ue es Number quiero ver su clase padre deberia ser object
        //entonces de forma encadenada  getSuperclass().getSuperclass() al integer retorna Number y Number le otorgamos el método Superclas
        System.out.println("intClass.getPackageName() = " + objClass);

        System.out.println("******************Iteración por nombre de los metoso");

        //¿Que pasa si quiero mostrar todo los metodos de la clase objClass?
        for (Method methods: objClass.getMethods() ) {
            //aqui va imprmir el nombre todos los metodos de la clase objClass
            System.out.println("methods.getName() = " + methods.getName());
        }

     /*Entonces de esta forma podemos hacer una relfexión que es como un espejo de la erstructura Interna de los objetos
     * Un Api muy completa getCLass
     * */

    }
}
