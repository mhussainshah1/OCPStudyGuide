package java11;

import java.util.ArrayList;
import java.util.List;

public class Guideline6 {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        var list1 = new ArrayList<>();//List<Object>
        var list2 = new ArrayList<String>();//List<String>

        //use argument to inferred properly
        var list3 = new ArrayList<>(list);//List<String>
    }
}
