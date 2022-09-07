package model;

public class Skill {
    private String name;
    private int damage;
    private String description;

    public Skill(String name, int damage, String description) {
        this.name = name;
        this.damage = damage;
        this.description = description;
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
