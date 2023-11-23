package com.mycompany.eva3_2_valor_maximo;

/**
 * @author DIEGO ESCARCEGA
 */
public class EVA3_2_VALOR_MAXIMO {

    public static void main(String[] args) {
        // LLAMADA A FUNCIÓN.
        // UTILIZAR EL VALOR DIRECTAMENTE DE LA FUNCIÓN.
        System.out.println(buscarMaximo(100, 200));
        // GUARDAR EL VALOR Y USARLO DESPUÉS.
        int resu = buscarMaximo(100,200);
        System.out.println(resu);
        // LLAMAR A LA FUNCIÓN E IGNORAR EL RESULTADO.
        buscarMaximo (100,200);
        
    }
    
    public static int buscarMaximo(int val1, int val2){
        /*
          if (val1 > val2)
             return val1
          else
             return val2 */
        
        // AMBOS PROCESOS SON IGUALES.
        // SIN EMBARGO, SE RECOMIENDA USAR UN SOLO "RETURN".
        
        int result;
        
        if(val1 > val2)
            result =  val1;
        else
            result = val2;
        
        return result;
        
    }
    
}