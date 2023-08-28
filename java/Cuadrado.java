/**
* Una simple ejemplo de utilizacion de Pair.java
* @author Pablo Castro
**/

public class Cuadrado{
    
    public static void main(String[] args){
        
        if (args.length != 1)
            System.out.println("*** Uso: Cuadrado <integer>");
        else{
            int input = Integer.parseInt(args[0]);
            int res = input * input;
            System.out.println("El resultado es: "+res);
        }// fin de else
    
    } // fin de main

}// fin de clase
