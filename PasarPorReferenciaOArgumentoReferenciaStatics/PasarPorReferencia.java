
/*
*
*  Vamos a trabajar con un arreglo de enteros
*
*
* Las clases inmutables son cuando cambia un valor lo que hace es cambiar la referencia el objeto
* mantiene intacto la instancia que tenia antes por lo tanto no afecta a la instancia anterioir
* se mantiene intacta.
* ---------------------
*   Pasar por referencia un objeto 
*   Ejemplos usando arregl referencia  arreglos
*
*   Si usamos referecnias en arreglos tambien son de referencia
*   si usamos una referencia en un arreglo lo que se pasa en esa referencia
*   es un puntreo hacia una instancia real un arreglo real que esta guardado
*   en memoria entonces se pasa un puntero una  direccion apunta a esa referencia
*   por lo tanto si cambia un valor en cualquier mètodo tambien va afectar al mètodo main
*   donde se creo esa instancia esa referencia
*
*
* */

public class PasarPorReferencia {
    public static void main(String[] args) {

        //iniciamos declarando un array de tipo integer primitivo
        int [] edad  ={10,11,12,14};
        //la idea de este método test es iterar con un for cambiar los valores de cada posicion
        for (int i = 0; i < edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        //antes de llamar al método test
        System.out.println("*************************************"+"Antes de llamar  al método test");
        //pasamos edad al método test
        test(edad);
        //ahora vamos a voler a recorrer con for deberian ya haber cambiado los datos
        //significa que estamos pasando por referencia apunta al mismo puntero en la memoria
        // es el mismo objeto
        // diferencia del primitico se pasa por referencia y no por valor
        //entonces para resumir este segunod for imprimme los valores del arreglo modificados
        // por ser de referencia mantiene el cambio para ser modificado en el método test
        for (int i = 0; i < edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        //despues de llamar a métdo test
        System.out.println("Despues de llamar  al método test");
    }
    //declaramos un método estatico
    //a qui en este mètodo modificamos
    public static void test(int []edadArreglo ){
        //iniciamos el método test
        System.out.println("Iniciamos el método test");
        //edadArreglo en estefor es el objeto o nombre de la variable a qui corresponde al parametro
        // que pasamos en el metodo
        for (int i = 0; i < edadArreglo.length ; i++){
            //recorremos
            //vamos a modificar incrementamos 20 cada uno de los valores de edad
            edadArreglo[i] = edadArreglo[i] + 20;

        }
        System.out.println("fin el método test");

    }

}
