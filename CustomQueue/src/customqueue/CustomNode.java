/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customqueue;

/**
 *
 * @author LABORATORIO 04
 */
public class CustomNode {
    private String name;
    private double height;
    CustomNode next;

    public CustomNode() {
    }

    public CustomNode(String name, double height, CustomNode next) {
        this.name = name;
        this.height = height;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CustomNode{" + "Nombre= " + name + ", Altura= " + height + ", Siguiente= " + next + '}';
    }
    
    
    
    
}
