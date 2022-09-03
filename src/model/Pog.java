package model;

import java.util.ArrayList;
import java.util.List;

public class Pog {
    private int health;
    private List<Skill> skills;

    public Pog() {
        this.health = 100;
        this.skills = new ArrayList<>();
    }

    public Pog(int health, List<Skill> skills) {
        this.health = health;
        this.skills = skills;
    }

}
