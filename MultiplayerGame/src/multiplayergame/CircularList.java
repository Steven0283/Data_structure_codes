/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplayergame;

/**
 *
 * @author Usuario
 */
public class CircularList {

    private Node head;
    private Node tail;

    public CircularList() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void addPlayer(Player player) {
        Node newNode = new Node(player);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            newNode.setNext(head);
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.tail.setNext(head);
        }
    }

    public String displayPlayers() {
        StringBuilder sb = new StringBuilder();
        if (this.head == null) {
            sb.append("No players in the list");
        } else {
            Node current = head;
            do {
                sb.append(current.getPlayer());
                current = current.getNext();
            } while (current != head);
        }
        return sb.toString();
    }
}
