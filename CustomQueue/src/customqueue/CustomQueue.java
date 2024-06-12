/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customqueue;

/**
 *
 * @author LABORATORIO 04
 */
public class CustomQueue {
    public CustomNode front;
    public CustomNode rear;

    public CustomQueue() {
        this.front = null;
        this.rear = null;
    }
    
    public void enqueue(CustomNode node){
        if (this.isEmpty()) {
            this.front = node;
            this.rear = node;
        } else{
        this.rear.next = node;
        this.rear = node;
        }
    }
    
    public CustomNode dequeue(){
        if (this.isEmpty()) {
            return null;
        }
        CustomNode temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;            
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Cola vacía";
        } else {
            StringBuilder sb = new StringBuilder();
            CustomNode current = this.front;
            while(current != null){
                sb.append(current.toString());
                current = current.next;
            }
            return sb.toString();
        }
    }
    
    
    
}
