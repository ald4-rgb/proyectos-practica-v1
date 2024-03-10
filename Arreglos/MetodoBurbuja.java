/*
*
* Vamos a implementar el codigo de manera explicita
* haremos nuestro prpio algoritmo de forma manual para poder ordenar el arreglo
* muy parecido al del método sort del  Array.sort();
* en este de algoritmo se comparan y se van ordendo por lo tanto se comparan y se van ordenando
* si estan desordenadas  o en el orden equivocado se van intercambiando de posicionamiento
* por lo tanto vasn subiendo de nivel en el arreglo a medida que se van ordenando como
* si fueran burbujas pero es necesario iterar varias veces
*
*   ¿Como se van comparando como se van ordenando?
*
*   Cualquier boejto en java se puede comparar siemrep y cuando implemente la interfaz comparable
*   en el caso de los String y tipo númericos de Java el Integer el float el double  todo implementa
*   su interfaz de forma automatica ya vienen por diseño de esa forma
*
* */

public class MetodoBurbuja {

    //en este método burjbuja vamos a aplicar el plimosrsmo

    //Creamos un un método estatico que realice el algoritmo burbuja
    public static void burbuja(String []orden){
            //generamos una varaible tipo int para simplificar
            int datos = orden.length;
            //iteracion nuestro array
            //contador de cuantas veces iteramos
            int iteracion = 0;
            for(int i= 0;i< datos;i++){
                //importanten realizar la operación para desbordar la memoria es datos menos iteracion meno 1
                for(int j= 0; j <datos - i -1;j++){
                    //realizamo el ordenamiento comparamos si orden[j + 1]  con orden[j] menor que cero
                    if(orden[j+1].compareTo(orden[j]) <0){
                        String temp = orden[j];
                        orden[j] = orden[j +1];
                        orden[j +1] = temp;
                    }
                }
                iteracion++;
            }
        System.out.println("numero de iteraciones = " + iteracion);

    }

//usamos el polumorsifmo en este ejemplo
    public static void burbuja(Object []orden){
            //generamos una varaible tipo int para simplificar
            int datos = orden.length;
            //iteracion nuestro array
            //contador de cuantas veces iteramos
            int iteracion = 0;
            for(int i= 0;i< datos;i++){
                //importanten realizar la operación para desbordar la memoria es datos menos iteracion meno 1
                for(int j= 0; j <datos -1 - i;j++){
                    //realizamo el ordenamiento comparamos si orden[j + 1]  con orden[j] menor que cero
                    if( ((Comparable) orden[j+1]).compareTo(orden[j]) <0){
                        Object temp = orden[j];
                        orden[j] = orden[j +1];
                        orden[j +1] = temp;
                    }

                }
              iteracion++;
            }
        System.out.println("numero de iteraciones = " + iteracion);
    }

//otro pero más obtimizado
    public  static void burbuja(Integer [] orden){
            Integer numerosInt = orden.length;
           int iteraciones=0;
           
            for (int i = 0;i<numerosInt ; i++){
                //para que no se nos desbo
                for (int j = i;j<numerosInt ; j++){
                    if(orden[j] < orden[i]){
                        Integer ordenTemp = orden[j];
                        orden[j] = orden[i];
                        orden[i] = ordenTemp;
                    }
                }
                iteraciones++;
            }
        System.out.println("iteraciones = " + iteraciones);
    }

    public static void main(String[] args) {
        String [] canciones = {"Nirvana - The Man Who Sold The World","Coldplay - The Scientist ","ZZ Top - La Grange","The Hollies - Long Cool Woman ",
                "The Doors  Break on Through","Santana - Oye Como Va","Hurricane Jane","Greenback Boogie","Don't Dream It's Over","The Final Countdown"};

        burbuja(canciones);
        
        for (String lista:canciones){
            System.out.println("lista = " + lista);
        }

        System.out.println(" *************************usandno nuemeros Integer tipo arreglo de tamaño 10 de forma dinamica");


        Integer [] numerosDesorden = new Integer[10];

        numerosDesorden[0]=55;
        numerosDesorden[1]=025;
        numerosDesorden[2]=15;
        numerosDesorden[3]=01;
        numerosDesorden[4]=5;
        numerosDesorden[5]=115;
        numerosDesorden[6]=456;
        numerosDesorden[7]=11;
        numerosDesorden[8]=Integer.valueOf("112");
        numerosDesorden[9]=Integer.valueOf("021");

        
        //invoamos nuestro metodo parra que lo ordenen
        burbuja(numerosDesorden);
        
        for (Integer pintarNum:numerosDesorden){
            System.out.println("pintarNum = " + pintarNum);
        }
        System.out.println("************************* ahora de manera mas estatica");

        Integer [] numerosDesastroso = {11,8,2,3,22,44,90,01,223,545,12,45,55,77,77};
        //ussamos otra sobreescritura de metodos del metodo burbuja

        burbuja(numerosDesastroso);

        for (Integer pintarNum:numerosDesastroso)
            System.out.println("pintarNum = " + pintarNum);

    }
}
