/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author LABORATORIO 04
 */
public class Task {
    String descrption;
    String dueDate;
    int priority;
    boolean isComplete;

    public Task() {
    }

    public Task(String descrption, String dueDate, int priority, boolean isComplete) {
        this.descrption = descrption;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isComplete = isComplete;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task{");
        sb.append("descrption=").append(descrption);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", priority=").append(priority);
        sb.append(", isComplete=").append(isComplete);
        sb.append('}');
        return sb.toString();
    }
    
    
}
