public class GameSimulation {
    public static void main(String[] args) {
        VolleyballRotation team = new VolleyballRotation1L();

        team.addPlayer("Setter");
        team.addPlayer("Libero");
        team.addPlayer("Outside");

        System.out.println(team.currentServer());

        team.rotate();
        System.out.println(team.currentServer());
    }
}