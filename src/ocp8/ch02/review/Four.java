package ocp8.ch02.review;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Four {

    public static void main(String[] args) {
        Supplier<String> get = () -> "";
        Consumer<Camel> set = (Camel c) -> {return;};
    }
}

class Camel {

}
