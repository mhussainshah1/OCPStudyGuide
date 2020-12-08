package ocp11.ch15.exam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q15 {
    public static void main(String[] args) {
        var symbols = List.of("USD", "GBP", "EUR", "CNY");
        var exchangeRate = List.of(1.0, 1.3255, 1.1969, 0.1558094);
        var map1 =
                IntStream.range(0, symbols.size())
                        .boxed()
                        .collect(Collectors
                                .toMap(symbols::get, i -> 1.0 / exchangeRate.get(i)));
        System.out.println(map1.getClass());//HashMap: not sorted order

        var map2 =
                map1.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors
                                .toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new));

        map2.forEach((var k, var v) -> System.out.printf("%s -> %.2f\n", k, v));
    }
}