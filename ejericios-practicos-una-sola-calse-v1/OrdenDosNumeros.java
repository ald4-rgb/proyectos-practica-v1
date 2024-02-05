
    /*
    * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
    * Podría ser utilizando operador ternario.*/
public class OrdenDosNumeros {
        public static void main(String[] args) {
            int num1= 8;
            int num2= 9;

            String mayorMenor = (num1>num2)?num1 + " , "+num2:num2 +" & " + num1 ;
            System.out.println("mayorMenor = " + mayorMenor);

        }
}
