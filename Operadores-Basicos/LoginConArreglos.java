import java.util.Scanner;

public class LoginConArreglos {

    /*¿Como mejorar optimizar el codigo que implementamos
    *
    * Se puede mejorar
    *
    * que pasa  si queremos 10 usuarios  tendriamos que modificar el if y agragar el OR 10 ves
    * del username1 username2 ... username nvecees no es la froma mas optimizada
    * para eso podriamos usar arreglos usando un for foreach iteralbe por cada elemento
    * del arreglo si por cada elemto username de ese elemento de ese arreglo es igual
    * al que ingreso el usuario y lo mismo con el password a si esta más optimizado
    * esto seria a travez de una iteración de un for de esa forma nuestro queda mucho
    * más limpio
    *
    * podemos usar por ejemplo arreglos pero tambien hay otro tipo de estructura de datos que son
    * el api de coleccion de java .
    *
    * ¿Pero que es un arreglo en java ?
    *   un arreglo nos pertmite almacenar objetos o variables o tipos de datos también puede
    *   puede ser primitivo, pero están asociado siempre al mismo tipo de dato es decri dentro
    *   de un arreglo podemos guardar elementos que son del mismo tipo de dato por ejemplo un
    *   array de Strings tal como tenemos en el metodo main que son los argumentos solamente
    *   podemos guardar elementos del tipo String podemos tener un arreglo de enteros primitivos
    *   permite guardar datos .
    *
    *
    *
    * */

    public static void main(String[] args) {

        //usaremos del tipo String por que vamos a guardar usuarios en este array
        // recordemos que un arreglo en java es del tipo  referencia
        // para crear una instnacia de un arreglo se usa el tipo que va a guardar o va a contenr este elemnto
        // y la cantidad de elementospor ejemplo va a tener dos elementos
        // entonces tenemos el arreglo users para guardar nombre de usuarios con capacidad de dos elementos
        // cuando colocamos 2 lo que hace es reservar en memoria 2 espacios para guardar chubaldo y el admin
      /*  String[] userNames=new String[2];
        //entonces con los corchetes indicamos el nombre del arreglo y con los corchetes indicamso la posicion donde lo vamos a guardar
        //el indice 1 corresponde al espacio 0 y el espacio 2 corresponde al indice 1
        userNames[0]= "Chubaldo";
        //por lo tanto admin correspoden al indice 1
        userNames[1]=  "admin";
        //Ahora guardamos nuestras contraseñas en otro array como tenemos 2 usernames tendremos 2 contraseñas
        String[] passwords=new String[2];
        passwords[0]= "12345";
        passwords[1]= "admin123";*/

        //otra forma de hacerlo puedes descomentar la forma anteroir
        //esta forma es mas simplificada
        //usando llaves podemos definir un arregls de una manrea mas simple
        //comenta este codigo si quieres ver como funciona la primera forma
        String[] userNames={"Chubaldo","admin"};// String[] userNames=new String[2]; userNames[0]= "Chubaldo"; userNames[1]=  "admin";
        String[] passwords={"12345","admin123",};// String[] passwords=new String[2];passwords[1]= "admin123"



        boolean esAutenticado= false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username:");

        String usuario= sc.next();

        System.out.println("Ingrese el password:");
        String contraseña= sc.next();
    //tenemos nuestra estructura de datos con arreglo

        //vamos a iterar utilizando un for para que sea de forma dinamica don el primer elemento es el cero
        //inicializamos el primero contador en cero  ; minetrar el i sea menor que la cantidad de elemntos userNames.length
        // va a iterar; incrementamos el contador un postincrement
        for (int i = 0;i<userNames.length;i++){
            //System.out.println("i = " + userNames[i]);
            // pasamos el arreglo usernames[] corchete por cada elementos
            // por cada elemento accede
            //etonces dentro del for dejamo el if que autentica y valida
            if(userNames[i].equals(usuario) && passwords[i].equals(contraseña) ){
            //autentica y valida
                esAutenticado = true;
                //con break nos salimos del for
                break;
            }// no pusimos el else por que como es un loop repetivio choca con nuesatro arreglo de usuarios
             //por que ? por que cuando pasa a verdaero && cuando recorremos hacia delande nos marca uusaio no encontrado
            // por que repite la condicion
        }
        //a qui solo validamos si esta autenticado
        if(esAutenticado ){
            System.out.println("Bienvenido a los pulques pagaste tu cover c:".concat(usuario).concat("!"));
        }else{
            System.out.println("usuairo no encontrado password equivocado");
            System.out.println("No pagaste wey x: ");
        }


    }
}
