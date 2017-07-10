package path.of.exile.attribute;

public class Value {

    public static Value value(final float base) {
        return new Value(base, 0.0f);
    }

    public static Value multiplier(final float multipler) {
        return new Value(0.0f, multipler);
    }

    private final float base;
    private final float multiplier;

    private Value(final float base, final float multiplier) {
        this.base = base;
        this.multiplier = multiplier;
    }
}
