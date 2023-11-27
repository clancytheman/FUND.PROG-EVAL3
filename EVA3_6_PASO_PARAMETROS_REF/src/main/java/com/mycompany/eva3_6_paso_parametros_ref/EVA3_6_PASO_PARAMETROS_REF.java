package com.mycompany.eva3_6_paso_parametros_ref;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA3_6_PASO_PARAMETROS_REF {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        llenarArreglo(arreglo);
        System.out.println("Dirección Arreglo: " + arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }
    
    public static void llenarArreglo(int[] valores){
        System.out.println("Dirección arregloValores: " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random() * 100);
        }
    }
    //PASO POR VALOR = PASO POR REFERENCIA.               
}
