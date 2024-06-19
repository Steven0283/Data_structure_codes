/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casestudy;

/**
 *
 * @author LABORATORIO 04
 */
public class CustomStack {
    private CustomElement top;
    private int size;
    
    public CustomStack(){
        this.top = null;
        this.size = 0;
    }
    
    public void push(int value){
        CustomElement newElement = new CustomElement(value, this.top);
        this.top = newElement;
        this.size ++;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void print(){
        if (this.isEmpty()) {
            System.out.println("Tren Vacío");
        } else{
            System.out.println("\n Pasajeros del tren: ");
            CustomElement current = this.top;
            while(current != null){
                System.out.println(current.getValue() + " \n");
                current = current.getPrevious();
            }
        }
    }
    
    public boolean isEmpty(){
        return this.top == null;
    }
}
