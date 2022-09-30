package model;

import status.Status;

import java.util.HashSet;
import java.util.Set;

public class Skill {
    private String name;
    private int damage;
    private int critValue;
    private Set<Status> statuses;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.critValue = damage * 2;
        this.statuses = new HashSet<>();
    }

    public void attack(Pog pog) {
        int damageDealt = damage;
        int currentHealth = pog.getHealth();


        if (new java.util.Random().nextInt(critValue * 100) == 1) {
            System.out.println(name + " is a crit!");
            damageDealt = 2 * damage;
        }

        int newHealth = currentHealth - damageDealt;
        pog.setHealth(newHealth);
    }

    public void addStatus(Status status) {
        this.statuses.add(status);
    }

    public String getName() {
        return name;
    }

}
