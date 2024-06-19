/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casestudy;

/**
 *
 * @author LABORATORIO 04
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomNode nodo = new CustomNode("Guanacaste", 1, "Steven Vallejos", 118570573, null);
        CustomQueue cola = new CustomQueue();
        
        nodo.toString();
        cola.toString();
    }
    
}
