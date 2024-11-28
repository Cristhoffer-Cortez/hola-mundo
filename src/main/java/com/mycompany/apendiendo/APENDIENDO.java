/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apendiendo;

import java.util.Scanner;


public class APENDIENDO {

    public static void main(String[] args) {
        byte mordida;
        mordida = 127;
        System.out.println("Mordida="+mordida);
        
        short pequeño;
        pequeño = 32000;
        System.out.println("pequeño="+pequeño);
        
        int ent;
        ent =127;//se puede transformar con (int)127.55
        System.out.println("entero= "+ent);
        
        long largo;
        largo = 1278898;
        System.out.println("largo= "+largo);
        
        float flotante;
        flotante = 1278.9f; //se cambia con f o (float) 
        System.out.println("fotante= "+flotante);
        
        double doble;
        doble=123.45; //acepta sin ninguna combersion
        System.out.println("doble= "+doble);
        
        char caracter;
        caracter= 'a'; //un solo caracter
        System.out.println("caracter= "+caracter);
        
        boolean boleano;
        boleano= true;
        System.out.println("boleano= "+boleano);
        
        //CONSTANTES
        final float pi=3.1415f;
        float res=pi*2;
        System.out.println("pi*2= "+res);
        //ENVOLTORIO
        String cadena;
        cadena="cadena";
        System.out.println("cadena= "+cadena);
        
        Persona persona1 = new Persona("Pedrito", 22);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());   
        
        //SETTERS
        persona1.setNombre("Luis");
        persona1.setEdad(35);
        System.out.println("Nombre Actualizado: " + persona1.getNombre());
        System.out.println("Edad Actualizada: " + persona1.getEdad());
        
        //leer datos
        //NUMEROS
        Scanner entrada=new Scanner(System.in);
        int entero; //para recibir numero decimales flooat
        System.out.println("Escribe un numero entero.");
        entero=entrada.nextInt(); //cambia a nextFloat
        System.out.println("Tu numero es: "+entero);
        
        //CADENAS
        Scanner texto=new Scanner(System.in);
        String cade;
        System.out.println("escribe texto.");
        cade=texto.nextLine(); //Line para que lea toda la linea
        System.out.println("tu texto es: "+cade);
        //para char cade=texto.next().chartAT(0)parala;
               

    }
}
