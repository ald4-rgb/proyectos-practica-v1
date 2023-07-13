/*Minetras sea true funcionan estas sentencias de ocntrol while(){} do{}while();*/


public class FlujoControlWhileDoWhile {

    public static void main(String[] args) {

        //la idea de este ejercicio es iterar  que el valor ir sea menos a un limite
        int i = 0;

        while (i <5){
            System.out.println(i);
              i++;

        }
/////similar con el do{.....} while(setencia);
        System.out.println("**********do{.....} while(setencia);");
        int j = 0;

        do{
            System.out.println(j);
            j++;
        }while(j <5);
///sereie de fibonacci con un while
        System.out.println("**********serie de fibonacci con un while");
        //inicializo mi while
        int l = 0;// mi whilesito
        int a = 0;
        int b = 1;
        int c = 1;

        while(l <=5){
            System.out.print(c+",");//posicion l 0 -> 1 l 1 -> 1
            c = b +a; //1 = 0 +1
            b = a;  // 1 =1
            a = c;
            l++;
        }
///////serie de fibonacci con do{....} while()

        System.out.println("\nserie de fibonacci con do{....} while()");
        //como puedo entender este recorrido magico
        int fibonacci= 0;
        int x = 0;
        int y = 1;
        int z = 1;
        do{

            fibonacci++;
            System.out.print(z+",");
            z = x +y;
            y = x;
            x = z;
        }while (fibonacci <= 5);
//////////////////////////la idea del while//////////////////////////////////////////////////////////////////7
        System.out.println("\n*********otro ejemplo usando otro while con h");
        /*la idea del while es ejecutar un bloque mientras se cumpla la condición*/
        //otro ejemplo usanso boolean
        int h = 0;
        while (h <=5){
            System.out.println("h = " + h);
            h++;
        }
        System.out.println("\n*********otro ejemplo usando boolean");
        //entonces boolean
        //inicializamos la varaible otravez
        h = 0;
        boolean prueba = true;

        while(prueba){
            //ejecutamos algo hasta que la variable prueba cambien a false
            // por ejemplo cuando h sea igual a 7
            if(h ==7){

                prueba = false;
            }
            System.out.println("h = " + h);
            h++;
        }

    //ejemplo de nunca se va a ejecutar por que es false no caer en loop infinito
        prueba = false;
        while (prueba){

            System.out.println("esot nunca se va a ejecutar");
        }
/////ejemplo dowhile
do {
    System.out.println("\n*****do{...}while(sentencia); se ejecuta una vez");
}while (prueba);




    }
}
