public class PresedenciaOPeradores {

    /*
    * La precedencia de los operadores era de
    * izquierda a derecha pero esto no siempre se
    * aplica  del operador AND Y OR
    * siempre va a tener prioridad el AND antes
    * que el OR
    * */

    public static void main(String[] args) {

        // vamos a definir algunas variables para comparar sus relaciones por ejemplo
        int i = 3;
        // vamos a tener un byte
        byte j = 3;
        //otra varaible del tipo float 127e-7f que sea exponente
        float k = 127e-7f;
        // del tipo double l
        double l = 2.1413e3;
        //de momento para que sea distinto o reales vamos a tener un boolean
        boolean m = false;

        //entonces b4
        // i igual a j OR
        // k menos que el AND
        //  m sea igual a true
        boolean b4= i == j || k< l && m == true;
        //como vemos el AND siempre va a tener preferencia antes que el OR
        // entonce como i == j y l < k son verdaderos y m == true es falso
        // el resultado final va hacer true
        // siempre primero resuelve el AND lo que compara en realidad es l < k && m == true
        System.out.println("b4 = " + b4);
        //es lo mismo que esto
        // se evalua la expresion completa a false por el AND de que si falla uno falla todo
        // lo ocmpara con OR y como es un OR finalmeente es true
        boolean b5= i == j || (l < k && m == true);
        System.out.println("b5 = " + b5);
        //primero que se resuelva esto (i == j || k< l)
        boolean b6= (i == j || k< l) && m == true;
        //ambos son true  y un true con  un false con el operador AND es false
        // cambiaria a false
        //entonces es muy importante la prioridad en JAVA el AND tiene una prioridad sobre
        // el OR
        System.out.println("b6 = " + b6);
        //veamoslo de una forma mucho mas explicita
        // true OR
        // true AND
        // false
        //¿Cual va hacer el resultado?
        boolean b7 = true || true && false;
        //va hacer ture  un false con true es false y un true con ture es true
        System.out.println("b7 = " + b7);
        //ahora si colocamos los parentesis
        boolean b8 = (true || true) && false;
        //como resultado nos da un false por la presedencia primero evalua el AND
        System.out.println("b8 = " + b8);
    }
}
