package status;

public class AccuracyStatus extends Status {
    public String name;

    public AccuracyStatus(double value) {
        super(value);
        this.name = "accuracyStatus";
    }

    public String getName() {
        return name;
    }
}
