package path.of.exile.stats;

import java.util.List;

public final class StatCalculator {

    private static final double ONE = 1.0d;
    private static final double ZERO = 0.0d;
    private static final StatCalculator INSTANCE = new StatCalculator();

    public static StatCalculator getInstance() {
        return INSTANCE;
    }

    private StatCalculator() { }

    public double getStatValue(final List<StatModifier> modifiers) {
        return (getFlatValue(modifiers)
                * (ONE + getAdditiveValue(modifiers))
                * getMultiplicitiveValue(modifiers));
    }

    private double getFlatValue(final List<StatModifier> modifiers) {
        return modifiers.stream()
                .filter(StatModifier::isFlat)
                .map(StatModifier::getValue)
                .reduce(ZERO, (x, y) -> x + y);
    }

    private double getAdditiveValue(final List<StatModifier> modifiers) {
        return modifiers.stream()
                .filter(StatModifier::isAdditive)
                .map(StatModifier::getValue)
                .reduce(ONE, (x, y) -> x + y);
    }

    private double getMultiplicitiveValue(final List<StatModifier> modifiers) {
        return modifiers.stream()
                .filter(StatModifier::isMultiplicitive)
                .map(StatModifier::getValue)
                .reduce(ONE, (x, y) -> x + y);
    }


}
