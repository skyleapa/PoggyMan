package model;

public class Skill {
    private String name;
    private int damage;
    private int critValue;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.critValue = damage * 2;
    }

    public Skill(String name, int damage, void speedBuff) {

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
