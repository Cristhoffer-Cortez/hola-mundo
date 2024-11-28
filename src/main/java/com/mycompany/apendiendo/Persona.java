/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.apendiendo;

//CONSTRUCTOR
public class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters recupera el valor de un producto
    public String getNombre() {
        return nombre; //devuelve el valor del atributo nombre
    }
    
    public int getEdad() {
        return edad; //devuelve el valor del atributo edad
    }
    
    //SETTER 
    //modifica el valor del atrivuto

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo valor a 'nombre'.
    }
    //modificar la edad

    public void setEdad(int edad) {
        this.edad = edad; // Asigna un nuevo valor a 'edad'.
        
    }
}

