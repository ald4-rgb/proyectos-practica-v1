
/*
* Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente
* */

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Capacidad de su tanque de combustible");
        double capacidadMaxima = sc.nextDouble();

        String tanquesito=capacidadMaxima==70?"tanque lleno":(capacidadMaxima>=60 && capacidadMaxima<70)?"Estanque casi lleno":(capacidadMaxima>=40 && capacidadMaxima<60)?"Estanque  3/4":
                (capacidadMaxima>=35 && capacidadMaxima<40)?"Medio Estanque":(capacidadMaxima>=20 && capacidadMaxima<35)?"Suficiente":(capacidadMaxima>=1 && capacidadMaxima<20)?"Insuficiente":"llene tanque";
        System.out.println(tanquesito);



       /* Una forma con if-else

        if(capacidadMaxima ==70){
            System.out.println("tanque lleno");
        }else if(capacidadMaxima >= 60 && capacidadMaxima <70){
            System.out.println("casi lleno");
        }else if(capacidadMaxima >= 40 && capacidadMaxima <60){
            System.out.println("Estanque  3/4");
        }else if(capacidadMaxima >= 35 && capacidadMaxima <40){
            System.out.println("Medio Estanque");
        }else if(capacidadMaxima >= 20 && capacidadMaxima <35){
            System.out.println("Suficiente");
        } else if (capacidadMaxima >=1 && capacidadMaxima < 10){
            System.out.println("insuficiente");
        }*/

    }
}
