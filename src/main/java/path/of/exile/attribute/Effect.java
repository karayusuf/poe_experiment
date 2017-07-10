package path.of.exile.attribute;

public class Effect {

    public static Effect effect(
            final Operator operator,
            final Value value,
            final Attribute attribute) {
        return new Effect(value, operator, attribute);
    }

    private final Value value;
    private final Operator operator;
    private final Attribute attribute;

    private Effect(
            final Value value,
            final Operator operator,
            final Attribute attribute) {
        this.value = value;
        this.operator = operator;
        this.attribute = attribute;
    }
}
