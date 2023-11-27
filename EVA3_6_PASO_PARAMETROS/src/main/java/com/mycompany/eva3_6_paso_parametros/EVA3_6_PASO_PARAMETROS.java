package com.mycompany.eva3_6_paso_parametros;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA3_6_PASO_PARAMETROS {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("El valor de X en el main() es de " + x);
        pasoPorValor(x);
        System.out.println("El valor modificado de X en el main() es de " + x);
    }
    
    public static void pasoPorValor(int val){
        System.out.println("El valor que recibo en el método es de " + val);
        val++;
        System.out.println("El valor modificado en el metodo es de " + val);
    }
    
    
}
