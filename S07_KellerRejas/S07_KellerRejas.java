/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s07_kellerrejas;

/**
 *
 * @author Lab24
 */
public class S07_KellerRejas {

    public static void main(String[] args) {
        persona_1 persona1 = new persona_1("cralos gabriel", 50);
        persona_1 persona2 = new persona_1("maryinez gabriela", 15);

        persona1.saludar();
        persona2.saludar();

        persona_2 persona3 = new persona_2("cralos gabriel", 50);
        persona_2 persona4 = new persona_2("maryinez gabriela", 15);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
    }
    }

