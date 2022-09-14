package ui;

import model.Player;
import model.Pog;
import model.Skill;

import java.util.Random;
import java.util.Scanner;

public class AttackManager {
    private Player challenger;
    private Pog fiona;

    private Scanner scanner;
    public AttackManager(Player player, GamePlayer gamePlayer) {
        scanner = new Scanner(System.in);
        createOpponent();
        System.out.println(challenger.getName() + " with " + fiona.getName() + " approaches");
        String response;

        if (fiona.getSpeed() > player.getPoggers().get(0).getSpeed()) {
            System.out.println("Fiona is about to attack!");

            Random rand = new Random();
            int randomNum = rand.nextInt(30 + 1);

            Skill temp = new Skill("Swamp Attack", randomNum, "swampy");

            fiona.addSkill(temp);
            temp.attack(player.getPoggers().get(0));
            System.out.println(temp.getName() + " has been used to " + player.getPoggers().get(0).getName());

            System.out.println(player.getPoggers().get(0).getName() + " has " + player.getPoggers().get(0).getHealth() + " health remaining.");

        } else {
            System.out.println(player.getPoggers().get(0).getName() + " is about to attack! What do you want to do?");

            String skills = "";
            for (Skill s : player.getPoggers().get(0).getSkills()) {
                skills += "- " + s.getName() + "\n";
            }

            System.out.println(skills);

            response = scanner.nextLine();
            for (Skill s : player.getPoggers().get(0).getSkills()) {
                if (response == s.getName()) {
                    s.attack(fiona);
                    System.out.println(fiona.getName() + " has " + fiona.getHealth() + " health remaining.");
                }
            }

        }

        System.out.println("=============================================");
        System.out.println("What do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Flee");
        response = scanner.nextLine();

        gamePlayer.actionManager(response);

    }

    public void createOpponent() {
        challenger = new Player("Shrek");
        fiona = new Pog("Fiona", 100);

        challenger.addPog(fiona);
    }


}
