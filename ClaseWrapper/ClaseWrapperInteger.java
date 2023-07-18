/*
* Integer anida un valor primitivo del tipo integer
*
* */


public class ClaseWrapperInteger {
    public static void main(String[] args) {

        //El tipo de referencia es Integer
        // por lo tanto es un objeto le vamos a llamar
        // no es buena practica ahora crear la instancia con el operador new Integer
        // esta decrapted --> Integer intObjeto = new Integer(21312312);
        // a partir de java 7 quedo decrapted de forma más automatica con el autoboxin
        // tambien podemos crearl de fomra estatica con el metodo valueOf y pasamos el Integer
        // Integer intObjeto = Integer.valueOf(21312312); --> forma explicita de crear el objeto del tipo Integer
        // se el conoce como unboxing toma el valor de un tipo primitivo literal y lo convierte a un objeto
        Integer intObjeto = Integer.valueOf(12767);
        //otra forma mas automatica que se le conoce como autoboxing  de  forma automatica va a tomar
        // de la literal  un valor primitivo entero y automaticamente lo convierte a un objeto
        // por lo tanto esta forma y la fomra anterior seria de forma totalmente iguales
        // una es explicita y la otra es implicita
        Integer intObjeto2 =127;
        //también podriamos tener un primitivo
        int intPrimitivo = 21321;
        // puede ser un primitivo o una varaible primitiva
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);
        //de forma automatica toma primitivo y lo convierte al objeto
        // autoboxing
        Integer intObjeto4 = intPrimitivo;
        //entonces eso seria la forma de convertir un primitivo  o una literal integer en un objeto referencia Integer
        //clase WrapperInteger
        System.out.println("intObjeto = " + intObjeto); 
        
        
        //¿Como puedo convertir al reves? un  objeto del tipo Integer de referencia a tipo primitivo
        //supongamso que tenemos  el tipo primitivo num
        //le quiero asginar el valor deel objeto integer sea sea el 1,2,3,4
        //esta forma es la automatica implicita integer y automaticamente se convierte en un primitivo
        //sin hacer nada simplemente se asigna
        int num = intObjeto2;
        System.out.println("num = " + num);
        //la otra forma explicita con el metodo intValue() este método retorna el entero primitivo 
        int num2 = intObjeto3.intValue();
        System.out.println("num2 = " + num2);

        //ahora supongamos con un String
        String valorTvLcd = "2131";
        //¿Como convertir esto en un entero?
        int valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

    //¿Ahora supongamos que tengamos un short?
    //un tipo de la clase Short no es un primtivo
    //de forma automatica va a tomar de la literal el entero primitivo
    // y lo convierte a un short siempre y cuando este dentro de un rango
    // el minimo y el maximo
    //por ejemplo si tranfromamos a un Integer a short
    //convertimos a un ShortVAlue
        Short shortobjeto = intObjeto.shortValue();
//mientras sea menor al valor ningun problema del maximo que sporta el short
        System.out.println("shortobjeto = " + shortobjeto);
//¿Qué pasa con el Byte? tambien se puede convertir
        Byte byteObjeto = intObjeto2.byteValue();
        //puede que tenga perdida de infromación recrodemos que el maximo es 127
        //mientras el valor este dentro de los rangos
        System.out.println("byteObjeto = " + byteObjeto);
        // tambien puedo convertir a un tipo Long
        Long longObjeto = intObjeto3.longValue();

        System.out.println("longObjeto = " + longObjeto);
    }
}
