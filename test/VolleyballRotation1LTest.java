import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VolleyballRotation1LTest {

    @Test
    public void testAddAndSize() {
        VolleyballRotationKernel r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");

        assertEquals(2, r.size());
    }

    @Test
    public void testRotate() {
        VolleyballRotationKernel r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");
        r.addPlayer("C");

        r.rotate();

        assertEquals("B", r.removeServer());
    }

    @Test
    public void testRemoveServer() {
        VolleyballRotationKernel r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.addPlayer("B");

        assertEquals("A", r.removeServer());
        assertEquals(1, r.size());
    }

    @Test
    public void testClear() {
        VolleyballRotationKernel r = new VolleyballRotation1L();

        r.addPlayer("A");
        r.clear();

        assertEquals(0, r.size());
    }

    @Test
    public void testTransferFrom() {
        VolleyballRotation1L r1 = new VolleyballRotation1L();
        VolleyballRotation1L r2 = new VolleyballRotation1L();

        r1.addPlayer("A");
        r1.addPlayer("B");

        r2.transferFrom(r1);

        assertEquals(2, r2.size());
        assertEquals(0, r1.size());
        assertEquals("A", r2.currentServer());
    }
}