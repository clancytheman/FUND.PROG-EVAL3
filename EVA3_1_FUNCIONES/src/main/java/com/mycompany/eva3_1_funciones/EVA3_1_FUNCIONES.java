package com.mycompany.eva3_1_funciones;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA3_1_FUNCIONES {

    public static void main(String[] args){
        // LLAMADA A FUNCIÓN O PROCEDIMIENTO.
        printMessage("HELLO!! ", 10);
    }
    
    public static void printMessage(String message, int qant){
        for (int i = 0; i < qant; i++)
            System.out.print(message);
    }
    
}
