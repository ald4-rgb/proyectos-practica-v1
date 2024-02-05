import java.util.Scanner;

public class ForSinUsarMultiplicacion {


    /*
    * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

    *Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 ;
            num1 = sc.nextInt();
        int num2 ;
            num2 = sc.nextInt();

        int resultado = 0;

       if(-1 <num1 && -1 <num2 ){}

        int valorAbsuluto= num1;

        boolean a =  valorAbsuluto > -1;

        if (a ){valorAbsuluto = num1;}else {  valorAbsuluto = -num1;}
        for (int i = 0; i < valorAbsuluto  ; i++){
                resultado +=  num2;
        }
       if ((!a  && a) || !a ){
            System.out.println("*** transformo");
            resultado =  -resultado;

        }

        System.out.println("resultado = " + resultado);


    }


}
