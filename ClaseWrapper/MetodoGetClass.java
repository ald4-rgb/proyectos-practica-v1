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
        System.out.println("str.getPackage() = " + str.getPackageName());



    }
}
