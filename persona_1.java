/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s07_kellerrejas;

/**
 *
 * @author Lab24
 */
public class persona_1 {
    
            public String nombre;
        public int edad;
        

        public persona_1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        }

        public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
        }
            
           
}
