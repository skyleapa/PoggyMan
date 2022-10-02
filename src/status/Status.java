package status;

public abstract class Status {
    public String getName() {
        return "no name";
    }

    private double value;

    public Status(double value) {
        this.value = value;
    }

}
