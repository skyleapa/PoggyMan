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
        int currentHealth = pog.getHealth();
        int newHealth = currentHealth - damage;
        pog.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }

}
