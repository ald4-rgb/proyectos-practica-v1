public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

//un ejemplo simple esta buscando una letra en un caracter

        //vamos a tener una oracipn o frase
        // la idea es buscar un cracter  o una letra  dentro de esta frase
        //  pero se podria repetir varias veces entonces la idea es  con tador cuantas veces
        // se esta repitiendo ese caracter
        // por ejempoo podria se un trabalenguas
        String frase = "tres tristes trigues tragan trigo en un trigal";
        String palabra = "trigo";
        // lo calculamos ocn el length()
        int max = frase.length();
        int maxfrase = frase.length();
        // declaramos maxPlabra
        int maxPalabra = palabra.length();
        // la cantidad comenzando en cero
        int cantidad = 0;
        //incluso mejor todavia
        char letra = 'g';


        //¿Como podemos recorrer esto? con un for
        // inizializamos el i mientras el i se menor que el max
         for (int i = 0; i < max; i++) {
            //a qui tenemos que buscar con un if
            //por ejemplo si cada caracter del String
            // frase.charAt(cada indice del string)
            // si es igual es por que lo encontro
            // pero si es distinto que continue
            // si es disntinto al caracter t
            if (frase.charAt(i) != letra) {
                //vamos hacer un continue
                continue;
            }
            //contamos la cantidad de veces  que t se encuentra la frase
            //entonces cadidad le vamos sumando uno
            // si igual suma la contidad por que son iguales
            cantidad++;

        }
// imprimimos la cantidad y encontrado n catidad de veces
// concatenar '"+letra+"' --> con comilla simple
        System.out.println("Encontrado = " + cantidad + "veces el caracter '" + letra + "' en la frase");
////////////////////////////////¿Que pasa si quiero buscar una palabra?////////////////////////////////////////7
        System.out.println("******************************************Que pasa si quiero buscar una palabra");

        //¿Como podemos recorrer esto? con un for
        // inizializamos el l mientras el l se menor que el max
        buscar:
        for (int l = 0; l < maxfrase; l++) {
            //va a tomar el valor de i el valor inicial de i
            int k = l;
            for (int j = 0; j < maxPalabra; j++) {
                // aqui comparamos con palabra
                //k++ usamos un postincremento para que tome primero el valor  y despues incrementa  toma el
                // valor de k =0
                // incrementa k vale 1  y va comparando  caracter por caracter
                // el r compara la palbar
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    //vamos hacer un continue
                    //hamos un continue pero no en este for si no en el for padre para eso usamso etiquetas
                    // continua pero en el for padre de la frase
                    continue buscar;
                }
            }
            //cuando lo encuentra se sale el for y aumenta la cantidad es decir  se encontro

            cantidad++;

        }

        System.out.println("Encontrado = " + cantidad + " vececes palabra '" + palabra + "' en la frase");

    }
}
