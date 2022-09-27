package status;

public class SpeedStatus extends Status {
    public String name;

    public SpeedStatus(int value) {
        super(value);
        this.name = "speedStatus";
    }
}
