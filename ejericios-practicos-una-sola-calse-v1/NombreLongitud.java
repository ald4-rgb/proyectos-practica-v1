import javax.swing.*;

public class NombreLongitud {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el segunod nombre");
        String nombre3 =JOptionPane.showInputDialog("Ingrese el tercero nombre");

        if(nombre1.split("").length > nombre2.split("").length  ){
            System.out.println(nombre1);
        }else  if(nombre1.split("").length < nombre2.split("").length){
            System.out.println(nombre2);
        }else if (nombre2.split("").length > nombre3.split("").length){
            System.out.println(nombre2);
        }else if (nombre2.split("").length < nombre3.split("").length){
            System.out.println(nombre3);
        }else if(nombre1.split("").length > nombre3.split("").length){
            System.out.println(nombre1);
        } else if (nombre1.split("").length < nombre3.split("").length) {
            System.out.println(nombre3);
        }


        // ajaja usando loops jejeje pero es sin loop el reto
    /*
    String[] nombre = {"Chublado Chelas Recortaneitor","Lalo Drinks"};
     for(int i = 0; i<nombre.length;i++){
       //  System.out.println(nombre[1]);
         if(nombre[0].split("").length > nombre[1].split("").length || nombre[0].split("").length < nombre[1].split("").length){
             System.out.println("tiene mas longitud es:"+nombre[i]);
             break;
         }
     }*/

    }
}
