public class ExtensionDeUnArchivo {

    /*Ejericio para realizar un archivo workd pdf
    * un nombre de archivo con  alguna extensión
    * independiente a la cantidad  que tenga la extención
    * puede ser una imagen jpg

    * La idea de este ejericio es obetener de forma dinamica la extension del arvhivo
    * el arvhivo es un String con un nombre podemos aplicar los metodos ya vistos
    * substring(); length() charAt();
    *
    * * */

    public static  void main(String [] args){

        //creamos una vairable archivo
        //la extension podria ser cualquiera de cualquier tipo de archivo
        //la idea es que sea dinamico lo mas automatico posible 
        String archivo = "alguna_imagen.jpeg";
        //lo podriamos manejar con idexOf() del caracter o del string punto
        int i = archivo.indexOf(".");
        //Y si tuviermos uno con 2 putonos indexOf("."); ya no funcionaria usariamos lastIndexOf(".");
        // es mejor usar este emtodo por que podemos indicar a partir de la ultima ocurrencia
        String archivo2 = "vacaciones.imagen.jpeg";
        int j = archivo2.lastIndexOf(".");
        ///vamos a imprimir la cantidad de caracters con el length();
        System.out.println("archivo.length() = " + archivo.length());
        //podriamos tomar los ultimos 4 carcteres pero seria ded forma estatica
        //con el metodo subtring()
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        // pero la idea es que sea lo más automatico posible podriamos tomar el length();
        // el length es 18 y restamso 4 matematicamente length() = 18 - 4
        // java archivo.substring(archivo.length()-4) pero que pasa si tiene dos
        // ya no funciona ya no sirve
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4)  );
        //¿Como lo podriamos implementar? que se adapte a cualquier situacion se declara una variable int guardando la varaible String
        // solo funciona con los metodos que reciban puros integers entones
        // archivo.substring(i +1 ) --> podemos automatizar con mas uno solo incrementamos uno al caracter
        // int i = archivo.indexOf("."); en este caso el . parte como 0 de cero a una y con mas uno podemos incrementar dntreo del rango
        // .jpeg del 0 -4
        System.out.println("archivo.substring(i + 1) = " + archivo.substring(i +1 ));
        //y a qui desmotraremos que es mejor usar lastIndexof() que indexOf a partir de caracters

        System.out.println( "nombre origianl "+archivo2+"\narchivo2.substring(j +1) = " + archivo2.substring(j +1));

    }
}
