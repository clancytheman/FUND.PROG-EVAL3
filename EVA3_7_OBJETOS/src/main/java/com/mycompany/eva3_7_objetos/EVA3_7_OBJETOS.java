package com.mycompany.eva3_7_objetos;

/**
 *
 * @author DIEGO ESCARCEGA
 * 
 * Una clase es una plantilla. Las plantillas sirven
 * para crear multiples objetos semejantes.
 * Como tal, la plantilla no existe.
 * 
 */
public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        Persona human1 = new Persona();
        System.out.println(human1);
        human1.nombre = "Kanye";
        human1.apellido = "West";
        human1.edad = 46;
        
        Persona human2 = new Persona();
        System.out.println(human2);
        human2.nombre = "Jesus";
        human2.apellido = "Christ";
        human2.edad = 33;
        
        imprimirPersonas(human1);
        imprimirPersonas(human2);
        
    }
    
    public static void imprimirPersonas(Persona human){
        System.out.println("Dirección: " + human);
        System.out.println("Nombre Completo: " + human.nombre + " " + human.apellido);
        System.out.println("Edad: " + human.edad);
    }
}

// --> Definen una plantilla para crear objetos.
// Crean un nuevo tipo de dato.
class Persona{
    String nombre;
    String apellido;
    int edad;
}
