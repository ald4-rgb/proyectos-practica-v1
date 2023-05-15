public class FibonacciSinRecursividad {

    public static void main(String[] args) {

//        String cadena = "Binvenido al curso de js";

        //char [] caracteres = cadena.toCharArray();

  //      for(int i =cadena.length() -1;i>=0;i--){
          //  System.out.print(cadena.charAt(i));
    //    }
    int x = 0;
    int y = 1;
    int z = 1;
        //0,1,1,2,3,5,8,13
     for(int i=0;i<5;i++){
         z = x + y;
         System.out.println(z);
         x = y;
         y = z;

     }

        System.out.println("---------");
        for(int i=5;i>0;i--){
            y = z - x;
            System.out.println(x);
            z =x;
            x = y;

        }
    }
}
