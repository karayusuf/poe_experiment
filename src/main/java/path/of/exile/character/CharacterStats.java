package path.of.exile.character;

import path.of.exile.stats.Stat;
import path.of.exile.stats.StatName;
import path.of.exile.stats.StatType;
import path.of.exile.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public class CharacterStats {

//    private final Map<StatName, List<Stat>> statMap;

//    public CharacterStats(final List<Stat> stats) {
//        this.statMap = stats.stream().collect(Collectors.groupingBy(Stat::getName));
//        this.statCalculator = StatCalculator.getInstance();
//    }
//
//    public double getValue(final StatName statName) {
//        final Map<StatType, List<Stat>> statByType = getStat(statName);
//        final List<Stat> increasedStats = statByType.getOrDefault(StatType.ADDITIVE_INCREASE, emptyList());
//        final List<Stat> reducedStats = statByType.getOrDefault(StatType.ADDITIVE_REDUCE, emptyList());
//        final List<Stat> moreStats = statByType.getOrDefault(StatType.MULTIPLICITIVE_MORE, emptyList());
//        final List<Stat> lessStats = statByType.getOrDefault(StatType.MULTIPLICITIVE_LESS, emptyList());
//
//        return (ListUtils.sum(addedStat(statByType), Stat::getValue))
//                * (1 + sum(increasedStats) - sum(reducedStats))
//                * (product(moreStats) * product(lessStats)));
//    }
//
//    private Map<StatType, List<Stat>> getStat(final StatName statName) {
//        return statMap
//                .getOrDefault(statName, new ArrayList<>())
//                .stream()
//                .collect(Collectors.groupingBy(Stat::getType));
//    }
//
//    private List<Stat> addedStat(final Map<StatType, List<Stat>> statByType) {
//        final List<Stat> addedStats = statByType.getOrDefault(StatType.FLAT_ADD, emptyList());
//        addedStats.addAll(statByType.getOrDefault(StatType.FLAT_INCREASE, emptyList()));
//
//        return addedStats;
//    }

}
