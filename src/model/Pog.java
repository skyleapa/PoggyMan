package model;

import java.util.ArrayList;
import java.util.List;

public class Pog {
    private String name;
    private double health;
    private List<Skill> skills;
    private double speed;

    public Pog(String name, int speed) {
        this.name = name;
        this.health = 100.0;
        this.speed = speed;
        this.skills = new ArrayList<>();
    }

    public boolean hasHealth() {
        return health > 0;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
