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
    private Skill sus;
    private Skill citrusfruit;
    private Skill biglump;

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
        actionManager(response);
    }

    public void actionManager(String response) {
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
        amogus = new Skill("amogus", 20, "You've been sussed out");
        okipullup = new Skill("okipullup", 15, "You pulled up at the after party");
        cornjuice = new Skill("cornjuice", 25, "Try it with butter");

        sus = new Skill("sus", 21, "sussy");
        citrusfruit = new Skill("Citrus Attack", 10, "Take a bath in it");
        biglump = new Skill("Big Lump", 29, "Big lump with knobs");

        imposter = new Pog("Imposter", 30);
        capybara = new Pog("Capybara", 10);
        corn = new Pog("Corn", 20);

        imposter.addSkill(amogus);
        capybara.addSkill(okipullup);
        corn.addSkill(cornjuice);
        imposter.addSkill(sus);
        capybara.addSkill(citrusfruit);
        corn.addSkill(biglump);
    }

    public void presentOptions() {
        System.out.println("========================================");
        System.out.println("You enter the ring with your opponent! What do you want to do?");
        System.out.println("1. Attack");
        System.out.println("2. Flee");
    }

    public void attackSequence() {
        new AttackManager(this, player.getPoggers().get(0));
    }
}
