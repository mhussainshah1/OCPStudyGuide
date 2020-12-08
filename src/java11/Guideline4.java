package java11;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Guideline4 {

    List<String> strings = List.of("hello", "hello", "how", "are", "you", "?");

    public Optional<String> getMaximumEntry() {

        /*
        return strings.stream()
                .collect(groupingBy(s -> s, counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
         */
        //Spiliting it may yeild a good balanace of readability and concision
        /*Map<String, Long>*/
        var freqMap
                = strings
                        .stream()
                        .collect(groupingBy(s -> s, counting()));

        /* Optional<Map.Entry<String, Long>> */
        var maxEntryOpt
                = freqMap
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());
        return maxEntryOpt.map(Map.Entry::getKey);

    }

    public static void main(String[] args) {
        System.out.println(new Guideline4().getMaximumEntry());
    }
}
