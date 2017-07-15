package path.of.exile.stats;

public class StatModifier {

    public static StatModifier of(final StatModifierType type, final double value) {
        return new StatModifier(type, value);
    }

    private final StatModifierType type;
    private final double value;

    private StatModifier(final StatModifierType type, final double value) {
        this.type = type;
        this.value = value;
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
