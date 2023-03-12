
	public class ConversionCadenasPrimitivos {
	
		public static void main (String[] args){
		
			/*Haremos todo lo contrario a la clase anteroir 
			 * converteriremos de un tipo primitivo a un string la inversa
			 */
			//vamos a crear el entero primitivo
			int otroNumeroInt = 100;
			//esto lo vamos a convertir a un tipo string 
			System.out.println("otro numero int:"+otroNumeroInt);
			
			//a qui tendremos otra variable de tipo string 
			// hay dos fromas de hacerlo una es usando la clase Integer 
			// usamos la clase wrapper qeu anida el primitivo
			String otroNumeroStr = Integer.toString(otroNumeroInt);
			System.out.println("convertido a string: "+otroNumeroStr);

			//pero hay otra forma ¿cual? vamos a convertir otro numero string pero Ahora usando la clase String
			//value retorna directamente a a n string por cada tipo primitivo esto se le conoce como Sobrecarga de metodos
			// cuando sontn string el signo + hace la operacion cuando son son string concatena
			//otroNumeroStr = String.valueOf(otroNumeroStr + 10); --> concatena otroNumeroStr = String.valueOf(otroNumeroInt + 10); -- suma 
			otroNumeroStr = String.valueOf(otroNumeroInt + 10);
			System.out.println("convertido a string forma alterna: "+otroNumeroStr);	
			/*Ahora veamos como convertir un numero real un decimal  a u tipo string 
			 * tenemos la clase Double usanto el metodo toString wrapper
			 * si definimos nestra literal como 
			*/
			Double otroRealDouble = 23.3242e2;
			String otroRealStr =Double.toString(otroRealDouble);

			System.out.println("La conversin de double a string es: "+otroRealStr);

			/*usmos la otra forma ahora usaremos la clase String */
			otroRealStr = String.valueOf(22.2312e2f);
			System.out.println("forma alternativa usando un flotante: "+otroRealStr);
 
		}
		
	}