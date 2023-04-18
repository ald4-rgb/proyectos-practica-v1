public class OperadorAsignacion {

    /*
    * Ejercicio de operadores de asignacion
    *
    * ¿Que son los opredadores de asignació?
    *
    * Se trabajan todo el tiempo con ellos una vairable
    * de cualquier tipo por ejemplo un int i = 5
    *
    * */

    public static void main(String[] args) {

        // el operador de asignacion es el =
        // = : asigna un valor a una variable ya sea un literal una instancia una clase cualquier cosa
        // sea una clase instancia, referencia objeto a una variable estamso usando el operador de asignacion
        int i = 5;
        //por lo tanto si tambien colocamos int  j =  i + 4
        System.out.println("i = " + i);
        int j = i +4;
        System.out.println("j = " + j);
        //no solamente esto si no que tambien tenemos otros ooperadores de asignación
        //tambien se conocen con opeadores combinadoso o compiestos
        // por ejemplo podriamos tener el i = i + 2;
        // a qui estamos anexando al i que vale 5  2  se lo volvemos a pasar al i
        // i vale 7 ahora
        i = i + 2;
        System.out.println("i = " + i);
        //pero hay una forma mas resumida de escriobir esto es como un atajo
        //en vez de colocar i = i + 2; solo anteponemos el operador
        i +=  5;
        System.out.println("i = " + i);
////////////////////////Compuesto resta//////////////////////////////////////////////////////////////////
        System.out.println(" **********reesta***************" );
        // el compuesto para resta por ejemplo j que vale 9
        j -= 4; // j = j - 4
        // es 5
        System.out.println("j = " + j);
//////////////////////multiplica //////////////////////////////////////////////////////////////////////
        System.out.println(" **********Multiplicar***************" );
        j *= 3;
        System.out.println("j = " + j);
//////////////////////Division  /////////////////////////////////////////////////////////////////////////7
        System.out.println(" **********Division***************" );
        j /= 3;
        System.out.println("j = " + j);
////////////////////////¿Que pasa con el string?//////////////////////////////////////////////////////////
        System.out.println(" **********COncatencaion***************" );
        //El string tiene el operador con el signo + para concatenar
        // si odemos usar la concatenación compuesta
        // vamos a tener un string
        // podriamos conjuntar una consulta sql
        // se puede hacer con cualquier cosa pero para el ejemplo usaremos una consulta
        // slect * clientes --> que busque todos los registros en la base clientes
        // y le damos una alias
        String sqlString = "slect * from clientes as c";
        //podemos ir combinando con otras clausulas sql por ejemplo con el where con el operador and
        // entonces sqlString += para concatenar
        // y a qui estamos aplicando el operador para combinar  o anexar  más contenido al string
        // por ejemplo para agragar una condicion where sea igual a chubaldo
        sqlString += "where c.nombre='Chubaldo' ";
        // y concatenamos and otra condicion
        // and c.activo=1  --> es decir que el cliente este activo
        sqlString += "and c.activo=1";
        //entonces ahora vamos a imprimir
        // va hacer todo el String con la concatencaion
        System.out.println("sqlString = " + sqlString);


    }

}
