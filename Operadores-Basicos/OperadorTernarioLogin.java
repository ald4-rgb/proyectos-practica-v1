import java.util.Scanner;

/*
* Continuamos con el opeador ternadrio al igual que en la anterois clase de Loging
* con el fin de simplificar y ahorrar lineas de codigo
* */
public class OperadorTernarioLogin {
    public static void main(String[] args) {
        String[] userNames={"Chubaldo","admin"};// String[] userNames=new String[2]; userNames[0]= "Chubaldo"; userNames[1]=  "admin";
        String[] passwords={"12345","admin123",};// String[] passwords=new String[2];passwords[1]= "admin123"



        boolean esAutenticado= false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username:");

        String usuario= sc.next();

        System.out.println("Ingrese el password:");
        String contraseña= sc.next();

        for (int i = 0;i<userNames.length;i++){
            //System.out.println("i = " + userNames[i]);
            // pasamos el arreglo usernames[] corchete por cada elementos
            // por cada elemento accede
            //etonces dentro del for dejamo el if que autentica y valida
           /* if(userNames[i].equals(usuario) && passwords[i].equals(contraseña) ){
                //autentica y valida
                esAutenticado = true;
                //con break nos salimos del for
                break;
            }*/
            // no pusimos el else por que como es un loop repetivio choca con nuesatro arreglo de usuarios
            //por que ? por que cuando pasa a verdaero && cuando recorremos hacia delande nos marca uusaio no encontrado
            // por que repite la condicion

            esAutenticado =(userNames[i].equals(usuario) && passwords[i].equals(contraseña) )?  true:esAutenticado;
        }

        //retornamos la pregunt si se cumple damos el mensaje ed bievenida : si no se cumple la condició
        String mensaje = esAutenticado ? "BIenvenido a la wiki de java ".concat(usuario).concat("!") :
                " Usuario  contraseña incorrecta! \n lo sentimos requiere autenticación";
        //printamos nuestros mensaje
        System.out.println("mensaje = " + mensaje);


/*        if(esAutenticado ){
            System.out.println("Bienvenido a los pulques pagaste tu cover c:".concat(usuario).concat("!"));
        }else{
            System.out.println("usuairo no encontrado password equivocado");
            System.out.println("No pagaste wey x: ");
        }*/

    }
}
