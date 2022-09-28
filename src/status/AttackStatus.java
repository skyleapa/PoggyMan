package status;

public class AttackStatus extends Status {
    public String name;

    public AttackStatus(double value) {
        super(value);
        this.name = "attackStatus";
    }
}
