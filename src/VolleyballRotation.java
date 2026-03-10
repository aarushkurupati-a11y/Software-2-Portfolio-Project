/**
 * VolleyballRotation enhances VolleyballRotationKernel with secondary
 * convenience methods.
 */
public interface VolleyballRotation extends VolleyballRotationKernel {

    /**
     * Reports the player currently serving.
     *
     * @return the current server
     * @requires |this| > 0
     * @ensures server = head(this)
     */
    String currentServer();

    /**
     * Reports whether a player is in the rotation.
     *
     * @param player
     *            the player to check
     * @return true if the player exists in the rotation
     * @ensures containsPlayer = (player is in entries of this)
     */
    boolean containsPlayer(String player);

    /**
     * Returns the player at a given position.
     *
     * @param position
     *            the index in the rotation
     * @return the player at that position
     * @requires 0 <= position < |this|
     * @ensures player = this[position]
     */
    String playerAtPosition(int position);

    /**
     * Clears the rotation and resets it to empty.
     *
     * @updates this
     * @ensures this = <>
     */
    void resetRotation();
}