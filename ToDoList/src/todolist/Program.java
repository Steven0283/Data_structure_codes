/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

/**
 *
 * @author LABORATORIO 04
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskList list = new TaskList();
        list.addTask(new Task("Hacer la tarea.", "26/06/24", 2, false));
        list.addTask(new Task("Ir al Trabajo.", "27/06/24", 1, false));
        list.addTask(new Task("Sacar a pasear a Koby.", "28/06/24", 2, false));
        list.addTask(new Task("Ir al banco.", "28/06/24", 2, false));
        list.addTask(new Task("Pagar la U.", "26/06/24", 2, false));
        list.addTask(new Task("Hacer los cursos de CARSO.", "26/06/24", 1, false));

        list.markTaskAsComplete("Terminar la tarea");
        list.markTaskAsComplete("Ir a trabajar");
    }

}
