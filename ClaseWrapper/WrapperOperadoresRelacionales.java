public class WrapperOperadoresRelacionales {


    public static void main(String[] args) {
        //dos objetos Integer
        Integer num1 = Integer.valueOf(1000);
        // pero tambien podemos coloclaro de forma immplicita de forma automatica
        // a esta vairable Integer num2 le pasamos la referencai num2
        Integer num2 =num1;
        //cuanod lo pintamos nos dan los mismo números solo que hay una diferencia
        // son objetos que contiene un valor anidado encapsulado dentro de la instancia
        // del Integer
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //vamos a pintar para ver si son iguales son el mismo objeto
        // debe ser true por que num2 contiene la instancia del num1
        // la referencia el objeto la instancia hacia el mismo objeto
        // es decir es un objeto que esta asignado a 2 varaibles
        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        //vamos a hacer una cambio

        System.out.println("*******************un cambio***************************");
        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //nos da false por que no estamos haciendo referencia la instancia de ese mismo  objeto
        // no son el mismo objeto es decir contiene el mismo valor pero no la misma isntancia
        // ya que num2 se el asigna otroa objeto otra isntancia
        //cuando son objetos compara si son por instancia compara si estas dos isntancias corresponden a lo mismo
        // dicho de otra forma si estos dos objetos corresponden a la mismo isntancia
        //¿Como puedo comparar un objeto referencia como el integer Float etc?
        //esto se aplica exactamente igual al Integer al Float al Double
        System.out.println("Son el mismo objeto ? "+ (num1 == num2));

        //¿Como puedo comparar por el valor? con el método equals()
        System.out.println("Son el mismo valor ? "+ (num1.equals(num2)));
        //otra forma intValue() recordemos que el igual es para comparar primitivo por valor
        System.out.println("Son el mismo valor ? "+ (num1.intValue() == num2.intValue()));

        num2 = 2000;


        //por ejemplo con boolean qiero saber si numero2  o numero 1 es mayor numero 2
        //cuando usamos el mayor o menor igual
        // de forma automatica puedo trabajar con tipos de referencia  y por debajo se convierten
        // usando autounboxing
        // autoboxing  : empaquetamos y convertirmos un primitivo en una clase Wrapper
        // autoAboxing : desempaquetar es decir pasar a un valor primitivo de referecnia a primitivo
        // al final lo que hace por dejabo es convocar el intValue
        boolean condicion = num1 > num2;
        //ambos son iguales en valor pero no en instancia
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();


        System.out.println("condicion2 = " + condicion2);
    }
}
