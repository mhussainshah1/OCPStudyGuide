package ocp11.ch08.inheritance;

import java.util.List;

public class Generic {
    void sing1(List<?> v) {} // unbounded wildcard
    void sing2(List<? super String> v) {} // lower bounded wildcard
    void sing3(List<? extends String> v) {} // upper bounded wildcard
}
