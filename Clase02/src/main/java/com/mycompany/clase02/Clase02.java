/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase02;

/**
 *
 * @author LABORATORIO 04
 */
public class Clase02 {

    public static void main(String[] args) {
        Bear bear01 = new Bear("Poo", "Yellow", false);
        Bear bear02 = new Bear("Micha", "Red", true);
        System.out.println("\n1st bear: ");
        System.out.println("Name: " + bear01.getName());
        System.out.println("Color: " + bear01.getColor());
        bear01.indicateHibernationState();
        System.out.println("");
        System.out.println("\n2nd bear:");
        System.out.println("Name: " + bear02.getName());
        System.out.println("color: " + bear02.getColor());
        bear02.indicateHibernationState();

        //System.out.println("Hello World!");
    }
}
