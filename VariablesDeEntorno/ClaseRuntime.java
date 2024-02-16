/*
*
* Como ejecutar alguna aplicacón del programa del S.O utilizando la clase Runtime
* Y tambien se pude conbinar con el System.getProperty para obetener el sitstema opertativo
* el nombre por ejemplo sabes si es linux,widnows o unix
* y deacurdo al S.O ejecutar el notepad como editos de texto y en caso de linux unix el gedti
*
* */


public class ClaseRuntime {
    public static void main(String[] args) {

        //lo primero es el Runtime de java.lang
        //que entre varias cosas nos permite ejecutar aplicaciones con el metodo exe();
        //entonces invocamos la clase Runtime y el método estatico Runtime.getRuntime();
        //obtejemos la instancia de tiempo ejecucion de este objeto
        //como se ejecuta un programa por ejemplo el  editor de texto  en nodepad que nos retorne
        //un objeto de tipo process
        Runtime rt = Runtime.getRuntime();
        //Invocamos la clase Priocess de java.lan
        //lo dejamos definido simplemente declarado
        //una variable si la isntancia toadavia por que la isntnacia devuelve retorna
        //el emetodo execute(); ===> exec()
        Process process ;

        //entonces validamos con el sistema operativo if y System.getProperty()
        //System.getProperty(): la usamos por que solamente vamos a buscar por el S.O
        //recrodemos qeu retrona un String
        if(System.getProperty("os.name").)
    }
}
