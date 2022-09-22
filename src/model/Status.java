package model;

public class Status {
    private int speedStatus;
    private int attackStatus;
    private int accuracyStatus;
    private int defenseStatus;
    private int critChance;

    public Status() {
        this.speedStatus = 1;
        this.attackStatus = 1;
        this.accuracyStatus = 1;
        this.defenseStatus = 1;
        this.critChance = 1;
    }

    public void speedBuff() {
        this.speedStatus = 2;
    }

    public int getCritChance() {
        return critChance;
    }


}
