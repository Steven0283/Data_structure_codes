/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author LABORATORIO 04
 */
public class TaskList {

    Node head;

    public TaskList() {
    }

    public TaskList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public class Node {

        Task task;
        Node next;

        Node() {

        }

        Node(Task task) {
            this.task = task;
        }

        public Task getTask() {
            return task;
        }

        public void setTask(Task task) {
            this.task = task;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "task=" + task + '}';
        }
        
        

    }
    
    void addTask(Task task){
        Node newNode = new Node(task);
        newNode.next = this.head;
        this.head = newNode;
    }
    
    void markTaskAsComplete(String description){
        Node  temp = head;
        
        while(temp != null){
            if (temp.task.descrption.equals(description)) {
                temp.task.setIsComplete(true);
                break;
            }
            temp = temp.next;
        }
    }
    
    void sortTaskByPriority(){
        Node temp1 = this.head;
        Node temp2 = null;
        Task tempTask;
        
        while(temp1 != null){
            temp2 = temp1.next;
        }
        
        while(temp2 != null){
            if (temp1.task.priority > temp2.task.priority) {
                tempTask = temp1.task;
                temp1.task = temp2.task;
                temp2.task = tempTask;
            }
            temp2 = temp2.next;
        }
        temp1 = temp1.next;
    }
    
    String filterTaskByCompletedStatus(boolean status){
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        
        while(temp != null){
            if (temp.task.isComplete == status) {
                sb.append("{" + temp.task + "}\n");
            }
            temp = temp.next;
        }
        return sb.toString();
    }

}
