/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s07v2_28;

/**
 *
 * @author Lab24
 */
public class S07v2_28 {

    public static void main(String[] args) {
        persona1_28 persona1 = new persona1_28("cralos gabriel", 50);
        persona1_28 persona2 = new persona1_28("maryinez gabriela", 15);

        persona1.saludar();
        persona2.saludar();

        persona2_28 persona3 = new persona2_28("cralos gabriel", 50);
        persona2_28 persona4 = new persona2_28("maryinez gabriela", 15);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
    }
}
