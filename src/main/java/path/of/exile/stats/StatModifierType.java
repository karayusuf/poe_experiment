package path.of.exile.stats;

public enum StatModifierType {
    FLAT_ADD,
    FLAT_INCREASE,

    ADDITIVE_INCREASE,
    ADDITIVE_REDUCE,

    MULTIPLICITIVE_MORE,
    MULTIPLICITIVE_LESS;

    public boolean isFlat() {
        return this.equals(FLAT_ADD) || this.equals(FLAT_INCREASE);
    }

    public boolean isAdditive() {
        return this.equals(ADDITIVE_INCREASE) || this.equals(ADDITIVE_REDUCE);
    }

    public boolean isMultiplicitive() {
        return this.equals(MULTIPLICITIVE_MORE) || this.equals(MULTIPLICITIVE_LESS);
    }
}
