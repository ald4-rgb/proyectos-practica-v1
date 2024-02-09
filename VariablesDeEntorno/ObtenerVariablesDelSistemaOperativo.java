
/*
*
* Todos los sistemas operativos manejan variables de entorno para configuraciones
* por ejemplo para registrar rutas de nuestras apps,directorios parametros de cualquier
* tipo por ejemplo cuando instalamos java instalamos JAVA_HOME para configurar la ruta
* base o raiz del jdk y tambien tenemos la variable de entorno path donde guardamos y regsitramos
* rutas de nuestras apilaciones para poder ejecutar comandos en la terminal
*
* ¿Como acceder a estas variables de ambinte?
*
*   Accederemos a estas variables de ambiente desde java utilizando la clase System con el metodo getenv()
* */

import java.util.Map;

public class ObtenerVariablesDelSistemaOperativo {
    public static void main(String[] args) {
        //este método getEnv() de la  clase System va a retornar un objeto del tipo Map<K,V> de java
        //con todas las variables de entorno
        //Map<k,j> : un map en java es como un arreglo asociativo que asocia valores que están guardados con un nombre
        //entonces guardamos elementos objetos de cualquier tipo y lo podemos asignar un nombre entonces se le
        //conoce ccomo llave y valor.
        // tenemos que indicar con los paretnevis triangulares los tipos de datos donde el nombre es de tipo String
        // y el valor tambien
        // Map<String,String> valEnv = System.getenv();
        Map<String,String> valEnv = System.getenv();

        //pintamos varaibles de ambeinte o entronos del sistema
        System.out.println("Varaibles de ambeinte del sistema = " + valEnv);

        //como puedo obtener una en particular tambien con el mismo metodo System.getenv();
        //pero pasamos el nombre de la varaibel de entorno por argumento
        String username = System.getenv("USERNAME");

        System.out.println("username = " + username);
        //ahora veamos JAVA_HOME tiene que ser el mismo nombre de la varaibel de ambiente
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME = " + javaHome);
        //otra más por ejemplo tempDir
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        //varaible path
        String path = System.getenv("PATH");
        System.out.println("PATH = " + path);

        //tambien con el objeto valEnv de la varaible de ambiente de este mapa que obtenemos
        //a traves de System.getenv(); tambien podemos obtenerlo a travez de ese objeto que creamos
        // seria valEnv.get("PATH");
        //entonces valEnv --> el objeto del Map<k,j>
        //valEnv.get("...") --> el método get del mapa pasamos el nombre o la llave con la cual guardamos o se
        //guarda esta varaible de entonrnno en el diccionario
        String path2 = valEnv.get("Path");
        System.out.println("PATH2 = " + path2);

//el problema es que no se va a mostrar hay que reniciar el id este solo funciona con windows
        String appEnv = valEnv.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);
//esta solo esta creada en widnows no olvidar reiniciar el ide
        String saludar = valEnv.get("SALUDAR_HOLA");
        System.out.println("SALUDAR_HOLA = " + saludar);

//si quiero iterar el mapa por ejemplo con un for si quiero iterar este diccionario asociativo uno por uno
//podemos usar un foreach

        System.out.println("----- listar Iteración mapa de varaibles de entorno -------------------");
//keySet() --> retorna un conjunto un set con los nombres de llaves

        for (String key: valEnv.keySet()) {
            //por cada nombre voy a pintar  su valor la varaible valEnv
            //recordemos que la varaivle de ambiente se obtiene por su valor valEnv.get();
            //valEnv.get(key) entonces por cada nombre de llave o key leemos y retornamos el valor
            //con el metodo get entonces mostramos la llave con su valor
            System.out.println(key +" =>"+valEnv.get(key));
        }



    }
}
