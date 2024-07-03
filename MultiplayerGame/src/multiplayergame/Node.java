/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplayergame;

/**
 *
 * @author Usuario
 */
public class Node {

    private Player player;
    private Node next;

    public Node() {
    }

    public Node(Player player) {
        this.player = player;
        this.next = null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node{\n");
        sb.append("player=").append(player);
        sb.append("\n, next=").append(next);
        sb.append("\n}\n");
        return sb.toString();
    }

}
