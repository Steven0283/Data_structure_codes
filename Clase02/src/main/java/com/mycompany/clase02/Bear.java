/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02;

/**
 *
 * @author LABORATORIO 04
 */
public class Bear {
    //Atributes
    private String name;
    private String color;
    private boolean isInHibernation;
    
    //Constructor
    public Bear(String name, String color, boolean isInHibernation){
        this.name = name;
        this.color = color;
        this.isInHibernation = isInHibernation;
    }
    
    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsInHibernation() {
        return isInHibernation;
    }

    public void setIsInHibernation(boolean isInHibernation) {
        this.isInHibernation = isInHibernation;
    }
    
    //Methods
    public void indicateHibernationState(){
        if (this.isInHibernation) {
            System.out.println("Yes, " + this.name + " is in hibernation.");
        }else{
            System.out.println("No, the bear " + this.name + " isn´t in hibernation.");
        }
    }
    
}
