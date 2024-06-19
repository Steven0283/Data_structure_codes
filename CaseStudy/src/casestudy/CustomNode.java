/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casestudy;

/**
 *
 * @author LABORATORIO 04
 */
public class CustomNode {
    private String destiny;
    private int tickettType;
    private String passengerName;
    private int passengerID;
    public CustomNode next;

    public CustomNode() {
    }

    public CustomNode(String destiny, int tickettType, String passengerName, int passengerID, CustomNode next) {
        this.destiny = destiny;
        this.tickettType = tickettType;
        this.passengerName = passengerName;
        this.passengerID = passengerID;
        this.next = next;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public int getTickettType() {
        return tickettType;
    }

    public void setTickettType(int tickettType) {
        this.tickettType = tickettType;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }
    
    public CustomNode getNext(){
        return next;
    }
    
    public void setNext(CustomNode next){
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Datos de pasajero");
        sb.append("Destino = ").append(destiny);
        sb.append(", Tipo de boleto = ").append(tickettType);
        sb.append(", Nombre del pasajero = ").append(passengerName);
        sb.append(", Identificación del pasajero = ").append(passengerID);
        sb.append("Siguiente = ").append(next);
        sb.append('}');
        return sb.toString();
    }
    
    
}
