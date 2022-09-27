package status;

public class AttackStatus extends Status {
    public String name;

    public AttackStatus(int value) {
        super(value);
        this.name = "attackStatus";
    }
}
