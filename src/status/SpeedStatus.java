package status;

public class SpeedStatus extends Status {
    public String name;

    public SpeedStatus(double value) {
        super(value);
        this.name = "speedStatus";
    }
}
