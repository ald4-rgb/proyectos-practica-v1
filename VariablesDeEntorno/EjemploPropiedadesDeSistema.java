import java.util.Properties;

public class EjemploPropiedadesDeSistema {

    public static void main(String[] args) {

        //por ejemplo si quiero obtener el nombre del usuario del sistema operativo
        //user.name : esta seria la llave
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //con otro ejemplo home
        String home = System.getProperty("user.home");
        //ruta del usuario del sistema operativo
        System.out.println("home = " + home);

        //el workSpace el directorio
        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);
        //vaersion de java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

       //lineSeparator o salto de linea
        String lineSeparator = System.getProperty("line.separator");
        //aqui vamos a concatenar otro String para que haga el salto de linea
        System.out.println("lineSeparator:" + lineSeparator+"una linea nueva..");

        //listamos todas las propiedades del sistema
        //a qui retornamos el conjunto completo
        Properties properties = System.getProperties();

        //entonces para listar seria properties.list() y pasamos el System.out
        //properties.list(System.out)
        //entonces de esta manera vamos a obetener la lista completa de las coniguraciones
        properties.list(System.out);

    }
}
