package ocp11.ch16.review;

public class Apple extends RuntimeException {
}

class Orange extends Exception {
}

class Banana extends Error {
}

class Pear extends Apple {
}

class Tomato extends Orange {
}

class Peach extends Banana {
}
