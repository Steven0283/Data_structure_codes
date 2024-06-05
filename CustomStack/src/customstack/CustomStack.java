/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customstack;

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

public int pop(){
    if (this.isEmpty()) {
        System.out.println("Stack is empty. Cannot pop");
        return -1;
    }
    int value = this.top.getValue();
    this.top = this.top.getPrevious();
    this.size --;
    return value;
}

public int peek(){
    if (this.isEmpty()) {
        System.out.println("Stack is empty. Cannot peek");
        return -1;
    }
    return this.top.getValue();
}

public boolean isEmpty(){
    return this.top == null;
}

public int getSize(){
    return this.size;
}

public void print(){
    if (this.isEmpty()) {
        System.out.println("Stack is empty.");
    } else{
        System.out.println("\n Stack content");
        CustomElement current = this.top;
        while (current != null){
            System.out.println(current.getValue() + "\n");
            current = current.getPrevious();
        }
    }
}
    
}
