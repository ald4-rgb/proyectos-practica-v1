# Flujos  del controls 

  # if-else
    
 -  ejecuta un bloque de codigo 

 - ```java
   if(expresion){ 
        //ejecuta un bloque de cofigo
   }
    ```
# if-else

 - Si la expresión es falsa hacer uso de else


 ```java
    if(expresion){
    //ejecuta el bloque de código se cumple la condición
    }else{
     //setnecia a ejecutar si no se cumple la condición
    }
```    
    
 - O bien, una serie de comparaciones else if y una sentencia else
  
```java
    if(expresion){
    //bloque a ejecutar si cumple la primera condición
    }else if(expresion){
      //sentnecia a ejecutar si cumple segunda condicón
    }else{
      //sentencia a ejecutar si No cumple ninguna condición
    }
  ```    

# Setencia swith case

 - La sentencia swith o interruptor se utiliza para realizar sentnecias condicionalmente 
   basadas en alguna expresión
 - Deacuerdo al valor de la expresión se ejecuta la sentencia case apropiada

 - La sentencia break hace que el control salga de la sentencia switch continúe con la siguiente
   linea
```java
   //switch solo permite tipo de variables primitvo como int,byte,char y String pero eso a partir de la version 7 de java o enum enumerador de java
    switch(varaible){
    case valor1;
    // ejecuta sentencia 1
    break;    
    case valor2;
    // ejecuta sentencia 2
    break;    
    case valor3;
    // ejecuta sentencia 3
     break;    
    default:
        // Si no existe coincidencia. se ejecuta la sentnecia default

        }
  ```    
  # Separadores 
 
- Existen otros caracteres en java con siginificado escpecial, son los sepradores: