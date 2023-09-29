//ahora vamos a usar el método getTime que retorna un long un tipo numerico desde enro de 1970
//este formato de fecha numerico tambien se ele conoce en unix originalmente es parte de la plataforma unix
//que existe en una marca temporal se le conoce como timeStamp desde enero de 1970
//en unix se contabilisa la cantidad de segundos  a qui en java con el objeto date la cantidad de milisegundos
//pero si se divide por mil obtenemos los milisegundos pero practicamente es los mismo entonces es
// una representación que hace unix de la fecha en un formato númerico

import java.text.SimpleDateFormat;
import java.util.Date;

public class TiempoMilisegunods {


    public static void main(String[] args) {
        Date fecha = new Date();


        System.out.println("fecha = " + fecha);

        SimpleDateFormat personalizar = new SimpleDateFormat("dd/MMMM/ yyyy");

        //fecha
        String fechaStr = personalizar.format(fecha);

        System.out.println("fechaStr = " + fechaStr);


        //por ejemplo vamos a tener un for por que la idea es contabilizar la cantidad de milisegundos

        //lacular la iteración
        long j = 0;

        for(int i =0; i <1000000000;i++){
            j = i +j;
        }
        System.out.println("j = " + j);
        //creamos un nuevo objeto Date
        Date fecha2 = new Date();
        //restamos fecha - fecha2
        long tiempoFinal =  fecha2.getTime() - fecha.getTime() ;

        System.out.println("Tiempo transcurrido en el for= " + tiempoFinal);

    }
}
