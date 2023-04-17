import javax.swing.*;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //vamos a tener dos variables
        //el entero i igual a in valor
        //es importante mencionar que cuando tenemos  viariables
        // que son del mismo tipo que son integer o de tiopo string o cualquiero tipo
        //podemos definirlos en una sola linea
        int i = 8, j = 5;//int i = 8, j =5,suma =  i + j; // pudes descomentar para  ver que si funciona
        //tambien todo esto se puede acomodar en la misma linea
        int suma = i + j;
        //cuando sumamos hay una concatencación
        // se evaluan de derecha a ixquierca
        System.out.println("suma = " + suma);
        //por ejemplo si queremos sumar por ejemplo j
        // como vemos tenemos un string y va a concatenar un valor
        // pero si quisieramos sumar  por ejemplo j
        // como se trata de un String primero a lador izquierodp
        // ¿Que puedo hacer con String? lo puedo sumar como matematica
        // como expresion aritmetica por supuesto que no java sabe que con el +
        // se concatene entonces esto pasa hacer del tipo string  y luego
        // otra concatenacion  otra suma sabe que esto es un string y lo vuevle a concatenar
        // y el resultado seria distinto System.out.println("i + j = " + i + j);
        // si damos vuelta pasa lo mismo
        //System.out.println(i + j+"i + j = " );
        // pero si agragamos los parentesis hacemos una referencia a una operacion matematica
        // se cambia la prioridad  de los operadores o la presedencia siempre  los parentesis
        // tienen la presedencia o la prioridad maxima siempre dos enteros los suma
        // como ya tenemos  el entero el resultado de la suma ya se concatena con un String
        System.out.println("i + j = " + (i + j));
//////////////////////////////vamos la resta////////////////////////////////////////////////////////

        //entoncs el operador de resta el simbolo - 
        int resta  =  i -j;
        //imrimimo resta
        // pero en resta como no es una operador propio del String el +
        // el operador - no se aplica no existe
        System.out.println("resta = " + resta);
        //lo podriamos utilizar si quieremso un operador -
        // marca un error recordemos que + es un String la prioridad  es de
        // izquierda a derecha trata de concatenar hasta el i no hay probalema
        // pero hay un operador menos  y como tenemos un String
        // por que concateno ya un el numero i el String no reconoce el operador -
        // es decir no se puede aplicar a un tipo string pero si a un integer
        // por eso cuando concatenamos o restamos variables esto aplica tambien
        // a numeros o literales tenemos que si o si colocar los parentesis entones
        // con los parentesos indicamos (i - j)
        // luego concatena con el String
        // entonces el orden realiza la resta primero realiza la resta y luego concatena
        // y pasa exactamente lo mismo con la resta division y con el modulo
        // es decir el unico operador que podemos utulizar en conjunto
        // con String es el +
        System.out.println("i  - j  = " + (i  - j )); //System.out.println("i  - j  = " + i  - j ); // descomentar si querres ver el error

////////////////////////////////////////Multiplicación//////////////////////////////////////////////////////////////////////////////////////

        // con * es el operador para multiplicar 
        int multi = i * j;
        // imprmimos
        System.out.println("multiplicacion = " + multi);
//////////////////////////////////////////Divicion///////////////////////////////////////////////////////////////////////////////////////////

        //ahora con la divicion
        int divide = i / j;
        //cuanto seria con la divicion entera nos da uno como son enteros
        // no maneja decimal y el resultado de esta divicion lo aproxima
        System.out.println("divide = " + divide);
        // 8 divido en 5 es 1.6 por lo tanto falta el tipo flotante
        // pero tendremos otro detalle
        // el problema es que nos mostrata 1.0 y 8/5 = 1.6
        // por que no aparece el 1.6
        // lavarialbe divide2  maneja decimales pero la i & la j no
        // entonces seria el i & j convertirlos a tipo flotante
        // usamos float pero tambien puede ser double divide = (double) i/(double)j;
        float divide2 = (float) i/(float)j;// float divide2 = (float)divide; //puedes descomentar para probar es simolar
        System.out.println("div2 = " + divide2);

////////////////////////////Ahora veremos el resto o mejor conocido ccomo modulo ///////////////////////////////////////////////////////////

        // por ejemplo i
        // que significa i dividido entre j da un valoer entereo entero decimal
        // que es el residuo de la divicion
        int modulo = i  % j;
        System.out.println("modulo = " + modulo);
        //otro ejemplo es 19 % 5
        modulo = 19 % 5;
        System.out.println("modulo = " + modulo);
///////////////////////////////////////Otro ejemplo usando JOPTIONPNANE/////////////////////////////////

        // por ejemplo numero y usamos la clase JOptionPane para obtener un nuemro del usuario
        // hay que convertirlo en inteer ya que solo acepta parametro String
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "));

        // y a qui podemos preguntar if  si numero modulo 2  es igual  a 0 es por que el nuemro es par
        if(numero % 2 == 0){
            System.out.println("numero es par = " + numero);
        }// sino  entonces es impor
        else{
            System.out.println("numero es impar= " + numero);
        }
/*
*************************************************************************
* Este fue un pequeño calculo con el modulo usando el if para validar
* si es divicible por dos y no sobra nada  es par si sobra algo es impar.
* ***********************************************************************
* */



    }
    }
