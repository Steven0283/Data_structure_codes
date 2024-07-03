/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplayergame;

/**
 *
 * @author Usuario
 */
public class Pogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularList playerList = new CircularList();
        
        Player player1 = new Player("Steven", 1);
        Player player2 = new Player("Ricardo", 2);
        Player player3 = new Player("Kevin", 3);
        
        playerList.addPlayer(player1);
        playerList.addPlayer(player2);
        playerList.addPlayer(player3);
        
        System.out.println("Initial list of players: ");
        System.out.println(playerList.displayPlayers());
        
        System.out.println("\n Simulating players turns");
        Node current = playerList.getTail();
        for (int i = 0; i < 10; i++) {
            System.out.println("Turn " + (i + 1) + ": " + current.getPlayer().getName());
            current = current.getNext();
        }
    }
    
}
