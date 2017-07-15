package path.of.exile.stats;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static path.of.exile.stats.StatModifierType.ADDITIVE_INCREASE;
import static path.of.exile.stats.StatModifierType.FLAT_ADD;
import static path.of.exile.stats.StatModifierType.MULTIPLICITIVE_LESS;

public class StatCalculatorTest {

    @Test
    public void testFlatAndAdditive() throws Exception {
        final List<StatModifier> modifiers = new ArrayList<>();
        modifiers.add(StatModifier.of(FLAT_ADD, 75.0d));
        modifiers.add(StatModifier.of(FLAT_ADD, 25.0d));
        modifiers.add(StatModifier.of(ADDITIVE_INCREASE, 1.0d));
        modifiers.add(StatModifier.of(ADDITIVE_INCREASE, 1.0d));

        final StatCalculator statCalculator = StatCalculator.getInstance();
        final double statValue = statCalculator.getStatValue(modifiers);

        assertEquals(400.0d, statValue, 0.0001);
    }

    @Test
    public void testDamageConversion() throws Exception {
        final List<StatModifier> modifiers = new ArrayList<>();
        modifiers.add(StatModifier.of(FLAT_ADD, 75.0d));
        modifiers.add(StatModifier.of(FLAT_ADD, 25.0d));
        modifiers.add(StatModifier.of(ADDITIVE_INCREASE, 1.0d));
        modifiers.add(StatModifier.of(ADDITIVE_INCREASE, 1.0d));
        modifiers.add(StatModifier.of(MULTIPLICITIVE_LESS, -0.5d));

        final StatCalculator statCalculator = StatCalculator.getInstance();
        final double statValue = statCalculator.getStatValue(modifiers);

        assertEquals(200.0d, statValue, 0.0001);
    }

}