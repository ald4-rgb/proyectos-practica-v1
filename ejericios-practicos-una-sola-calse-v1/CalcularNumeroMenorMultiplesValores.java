import java.util.Scanner;

public class CalcularNumeroMenorMultiplesValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int cantidad = sc.nextInt();

        if(cantidad < 10){
            System.out.println("Error: Debe comparar al menos 10 números enteros!");

        }else {
          int  menor = Integer.MAX_VALUE;
          int  numero;


            for (int i = 0; i < cantidad; i++) {

                System.out.println("Ingrese al cantidad de números" + (i + 1) + ",");
                numero = sc.nextInt();
                menor = (numero < menor) ? numero : menor;

                System.out.println("el numero menor es" + menor);
                if(menor < 10){
                    System.out.println("El número es menor a 10");
                }else{
                    System.out.println(" el numero menor es igual o mayor que 10!\"");
                }

            }
        }



    }

}
