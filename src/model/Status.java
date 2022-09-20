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

    public int getSpeedStatus() {
        return speedStatus;
    }

    public void setSpeedStatus(int speedStatus) {
        this.speedStatus = speedStatus;
    }

    public int getAttackStatus() {
        return attackStatus;
    }

    public void setAttackStatus(int attackStatus) {
        this.attackStatus = attackStatus;
    }

    public int getAccuracyStatus() {
        return accuracyStatus;
    }

    public void setAccuracyStatus(int accuracyStatus) {
        this.accuracyStatus = accuracyStatus;
    }

    public int getDefenseStatus() {
        return defenseStatus;
    }

    public void setDefenseStatus(int defenseStatus) {
        this.defenseStatus = defenseStatus;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }
}
