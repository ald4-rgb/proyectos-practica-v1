
public class PrimitivosConversion {

	public static void main(String[] args) {
		// vamos a partir creando una vairable de tipo string

		String numeroStr = "50";

		// ¿Como convertimos este String a un entero? --> pues con la clase
		// Integer.parseInjt

		// entonces tenemos el entero numero int
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("La convercion de numeroString es: " + numeroInt);
		// esto tambien se puede replicar en byte
		// ejemplo con decimales este numero como es decimal lo podemos convertir a un
		// tipo double
		// String realStr = "323.11";
		// ahora que pssa si lo ponemos con notacion cientifica
		String realStr = "390988.11e-3";
		// vamos a declarar double para convertirlo a tipo Double
		double realDouble = Double.parseDouble(realStr);
		System.out.println("La convercion de numeroString es: " + realDouble);
		// no para todos los tipo numericos o float se aplica exactamente igual
		// por ejemplo para los string como convertir los string en tipo boolean
		// en general cualquier valor que sea distinto de true o false o este escrito
		// en mayuscula o nimuscula.
		String logicoStr = "false";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("La convercion de numeroString es: " + logicoBoolean);

		//////////////////////////////////////////////////////////////Usando con Var//////////////////////////////////////////////////////////////////////

		System.out.println("*****************Usandolo como un interprete versiones superioires al a 10 c:****************************");

		var numeroStr2 = "50";

		var numeroInt2 = Integer.parseInt(numeroStr2);
		System.out.println("La convercion de numeroString es: " + numeroInt2);

		var realStr2 = "390988.11e-3";

		var realDouble2 = Double.parseDouble(realStr2);
		System.out.println("La convercion de numeroString es: " + realDouble2);

		var logicoStr2 = "false";
		boolean logicoBoolean2 = Boolean.parseBoolean(logicoStr2);
		System.out.println("La convercion de numeroString es: " + logicoBoolean2);

	}

}