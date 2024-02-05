/*
* Setencia for usando arreglos
* */

import javax.swing.*;

public class IterandoArreglosSetenciaForPalabrasReservadas {

    public static void main(String[] args) {

        //para definir un arragleo
        // simpre con el tipo de dato y los corchetes
        // por ejemplo nombres
        String[] nombres = {"Doe","Sneak","Creed","Alter","jour","Crepp"};

        for(int i =0 ;i < nombres.length;  i++){
            //Que pasa si quiero omitir el primer nombre y el ultimo
            //podriamos utilizar un if y la palabra reservada continue
            if(nombres[i].equalsIgnoreCase("doe") || nombres[i].equalsIgnoreCase("Crepp")){
                // se salta con la iteracón actual con continua
                continue;
            }



            System.out.println(nombres[i]);
        }
        System.out.println("***************************** usando el metodo contains");
        // el metodo contains si repeta minuscular y mayusculas
        for(int i =0 ;i < nombres.length;  i++){
            //Que pasa si quiero omitir el primer nombre y el ultimo
            //podriamos utilizar un if y la palabra reservada continue
            if((nombres[i].contains("Doe")) || nombres[i].contains("Crepp")){
                // se salta con la iteracón actual con continua
                continue;
            }
            System.out.println(nombres[i]);
        }
        System.out.println("***************************** usando el metodo toLowerCase().contains()");
        // el metodo toLowerCase().contains()
        // si quremos usar esta forma ;i <= nombres.length -1
        // restamos uno
        for(int i =0 ;i <= nombres.length -1;  i++){
            //Que pasa si quiero omitir el primer nombre y el ultimo
            //podriamos utilizar un if y la palabra reservada continue
            if((nombres[i].toLowerCase().contains("DoE".toLowerCase())) || nombres[i].toLowerCase().contains("CrePp".toLowerCase())){
                // se salta con la iteracón actual con continua
                continue;
            }
            System.out.println(nombres[i]);
        }
        System.out.println("********ejemplo de buscar un nombre");
// la idea de esta ejemplo es buscar un nombre por

        //definimos una nueva variable
        //usamos el JOptionPane
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

    //primero definimos una variable
    boolean encontrado = false;


     //el for
    for (int i =0; i< nombres.length;i++){

        //aqui lo vamos a buscar si lo entonctramos lo dejamos en true
        //entonces preguntamos nombres vamos a buscar sobre el mismo arreglo
        // equalsIgnoreCase(nombre que inngreso el usuario)
        if(nombres[i].equalsIgnoreCase(buscar)){
            //si lo encontro es true
            encontrado = true;
            // y para que no siga iterando  y buscando en las siguiente iteraciones
            // ejemplo encontre doe pero sigue recoreidno break;
            break;

        }
    }

    if(encontrado){
        JOptionPane.showMessageDialog(null,buscar+" encontrado");
    }else{
        JOptionPane.showMessageDialog(null,buscar+" No existe");
    }


    }
}
