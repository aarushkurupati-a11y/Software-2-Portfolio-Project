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
}