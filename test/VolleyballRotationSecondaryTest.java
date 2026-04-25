import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VolleyballRotationSecondaryTest {

    @Test
    public void testCurrentServer() {
        VolleyballRotation r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");

        assertEquals("A", r.currentServer());
        assertEquals(2, r.size());
    }

    @Test
    public void testContainsPlayer() {
        VolleyballRotation r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");

        assertTrue(r.containsPlayer("B"));
        assertFalse(r.containsPlayer("Z"));
    }

    @Test
    public void testRotateTo() {
        VolleyballRotation r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");
        r.addPlayer("C");

        r.rotateTo("C");

        assertEquals("C", r.currentServer());
    }

    @Test
    public void testPlayerAtPosition() {
        VolleyballRotation r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");

        assertEquals("B", r.playerAtPosition(1));
    }
}