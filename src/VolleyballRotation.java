import java.util.ArrayList;
import java.util.List;

public class VolleyballRotation {

    private List<String> players;

    /**
     * Constructor initializes an empty rotation.
     */
    public VolleyballRotation() {
        this.players = new ArrayList<>();
    }

    /**
     * Adds a player to the end of the rotation.
     */
    public void addPlayer(String name) {
        this.players.add(name);
    }

    /**
     * Removes the player at the given position.
     */
    public void removePlayer(int position) {
        this.players.remove(position);
    }

    /**
     * Returns the player at the given position.
     */
    public String playerAt(int position) {
        return this.players.get(position);
    }

    /**
     * Returns the number of players in the rotation.
     */
    public int numberOfPlayers() {
        return this.players.size();
    }

    /**
     * Main method for testing the rotation.
     */
    public static void main(String[] args) {

        VolleyballRotation rotation = new VolleyballRotation();

        // Add players
        rotation.addPlayer("Alpha");
        rotation.addPlayer("Beta");
        rotation.addPlayer("Charlie");
        rotation.addPlayer("Delta");

        // Display basic info
        System.out.println("First player: " + rotation.playerAt(0));
        System.out.println("Total players: " + rotation.numberOfPlayers());

        // Remove a player
        rotation.removePlayer(1); // removes Beta

        // Display after removal
        System.out.println("After removal:");
        System.out.println("Total players: " + rotation.numberOfPlayers());
        System.out.println("New second player: " + rotation.playerAt(1));
    }
}