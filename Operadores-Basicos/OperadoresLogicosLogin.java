import java.util.Scanner;

public class OperadoresLogicosLogin {

    /*
    * veamos un ejemplo basico para un sistema login
    * simple
    * que un usuario pueda ingresar su correo o nombreUsuarios
    * y contraseña desde el terminal por ejemplo usando la clase Scanner
    * y por validar un contraseña clave del sistema entonces si es correcta
    * lo validamos lo dejamos como autenticado en nuestra app
    * */

    public static void main(String[] args) {
        //primero defirnir un par de variables del tipo String
        String username= "Chubaldo";
        String password= "12345";
        //si queremos agregar otri usuario
        String username2= "admin";
        String password2= "admin123";

        //vamos a usar la clase Scanner para poder capturar estos datos del usuario
        // entonces la idea es si el username y el password es Chubaldo y el passowrod es 12345
        // lo autenticamos
        // recordemos pasar el inputString
        //System.in
        Scanner sc = new Scanner(System.in);
        // lo primero es capturar los datos del usuario
        System.out.println("Ingrese el username:");
        // le llamamos usuario para que no sea el mismo nombre
        // recordemos que no  coincide con el username del sistema
        String usuario= sc.next();
        // y lo mismo con el password
        System.out.println("Ingrese el password:");
        String contraseña= sc.next();

        //entonces ahora vamos a comparar usando el operador logico AND
        //  pero antes vamos a definir una varaible del tipo boolean
        //  esAutenticado= false lo dejamos en false por defecto
        boolean esAutenticado= false;

        //ahora con un if todas estas expresiones logicas donde se evalua
        //alguna expresión booleana ya sea con operadores logicos con AND o OR
        // operadores realcionales con el == ,<, > ,<= o >= ect
        // cualquiera lo podemos utilizar en los if
        // recordemos que todo flujo de control ya sea un if un for un while
        // cualquier flujo de control evalua una expresion booleana operadores logicos y relacionales
        // en este caso vamos a usar operadores lógicos  y realacionales para evaluar si corresponde
        // el username y el password con los datos del usario
        // tengamos en cuenta que estamos trabajando con el String vamos a partir con el username
        // como es un objeto el string no podemos comparar conel igual a si que usaremos el metodo
        // euals(); => es para comparar una igualdad entre dos valores que están dentro de los objetos
        // del tipo String en este caso esto seria equivalente al == por lo tanto equals() seria
        // una especie de operador realcional pero a nivel de objetos de instancia
        // si username.equals(usuario) &&
        //entonces tenemos operadores que se estan evaluando con operadores relacionales
        //agregamos or || con que una condicion sea true
        if(username.equals(usuario) && password.equals(contraseña) || (username2.equals(usuario) && password2.equals(contraseña)) ){
            // si esta autneticado lo dejamos en true
            esAutenticado = true;
            //y si no no esta autenticdo el else no es necesario
        }else{
           //si quisieramos un mensa donde digamo que el usuario o password no eiste
            System.out.println("usuairo no encontrado password equivocado");
        }
        //ahora con otro ir si autenticado es true
        //si es de forma automatica se
        if(esAutenticado ){
              //ejecuta este bloque
              //codigo privado que requiere autenticacion
              //concatenamos el usarname u
            System.out.println("Bienvenido a los pulques pagaste tu cover c:".concat(usuario).concat("!"));
        }else{
            //de lo cotrario se ejecuta este otro bloque
            //codigo publico le decimos al usuario que requerimos autenticación
            System.out.println("No pagaste wey x: ");
        }
        /*
        * Entonces a qui podemos tener una app de consoloa o app web
        * que pida username o password
        * */

    }
}
