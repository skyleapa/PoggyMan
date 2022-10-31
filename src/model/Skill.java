package model;

import status.Status;

import java.util.HashSet;
import java.util.Set;

public class Skill {
    private String name;
    private int damage;
    private double critChance;
    private Set<Status> statuses;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.critChance = 0.01;
        this.statuses = new HashSet<>();
    }

    // DONE: speed, attack, crit
    // TODO: accuracy, defence
    public void attack(Pog pog) {
        double damageDealt = damage;
        double currentHealth = pog.getHealth();

        for (Status status : statuses) {
            if (status.getName() == "attackmanager") {
                damageDealt = damageDealt + (damageDealt * status.value);
            }
            if (status.getName() == "speedStatus") {
                pog.setSpeed(status.value);
            }
            if (status.getName() == "defenseStatus") {
                pog.setDefense(status.value);
            }
            if (status.getName() == "critChance") {
                critChance = status.value;
            }
            if (status.getName() == "accuracyStatus") {
                // TODO
            }
        }

        // crit damage calculator
        if (new java.util.Random().nextDouble(critChance * 100) == 1) {
            System.out.println(name + " is a crit!");
            damageDealt = 2 * damage;
        }

        double newHealth = currentHealth - damageDealt;
        pog.setHealth(newHealth);
    }

    public void addStatus(Status status) {
        this.statuses.add(status);
    }

    public String getName() {
        return name;
    }

}
