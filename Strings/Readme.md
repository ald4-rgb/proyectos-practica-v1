

#                        Que son los String 

                        Los String son objetos de java, del tipo de referencia;

                        String nombre = new String("Aldair");
                        String tema =  new String("Bienvenido al curso de "\Apigee\"");

                        Aunque tambien los string se puenden representar como una sintaxis especialmente comoda 

                        Muchas veces podemos confudir los string con los tipos primitivos

                        Tambien podemos hacerlo de forma más comoda 

                        El string tiene una característica especial, permite crear objetos también en la literal sin necesidad
                        del operador new 

                        String nombre = "Aldair";
                        String tema =  "Bienvenido al curso de "\Apigee\""; 

                        Aunque también los Strings se pueden representar con una sintaxis especialmente cómoda

                        El String podriamso definirlo como un arreglo que define varios caracteres que forman un String
                        Recordemos que todo arreglo en java es de tipo objeto al ser una secuancia no es del tipo
                        primitivo a un que se puede confundir.

                        "\"" --> backslash
                        Para incluir el carácter comillas dobles, se debe escapa "\""
                        Los caracteres Strings se codifican usando unicode
                        Son inmutables es decir cualquier cambio que se realiza al string  si se asigna un valor se 
                        modifica el string se invoca un metodo para cambiar caracteres  con el metodo replace  remplazar
                        caraccteres o obtener una subcadena  del String con el meotodo  sbusString() o cualqueir metodo 
                        siempre retorna una nueva instancia a la original  con ese cambio.

#                       como concatenar 

        Sobre las cadenas se define la operación de concatenar con el operador de suma 

        String nombre = "Aldair";
        String apellido = "Castillo
        
        String nombreCompleto= nombre +" "+apellido;

#                   Comparar String 

        Con operador relaciónal de igualdad == comparar por referencia 
        con el método equals() compara por valor 

        String str1 = "Hola Aldair";
        String str2 = new String("Hola Aldair");

        //Chequea si son el mismo objeto osea si se llaman igual como literial a qui sera false po la diferencia del nombrado
        System.out.println("Son el mismo objeto?"+(str1 == str2));

        //Chequea si tiene  el mismo valor para saber si contienen lo mismo usamos el metodo equlas();
        //entoneces si ambos contienen el mismo valor sera verdadero 
        System.out.println("Son el mismo objeto?"+str1.equals(str2));

#       Métodos de la clase String

        int length(): número de caracteres 
        
		boolean equals(String b): compara si ambas son iguales, por valor
        
		boolean equalIgnocase(String b): compara si ambos son iguales independientemanete si son mayusculas o minúsculas.
        
		int compareTo(String b): Compara contra la cadena del argumento, devolviendo.
								 
								 1. un valor negativo si la cadena es anterioir a b 
								 
								 2. cero (0) si la cadena es iguial a b 
								 
								 3. un valor positivo si la cadena es posterioir a b 
		
		String trim(): Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
		
		char charAT(int posicion): Extraer un carácter en la posición indicada.

#       Métodos de la clase String			

		char[] toCharArray(): Convierte la cadena en un arreglo de caracteres.
		
		String substring(int a, int b): Extrae la sub-cadena entre las posiciones a y b.
		
		int indexof(String cadena): Idican en que posición se encuentran el carácter(o cadena)
									indicado por primera vez, busncado desde el principio.
									
		int lastIndexOf(String cadena): Indica en que posicion se encuntra el carácter (o cadena)
										indicado por primera vez, buscando desde el final.
										
		boolean startsWith(String prefijo): Dice si la cadena comienza con el prefijo indicado.
		
		boolean endsWith(String sufijo): Dice si la cadena termina con el sufijo indicado.
		
		String[] split(String patrin): Divide la cadena en varias subcadenas utilizando el patron 
									   indicado como separador. 