/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._kellerrejas_java;

/**
 *
 * @author Lab24
 */
public class Main_28_KellerRejas {

    public static void main(String[] args) {
        
        persona_1 persona1 = new persona_1("Juan", 30);
        persona_1 persona2 = new persona_1("María", 25);

           persona1.saludar();
        persona2.saludar();

        persona_2 persona3 = new persona_2("Juan", 30);
        persona_2 persona4 = new persona_2("María", 25);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
        }
    }

