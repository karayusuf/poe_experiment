package path.of.exile.stats;

public class Stat {

    private final StatName name;
    private final StatType type;
    private final double value;

    public static Stat of(final StatName name, final StatType type, final double value) {
        return new Stat(name, type, value);
    }

    private Stat(final StatName name, final StatType type, final double value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public StatName getName() {
        return name;
    }

    public StatType getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public boolean isAdditive() {
        return type.isAdditive();
    }

    public boolean isFlat() {
        return type.isFlat();
    }

    public boolean isMultiplicitive() {
        return type.isMultiplicitive();
    }
}
