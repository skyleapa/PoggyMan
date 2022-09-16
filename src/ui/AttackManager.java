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
    private boolean whoseFirst;

    public AttackManager(GamePlayer gamePlayer, Pog pogger) {
        scanner = new Scanner(System.in);
        createOpponent();
        System.out.println(challenger.getName() + " with " + fiona.getName() + " approaches");

        if (fiona.getSpeed() > pogger.getSpeed()) {
            fionaAttack(pogger);
            whoseFirst = true;
        } else {
            playerAttack(pogger);
            whoseFirst = false;
        }

        while(fiona.hasHealth() && pogger.hasHealth()) {
            if (whoseFirst) {
                playerAttack(pogger);
                whoseFirst = false;
            } else {
                fionaAttack(pogger);
                whoseFirst = true;
            }
        }
        System.out.println("someone has lost all their health");

    }

    public void fionaAttack(Pog pogger) {
        System.out.println("========================================");
        System.out.println("Fiona is about to attack!");

        Random rand = new Random();
        int randomNum = rand.nextInt(30 + 1);

        Skill temp = new Skill("Swamp Attack", randomNum, "swampy");

        fiona.addSkill(temp);
        temp.attack(pogger);
        System.out.println(temp.getName() + " has been used to " + pogger.getName());
        System.out.println(temp.getDescription());
        System.out.println(pogger.getName() + " has " + pogger.getHealth() + " health remaining.");
    }

    public void playerAttack(Pog pogger) {
        String response;
        System.out.println("========================================");
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
                System.out.println(s.getDescription());
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
