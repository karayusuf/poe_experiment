package path.of.exile.stats;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static path.of.exile.stats.StatName.PhysicalDamage;
import static path.of.exile.stats.StatType.ADDITIVE_INCREASE;
import static path.of.exile.stats.StatType.FLAT_ADD;

public class StatCalculatorTest {

    @Test
    public void testFlatAndAdditive() throws Exception {
        final List<Stat> stats = new ArrayList<>();
        stats.add(Stat.of(PhysicalDamage, FLAT_ADD, 75.0d));
        stats.add(Stat.of(PhysicalDamage, FLAT_ADD, 25.0d));
        stats.add(Stat.of(PhysicalDamage, ADDITIVE_INCREASE, 1.0d));
        stats.add(Stat.of(PhysicalDamage, ADDITIVE_INCREASE, 1.0d));

        final StatCalculator statCalculator = StatCalculator.getInstance();
        final double statValue = statCalculator.getStatValue(stats);

        assertEquals(400.0d, statValue, 0.0001);
    }

}