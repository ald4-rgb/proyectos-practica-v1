/*
*
* Pasar argumetnos en el Intelliji
*
*
* siempre ejecutamos con run pero no pasa ningun argumento
* Entonces la forma seria configurar la ejecucion en el readme.md viene la ejecucion
* */


public class PasarArgumentosIntelliji {

    public static void main(String[] args) {

        if(args.length !=  3){
            System.out.println(" Por favor Ingrese una operacion y dos numeros (suma,resta,div.mult)" );
            System.exit(-1);
        }

        String operacion = args[0];


        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);


        double resultado = 0.00;

        switch (operacion){
            case "suma":
                resultado = a + b;

                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "divicion":
                if(b ==0){
                    System.out.println("No se pude divir entre cero");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            //si no se aplica ninguno podriamos sumar
            default:
                resultado =  a + b;
        }

        //vamos a pintar el resultaso
        System.out.println("El resultado de la operación es  = "+operacion+" es :"+ resultado);
    }

}
