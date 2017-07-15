package path.of.exile.stats;

public class Stat {

    private final StatName name;
    private final double value;

    public static Stat of(final StatName name, final double value) {
        return new Stat(name, value);
    }

    private Stat(final StatName name, final double value) {
        this.name = name;
        this.value = value;
    }

    public StatName getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
