/*
* Ejemplo de Autoboxing de un tipo de referencia  cuando se convierte a un
* primitivo y viseversa
*
* Entonces anidar o convertir un primitivo en la clase Integer y viceversa
*
*  */

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        //supongamos un arreglo de enteros pero de referencia
        // forma automatica ya tenemos autoboxing estamos convirtiendo
        // primitivos en la literal en tipos de referencia
        // de forma explicita Integer [] enteros = {Integer.valueOf(12);
        Integer [] enteros = {Integer.valueOf(12),4,2,1,1,20,2,8,4,1,12,25,90 };

        //vamos a tener uns suma de tipo primitiva
        int suma  = 0;
        // la idea es ir sumando los valores que sean pares
        // entonces lo podemos recorrer con un foreach
        // del tipo integer no del tipo primitivo
        //entonces recorre un entero del tipo Integer
        //del objeto
        for(Integer sumaPares: enteros){
            //y de forma explicita  hay que emepzar a preguntar si
            //el entero en este caso primitivo de cada objeto i
            // sumaPares.intValue() si la calculamos el modulo de dos
            // es igual a cero
            // y sumamos el valor primitivo siempre y cuando sea par
            if(sumaPares.intValue() % 2== 0){
                //entonces suma pares y sumamos vamos sumando
                // es decir suma igual al valor de suma que tenia
                suma  = suma + sumaPares.intValue();
            }

        }
        System.out.println("suma = " + suma);


        //esto seri similar a esto el unboxing convertir a un primitivo
        //suma el doble por que toma la suma que tenia antes inicializamos

        suma = 0;
        for(Integer sumaPares: enteros){

            if(sumaPares % 2 == 0){
                  suma += sumaPares;
            }
        }

        System.out.println("suma unboxing = " + suma);

        //cuanod trabajamos con objetos de referencia con clases Wrapper con el Integer
        //y queremos inicializar operaciones aritmeticas ya sea el modulo para restarmultiplicar o dividir
        // lo podemos hacer directamente en el objeto Integer



    }
}
