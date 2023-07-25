public class WrapperBoolean {
    public static void main(String[] args) {
        //vamos a tener dos enteros
        //del tipo referencia
        // a qui tenemos definidos dos variables del tipo Integer
        //objetos de referencia  se parado por coma
        Integer nuemro1,nuemro2;
        // luego le damso el valor
        nuemro1 = Integer.valueOf(0);
        nuemro2 = 2;
        //tambine se puede hacer con integer.valeof

        //vamos a tener un tipo booleano
        //si num1 es mayor que num2
        boolean primitivoBoolean = nuemro1 > nuemro2; //por lotanto es false

        //con mayuiscula vamos a usar Boolean pero con referencia
        //este es la Clase Wrapper que anida o que envualve al primitivo
        //podemos colocar un valor true o false y automaticamente se hace el autboxing
        //se convierte y se empaqueta en esta clase
        Boolean objetoBoolean = true;
        //tambine tiene esta forma explicita
        //colomacmos el valor Boolean objetoBoolean2 = Boolean.valueOf(boolean o String);
        Boolean objetoBoolean2 = Boolean.valueOf(primitivoBoolean);
        //tendremos otro objeto más del tipo referencia Boolean una variable tipo referencia
        //Este va hacer el el Boolean.valueOf(String);
        Boolean objetoBoolean3 =  Boolean.valueOf("false");

        //por lo tanto seria falso por que objeto Boolean se hace unboxing del primitivo de la varaible primitvo boolean
        // objetoBoolean3 y esta es una nueva instancia a partir del String false
        //pintamos cada uno
        System.out.println("primitivoBoolean = " + primitivoBoolean);
        ///
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("objetoBoolean3 = " + objetoBoolean3);

        //comparando dos objetos Boolean
        //objetoBoolean2 == objetoBoolean3 pregunto si esta instnacia objetoBoolean2 es igual a objetoBoolean2 esta
        // nos da true lo que hace es que compara por referencia y por objeto o compara por el valor de estos objetos
        // ambos son falso pero en teoria son diferentes instancias
        // pero nos da true esto significa que no se comporta igual que los enteros y los tipos String
        // Entonces con el Boolean se puede comparar o no
        System.out.println("comparando 2 objetos Boolean : " + (objetoBoolean2 == objetoBoolean3));
        //pero Tambien con euqlas
        System.out.println("comparando 2 objetos Boolean : " + (objetoBoolean2.equals(objetoBoolean3)));

        System.out.println("comparando 2 objetos Boolean : " + (objetoBoolean == objetoBoolean2));
        System.out.println("comparando 2 objetos Boolean : " + (objetoBoolean == objetoBoolean3));

        //y como podemos convertir un tipo primitivo boolean  tambien puede ser al reves
        // a travez de este método obtenemos el valor booleano primitivo retorna un primitivo
        boolean primitivoBoolean2 = objetoBoolean2.booleanValue();

        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);
    }
}
