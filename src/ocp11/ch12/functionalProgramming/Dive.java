package ocp11.ch12.functionalProgramming;

@FunctionalInterface
public interface Dive {

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public void dive();
}

