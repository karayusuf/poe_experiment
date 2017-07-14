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

    public double getStatValue(final List<Stat> stats) {
        return (getFlatValue(stats)
                * (ONE + getAdditiveValue(stats))
                * getMultiplicitiveValue(stats));
    }

    private double getFlatValue(final List<Stat> stats) {
        return stats.stream()
                .filter(Stat::isFlat)
                .map(Stat::getValue)
                .reduce(ZERO, (x, y) -> x + y);
    }

    private double getAdditiveValue(final List<Stat> stats) {
        return stats.stream()
                .filter(Stat::isAdditive)
                .map(Stat::getValue)
                .reduce(ONE, (x, y) -> x + y);
    }

    private double getMultiplicitiveValue(final List<Stat> stats) {
        return stats.stream()
                .filter(Stat::isMultiplicitive)
                .map(Stat::getValue)
                .reduce(ONE, (x, y) -> x + y);
    }


}
