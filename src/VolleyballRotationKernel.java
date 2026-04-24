import components.standard.Standard;

/**
 * VolleyballRotationKernel is the kernel interface for a volleyball rotation
 * component.
 *
 * @mathmodel
 * ROTATION is modeled by a sequence of PLAYER
 *
 * where:
 * - the sequence represents the clockwise order of players on the court
 * - position 0 is the current server position
 */
public interface VolleyballRotationKernel extends Standard<VolleyballRotation> {

    /**
     * Adds a player to the rotation.
     *
     * @param player
     *            the player to add
     * @updates this
     * @ensures this = #this * <player>
     */
    void addPlayer(String player);

    /**
     * Rotates the team one position clockwise.
     *
     * @updates this
     * @ensures this = tail(#this) * <head(#this)>
     */
    void rotate();

    /**
     * Removes and returns the player currently in the server position.
     *
     * @return the player removed
     * @updates this
     * @requires |this| > 0
     * @ensures <removeServer> = head(#this) and this = tail(#this)
     */
    String removeServer();

    /**
     * Returns the number of players currently in the rotation.
     *
     * @return the size of the rotation
     * @ensures size = |this|
     */
    int size();
}