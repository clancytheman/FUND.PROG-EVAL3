/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("FACTORIAL DE 5: " + calcularFactorial(valor));
        int bas = 5, exp = 2;
        System.out.println("LA POTENCIA DE 5 ELEVADO A LA 2 ES: " + calcularPotencia(bas, exp));
    }
    
    public static int calcularFactorial (int valor){
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i;
        }
        return guardar;
    }
    
    public static int calcularPotencia (int bas, int exp){
        int resultado = 1;
        for (int i = 1; i <= exp; i++) {
            resultado *= bas;
        }
        return resultado;
    }
}
