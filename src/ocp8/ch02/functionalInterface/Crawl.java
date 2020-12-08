package ocp8.ch02.functionalInterface;

@FunctionalInterface
interface Walk {
}

@FunctionalInterface
interface Dance extends Sprint {

    public void dance(Animal animal);
}

@FunctionalInterface
public interface Crawl {

    public void crawl();

    public int getCount();
}
