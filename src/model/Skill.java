package model;

public class Skill {
    private String name;
    private int damage;
    private int critValue;
    private Status statusEffect;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.critValue = damage * 2;
        this.statusEffect = new Status();
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
