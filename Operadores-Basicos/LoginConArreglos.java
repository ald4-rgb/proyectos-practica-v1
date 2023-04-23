import java.util.Scanner;

public class LoginConArreglos {

    /*¿Como mejorar optimizar el codigo que implementamos
    *
    * Se puede mejorar
    *
    * */

    public static void main(String[] args) {

        String userName= "Chubaldo";
        String password= "12345";

        String username2= "admin";
        String password2= "admin123";


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username:");

        String usuario= sc.next();

        System.out.println("Ingrese el password:");
        String contraseña= sc.next();


        boolean esAutenticado= false;


        if(userName.equals(usuario) && password.equals(contraseña) || (username2.equals(usuario) && password2.equals(contraseña)) ){

            esAutenticado = true;

        }else{

            System.out.println("usuairo no encontrado password equivocado");
        }

        if(esAutenticado ){
            System.out.println("Bienvenido a los pulques pagaste tu cover c:".concat(usuario).concat("!"));
        }else{
            System.out.println("No pagaste wey x: ");
        }
    }
}
