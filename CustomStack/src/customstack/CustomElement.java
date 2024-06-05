/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customstack;

/**
 *
 * @author LABORATORIO 04
 */
public class CustomElement {
    private int value;
    private CustomElement previous;

    public CustomElement() {
    }

    public CustomElement(int value, CustomElement previous) {
        this.value = value;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CustomElement getPrevious() {
        return previous;
    }

    public void setPrevious(CustomElement previous) {
        this.previous = previous;
    }
    
    
}
