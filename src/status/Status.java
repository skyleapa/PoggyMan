package status;

public abstract class Status {
    public String getName() {
        return "no name";
    }

    public double value;

    public Status(double value) {
        this.value = value;
    }

}
