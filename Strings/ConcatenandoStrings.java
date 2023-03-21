public class ConcatenandoStrings {
        
        /*Veamos un ejemplo de concatenación con concatenación simple con el operaodr + --> suma 
         * 
         */
        public static void main(String [] args){
            /*Declaramos la vairable curso como literal  */ 
            String curso  ="Curso de Apigee";

            String profesor=  "Chubaldo";
            //declaramos otra literal de tipo String vamos a concatenar curso + profesor pero en medio vamos a concatenar otroa string
            String detalle = curso + " impartido por el profesor " +profesor; 
            
            System.out.println(detalle);
            System.out.println("*********************************************************************");
            //otro aspecto importante que la concatenación es cuando queremos convinar con operaciones aritmeticas con las suma

            /*por ejemplo vamos a tenr el numero a + b */
            int numeroA = 15;
            int numeroB = 23;

        //   y quermos imprimir el numero  o la suma de ambos pero concatendo con detalle numeroA + numeroB  
        //   ¿por que? concatena los números y no los suma  esto se debe a la presedencia de los operadores
        //   como encuentra primero  una cadena  un String  en la izquierda entonces va a asumir que todo 
        //   se trata de una cadena y va a concatenar tengamos en cuenta que las expresiones se van evaluando
        //   de izquierda a derecha entonces  primero un String  luego numeros y luego concatena 
        //   a menos que usemos los pretnesis, entonces con los parentesis cambiamos la presedencia el orden 
        //   en que se ejecutan en que se evaluan estas operaciones  entonces primero va a sumar
        //   despues a concatenar siempre los parentesis  tienen preferencia  en la presedencia  
        //   es importante utilizar los parentesis cuadno concatenamos con String cuando usamos operaciones aritmeticas
           System.out.println("\n"+detalle+ " "+(numeroA + numeroB)); 
          //Ahora veamos al reves, entones la logica es primero de izquierda a derecha encotnces suma primero y detalle 
          // no es nuemrico pero si lo puede concatenar entonces concatena el resultado de la suma  al String
          // entonces ex importante la presedencia y el orden y es importante el parentecis para cambiar la presedencia
          System.out.println(numeroA + numeroB+" "+detalle); 
//*********************************************************************************************************************** */
            //Ejemplo 2 forma de conatenar segunda parte

            // vamos a crear otro String
            // y va hacer curso  concatenado con profesor pero sin usar el simbolo + vamos a usar un metodo
            // la clase String trae el metodo concat() que permite concatenar y como parametro recibe un String string
            // entonces toma en el concat otro parametro en este caso otro String nos permite concatnar
            // Y otro tema importante es que los Strings son inmutables por lo tanto  cualquier cambio que se realize en 
            // un String  con el metodo concat() --> lo que hace no es modificar  el curso  si no lo que hace es retornar
            // otro String otra instnaica  otros objeto distinto  a curso  y a profesor  retorna  otra instincia  y se la asigna 
            //a detalle entonces siempre los String son inmutables 
            String detalle2 = curso .concat(profesor);
            //entonces vamos a imprimir 
            System.out.println(detalle2);    
            //Y los String se oueden ir anidando
            //por ejemplo voy aconcatenar el metodo concar en el String en el espaico 
            String detalle3 = curso.concat(" con ".concat(profesor)); 
            
            System.out.println(detalle3);
            //otra manera de concatenar    
            String detalle4 = curso.concat(" con ").concat(profesor); 
            
            System.out.println(detalle4);

            //Entonces esta forma de concatenar es más eficiente que usar el + 
            /*¿Por que hace hace el signo + ? --> por que en relalidad el signo + 
             * lo qeu hace es concatenar a travez  de una clase   un objeto 
             * se cerea una instnacia  de StringBoulder
             * StringBoulder: nos permite unir String y concatenar 
             * entonces el + crea una instnacia de una StringBuilder y concatena y a si sucesivamente
              */
        }    
}
