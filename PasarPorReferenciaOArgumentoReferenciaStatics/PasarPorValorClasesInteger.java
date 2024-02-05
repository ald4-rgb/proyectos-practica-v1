public class PasarPorValorClasesInteger {
    public static void main(String[] args) {

        Integer i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);

        System.out.println("************Mandando a llamar con el metodo main al metodo test");

        test(i);

        System.out.println("Finaliza el método main con el valor de i (Se mantiene igual) = " + i);
    }

    public static void test(Integer i ){


        System.out.println("Iniciamos el metodo test con  i = " +i);


        i = 36;
        System.out.println("Finaliza el método test con i = " + i);

    }
}
