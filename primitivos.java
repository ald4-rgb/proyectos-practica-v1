
	public class primitivos {
	
		public static void main (String[] args){
			//Conversiones de tipo primitivos a cadenas 
			
			
			//Vamos a crear la siguiente variable para que sea distinto le vamos a llaar otro numero int 
			
			int otroNumeroint = 100;
		
			//convirtamos esto a un tipo string  vamos a imprimir otroNumeroint
			
			System.out.prinln("La conversion de 100 es igual a "+otroNumeroint);

			//vamos a declarar otra vaariable  le vamos a llamar otro numero str
			/*Hay dos formas una es utlizando el metodso ineteger y otra con el metodo toString();
			 *Cuando queremos convertir  a un entero utlizamos Intenger.parseInt	
			 *cuando queremos converi  un entero primitivo integer a un String utilizamos toString(); 
			 *la clase wrapper que anida el primitivo para convertir 
			*/
			String otroNumeroStr = Integer.toString(otroNumeroint);

		}
	
	
	}