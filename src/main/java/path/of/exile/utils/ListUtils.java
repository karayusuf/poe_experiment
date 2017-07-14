package path.of.exile.utils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class ListUtils {

    private ListUtils() {}

    public static <T> Double sum(final List<T> list, final Supplier<Double> value) {
        return foldLeft(list, () -> Double.valueOf(0d), (sum, t) -> Double.sum(sum, value.get()));
    }

    public static <T> Double product(final List<T> list, final Function<T, Double> mapper) {
        return foldLeft(list, () -> Double.valueOf(0d), (sum, t) -> sum * mapper.apply(t));
    }

    public static <T, R> R foldLeft(final List<T> list, final Supplier<R> identity, final BiFunction<R, T, R> function) {
        R result = identity.get();

        for (final T t : list) {
            result = function.apply(result, t);
        }

        return result;
    }

}
