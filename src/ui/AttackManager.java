package ui;

import model.Player;
import model.Pog;

public class AttackManager {
    private Player opponent;
    private Player challenger;

    private Pog fiona;

    public AttackManager(Player player) {
        createOpponent();
        System.out.println(challenger.getName() + " with " + fiona.getName() + " approaches");

        if (fiona.getSpeed() > player.getPoggers().get(0).getSpeed()) {
            System.out.println("HELLO");
        }
    }

    public void createOpponent() {
        challenger = new Player("Shrek");
        fiona = new Pog("Fiona", 5);

        challenger.addPog(fiona);
    }


}
