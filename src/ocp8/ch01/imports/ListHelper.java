package ocp8.ch01.imports;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;

public class ListHelper {

    public List<String> copyAndSortList(List<String> original) {
        var list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
}