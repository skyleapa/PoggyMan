package ui;

import model.Player;
import model.Pog;
import model.Skill;

import java.util.Scanner;

public class GamePlayer {
    private Scanner scanner;
    private Player player;

    private Skill amogus;
    private Skill okipullup;
    private Skill cornjuice;

    private Pog imposter;
    private Pog capybara;
    private Pog corn;

    public GamePlayer() {
        scanner = new Scanner(System.in);
        String response;
        System.out.println("Welcome! What is your name?");
        response = scanner.nextLine();
        player = new Player(response);
        System.out.println("Poggers! What's up " + player.getName());

        pogSelect();

        presentOptions();
        response = scanner.nextLine();
        switch (response) {
            case "1":
                attackSequence();
                break;
            case "2":
                System.out.println("You bolt out of there with your tail between your legs");
                System.exit(0);
                break;
            default:
                System.out.println("I didn't understand that");
        }
    }

    public void pogSelect() {
        createPogs();

        scanner = new Scanner(System.in);
        String response;
        System.out.println("========================================");
        System.out.println("This is a special moment... Choose your Pog Champ!");
        System.out.println("1. Imposter - High stealth, high speed, but very sussy");
        System.out.println("2. Capybara - High charm, low mobility");
        System.out.println("3. Corn - It's corn! A big lump with knobs, it has the juice, I couldn't imagine a more beautiful thing.");

        response = scanner.nextLine();
        switch (response) {
            case "1":
                System.out.println("Amongus???");
                player.addPog(imposter);
                break;
            case "2":
                System.out.println("Capy with orange on head");
                player.addPog(capybara);
                break;
            case "3":
                System.out.println("What a beautiful thing");
                player.addPog(corn);
                break;
            default:
                System.out.println("What?");
                break;
        }
    }

    public void createPogs() {
        amogus = new Skill("Amogus", 20, "You've been sussed out");
        okipullup = new Skill("Pulling Up", 15, "You pulled up at the after party");
        cornjuice = new Skill("Big Lump With Knobs", 25, "Try it with butter");

        imposter = new Pog("Imposter", 30);
        capybara = new Pog("Capybara", 10);
        corn = new Pog("Corn", 20);

        imposter.addSkill(amogus);
        capybara.addSkill(okipullup);
        corn.addSkill(cornjuice);
    }

    public void presentOptions() {
        System.out.println("========================================");
        System.out.println("You enter the ring with your opponent! What do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Flee");
    }

    public void attackSequence() {
        System.out.println("Attacking");
        new AttackManager(player);
    }
}
