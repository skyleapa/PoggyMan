package model;

public class Status {
    private double speedStatus;
    private double attackStatus;
    private double accuracyStatus;
    private double defenseStatus;
    private double critChance;

    public Status() {
        this.speedStatus = 1;
        this.attackStatus = 1;
        this.accuracyStatus = 1;
        this.defenseStatus = 1;
        this.critChance = 1;
    }

    public void speedBuff() {
        speedStatus = 2;
    }

    public void speedDeBuff() {
        speedStatus = 0.5;
    }

    public double getCritChance() {
        return critChance;
    }


}
