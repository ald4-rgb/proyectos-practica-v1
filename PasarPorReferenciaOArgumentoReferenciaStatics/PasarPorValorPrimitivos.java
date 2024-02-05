/*
* Pasar Por valor Vs Pasar por referencia:
*
* Pasar por valor:
*
*   En nuestro caso el método main
*   y vamos a tener otro metodo por ejemplo test
*   y el método test va amodificar el valor de esta vairable
*   al modificar el valor en test como se pasa por valor en test
*   no deberia afectar  ni cambiar el valor que tenia en el método
*   principal en el método main
*
* Pasar por referencia:
*   por ejemplo si el método test modifica un objeto  de referencia también se ve afectado en el método principal
*   por que de referencia por que apunta al mismo apuntador en la memoria se refiere a la mismam instancia
*   mienstras cuando es valor no solamente cambia el valor en una parte  pero no tiene por que afectar
*   en la otra parte en el método principal
*
* */

public class PasarPorValorPrimitivos {

    public static void main(String[] args) {
        //vamos a tener una vairable del tipo integer primitica
        //para poner en contexto toda variable primitiva siempre se pasa por valor
        //en el metodo main se mantiene intacto con el valor original
        int i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);

        System.out.println("************Mandando a llamar con el metodo main al metodo test");
        //ahora ivocamos en el metodo main el metodo test(pasamos el valor de tipo int ) por argumento pasamos la varaible i
        //entonces el metodo main envia un mensaje al metodo test()
        test(i);
        //despues del test vamos a pintar i entocnes finaliza el método test();
        //vuelve a imprimir 10 y no un valor a qui se pasa el valor una referencia a un objeto
        //por lo tanto se mantiene intacto se mantiene en 10 y  no en 35 a pesar de que en el otro metodo se cambio
        //Aun que cambiabemos a Integege a una refrencia siguira siendo 10
        System.out.println("Finaliza el método main con el valor de i (Se mantiene igual) = " + i);
    }
    //la idea es tener otro método entonces lo vamos a crear
    //siempre de un métodfo por que siempre se pasan datos objeto a otro mediante métodos entonces necesitamos implementar este método
    //public . metodo publico
    //static: metodo estatico, el método estatico se puede crear sin necesidad de crear el objeto simplemente usando el nombre de clase o de forma directa si estamos en otro
    //        método estatico entonces el main puede invocar este método sin ningun problema ya que ambos son estaticos
    //void : no devuelve ningun valor no retorna nada
    // tenmos que pasar por valor el parametro del tipo int indicamos el tipo el nombre de esta vairable
    public static void test(int i ){
        //vamos a imprimir
        // i es el argumento que estamos recibiendo por parametrov
        System.out.println("Iniciamos el metodo test con  i = " +i);

        //vamos a cambair el valor de i
        i = 36;
        System.out.println("Finaliza el método test con i = " + i);

    }

    /*
    * Conclución  las clases Integer String Double Float etc que representaan a los primitivos son inmutables por lotanto
    * cada que se modifica el valor se retorna una nueva instancia no mantiene la instnacia anteroir es inmutable retorna
    * una nueva isntnacia por lo tanto si estamos pasando pro referencia y por valor
    *
    * */

}

