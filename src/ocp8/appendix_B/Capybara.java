package ocp8.appendix_B;

abstract class Mammal {

    protected boolean hasFur() {
        return false;
    }
}

class Capybara implements Mammal {

    public boolean hasFur() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Capybara().hasFur());
    }
}
