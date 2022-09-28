package status;

public class DefenseStatus extends Status {
    public String name;

    public DefenseStatus(double value) {
        super(value);
        this.name = "defenseStatus";
    }
}
