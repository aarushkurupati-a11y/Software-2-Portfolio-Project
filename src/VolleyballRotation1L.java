import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of VolleyballRotationKernel using ArrayList.
 */
public class VolleyballRotation1L implements VolleyballRotationKernel {

    private List<String> rep;

    /**
     * Constructor initializes empty rotation.
     */
    public VolleyballRotation1L() {
        this.rep = new ArrayList<>();
    }

    @Override
    public void addPlayer(String player) {
        assert player != null : "Player cannot be null";

        this.rep.add(player);
    }

    @Override
    public void rotate() {
        assert this.rep.size() > 0 : "Cannot rotate empty rotation";

        String front = this.rep.remove(0);
        this.rep.add(front);
    }

    @Override
    public String removeServer() {
        assert this.rep.size() > 0 : "Cannot remove from empty rotation";

        return this.rep.remove(0);
    }

    @Override
    public int size() {
        return this.rep.size();
    }
}