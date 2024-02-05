
/*
*
* Ejercicio con switch case paer
*
* */


import java.util.Scanner;

public class SwitchCaseNombreMeses {
    public static void main(String[] args) {

        //usando el switch que lo pueda teclear el usuario usando la clase Scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el mes que necesita para su agenda");
           int mes = sc.nextInt();
           String nombreMes=null;

           switch (mes){

               case 1:
               nombreMes ="Enerio";
               break;
               case 2:
               nombreMes ="Febrero";
               break;
               case 3:
               nombreMes ="Marzo";
               break;
               case 4:
               nombreMes ="Abril";
               break;
               case 5:
               nombreMes ="Mayo";
               break;
               case 6:
               nombreMes ="Junio";
               break;
               case 7:
               nombreMes ="Julio";
               break;
               case 8:
               nombreMes ="Agosto";
               break;
               case 9:
               nombreMes ="Sptiembre";
               break;
               case 10:
               nombreMes ="Octubre";
               break;
               case 11:
               nombreMes ="Noviembre";
               break;
               case 12:
               nombreMes ="Diciembre";
               break;
               default:
                nombreMes = "indefinido";
           }
           //pintar el mes que nostros queramos
        System.out.println("nombreMes = " + nombreMes);


    }
}
