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

    //Creamos un un método estatico que realice el algoritmo burbuja
    public static void burbuja(String []orden){
            //generamos una varaible tipo int para simplificar
            int datos = orden.length;

            //iteracion nuestro array
            //contador de cuantas veces iteramos
            int iteracion;
            
            for(int i= 0;i< datos;i++){
                //importanten realizar la operación para desbordar la memoria es datos menos iteracion meno 1
                for(int j= 0; j <datos - i -1;i++){
                    //realizamo el ordenamiento comparamos si orden[j + 1]  con orden[j] menor que cero
                    if(orden[j+1].compareTo(orden[j]) <0){
                        
                    }

                }
            }


    }


    public static void main(String[] args) {
        String [] canciones = {"Nirvana - The Man Who Sold The World","Coldplay - The Scientist ","ZZ Top - La Grange","The Hollies - Long Cool Woman ",
                "The Doors  Break on Through","Santana - Oye Como Va","Hurricane Jane","Greenback Boogie","Don't Dream It's Over","The Final Countdown"};





    }
}
