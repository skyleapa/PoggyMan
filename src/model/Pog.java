package model;

import java.util.ArrayList;
import java.util.List;

public class Pog {
    private String name;
    private int health;
    private List<Skill> skills;
    private int speed;
    private Status pogStatus;

    public Pog(String name, int speed) {
        this.name = name;
        this.health = 100;
        this.speed = speed;
        this.skills = new ArrayList<>();
        this.pogStatus = new Status();
    }

    public boolean hasHealth() {
        return health > 0;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
