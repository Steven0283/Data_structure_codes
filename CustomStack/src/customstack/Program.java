/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customstack;

/**
 *
 * @author LABORATORIO 04
 */
public class Program {
    public static void main(String[] args){
        System.out.println("Custom Stack Program");
        CustomStack stack = new CustomStack();
        
        stack.push(11);
        stack.push(22);
        stack.push(33);
        
        stack.print();
        
        int value = stack.pop();
        System.out.println("Poping " + value);
        
        stack.print();
    }
}
