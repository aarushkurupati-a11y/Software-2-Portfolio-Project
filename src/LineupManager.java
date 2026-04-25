public class LineupManager {
    public static void main(String[] args) {

        VolleyballRotation lineup = new VolleyballRotation1L();

        lineup.addPlayer("A");
        lineup.addPlayer("B");
        lineup.addPlayer("C");
        lineup.addPlayer("D");

        lineup.rotateTo("C");

        System.out.println("Serve starts with: " + lineup.currentServer());
    }
}