import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.util.Date: es para trabajar con fechas estandar en el lenguaje java
* java.sql.Date : es para fechas de base de datos

* */

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        //vamos a crar una instnacia de la clase date
        Date fecha = new Date();
        Date fecha2 = new Date("yyyMMdd");
        //si quiero pintar la fecha actual simplemente fecha imprmimos el objeto
        //imprmimos l dia la hora minuto segudos y año
        System.out.println("fecha = " + fecha);
        //este fromato se puede costumizar por ejemplo usando la clase SimpleDateFormat
        //esta clase se importa del paquete java.text.SimpleDateFormat
        //vamos a crear la instancia
        //en el constructor podemo pasar  un patron un formqato que le queramos dar
        //que formato de fecha hay un estandar para agregar formato por ejemlp si queremos
        //incluir el dia podemos usar dd
        //formato mas simple
        SimpleDateFormat personalizar = new SimpleDateFormat("dd/MMMM/ yyyy");
        
        //fecha
        String fechaStr = personalizar.format(fecha);

        System.out.println("fechaStr = " + fechaStr);
        //formato con fecha y hora
        SimpleDateFormat personalizar2 = new SimpleDateFormat("'fecha': yyyy.MM.dd G 'at' HH:mm:ss z");

        String fechaStr2 = personalizar2.format(fecha);

        System.out.println("fechaStr2 = " + fechaStr2);


/*
*
* Fuente para formato de fecha java 17
* https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
*
* */
    }
}
