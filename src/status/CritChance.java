package status;

public class CritChance extends Status {
    public String name;

    public CritChance(double value) {
        super(value);
        this.name = "critChance";
    }
}
