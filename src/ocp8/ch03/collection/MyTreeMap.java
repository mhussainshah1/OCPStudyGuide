package ocp8.ch03.collection;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet()) {
            System.out.print(key + ","); // giraffe,koala,lion,
        }
         for (String value : map.values()) {
            System.out.print(value + ","); // leaf,bamboo,meat,
        }
    }
}
