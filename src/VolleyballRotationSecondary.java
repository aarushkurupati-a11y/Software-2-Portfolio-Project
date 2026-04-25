/**
 * Secondary implementations for VolleyballRotation.
 */
public abstract class VolleyballRotationSecondary
        implements VolleyballRotation {

    @Override
    public String currentServer() {
        assert this.size() > 0 : "Rotation must not be empty";

        String server = this.removeServer();
        this.addPlayer(server); // restore
        return server;
    }

    @Override
    public boolean containsPlayer(String player) {
        assert player != null : "Player cannot be null";

        boolean found = false;
        int n = this.size();

        for (int i = 0; i < n; i++) {
            String current = this.removeServer();

            if (current.equals(player)) {
                found = true;
            }

            this.addPlayer(current); // restore
        }

        return found;
    }

    @Override
    public String playerAtPosition(int position) {
        assert 0 <= position && position < this.size()
                : "Position out of bounds";

        String result = null;
        int n = this.size();

        for (int i = 0; i < n; i++) {
            String current = this.removeServer();

            if (i == position) {
                result = current;
            }

            this.addPlayer(current); // restore
        }

        return result;
    }

    @Override
    public void rotateTo(String player) {
        assert this.containsPlayer(player)
                : "Player must exist in rotation";

        while (!this.currentServer().equals(player)) {
            this.rotate();
        }
    }

    @Override
    public void resetRotation() {
        int n = this.size();

        for (int i = 0; i < n; i++) {
            this.removeServer();
        }
    }
}