import java.util.ArrayList;
import java.util.List;

/**
 * Kernel implementation of VolleyballRotationKernel using ArrayList.
 */
public class VolleyballRotation1L extends VolleyballRotationSecondary {

    private List<String> rep;

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

    /**
     * Clears this object.
     */
    @Override
    public void clear() {
        this.rep.clear();
    }

    /**
     * Creates a new instance of the same type.
     */
    @SuppressWarnings("unchecked")
    @Override
    public VolleyballRotation newInstance() {
        try {
            return (VolleyballRotation) this.getClass().getDeclaredConstructor()
                    .newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError("Cannot construct new instance of "
                    + this.getClass().getName(), e);
        }
    }

    /**
     * Transfers data from source into this object.
     */
    @Override
    public void transferFrom(VolleyballRotation source) {
        assert source != null : "Source cannot be null";

        VolleyballRotation1L other = (VolleyballRotation1L) source;

        this.rep = other.rep;
        other.rep = new ArrayList<>();
    }
}