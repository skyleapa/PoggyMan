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
    public AttackManager(GamePlayer gamePlayer, Pog pogger) {
        scanner = new Scanner(System.in);
        createOpponent();
        System.out.println(challenger.getName() + " with " + fiona.getName() + " approaches");
        String response;

        if (fiona.getSpeed() > pogger.getSpeed()) {
            fionaAttack(pogger);
        } else {
            playerAttack(pogger);
        }

        System.out.println("=============================================");
        System.out.println("What do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Flee");
        response = scanner.nextLine();

        gamePlayer.actionManager(response);
    }

    public void fionaAttack(Pog pogger) {
        System.out.println("Fiona is about to attack!");

        Random rand = new Random();
        int randomNum = rand.nextInt(30 + 1);

        Skill temp = new Skill("Swamp Attack", randomNum, "swampy");

        fiona.addSkill(temp);
        temp.attack(pogger);
        System.out.println(temp.getName() + " has been used to " + pogger.getName());

        System.out.println(pogger.getName() + " has " + pogger.getHealth() + " health remaining.");
    }

    public void playerAttack(Pog pogger) {
        String response;
        System.out.println(pogger.getName() + " is about to attack! What skill do you want to use?");

        String skills = "";
        for (Skill s : pogger.getSkills()) {
            skills += "- " + s.getName() + "\n";
        }

        System.out.println(skills);

        response = scanner.nextLine();
        for (Skill s : pogger.getSkills()) {
            if (response.equals(s.getName())) {
                s.attack(fiona);
                System.out.println(s.getName() + " was cast!");
                System.out.println(fiona.getName() + " has " + fiona.getHealth() + " health remaining.");
            }
        }
    }


    public void createOpponent() {
        challenger = new Player("Shrek");
        fiona = new Pog("Fiona", 15);

        challenger.addPog(fiona);
    }


}
