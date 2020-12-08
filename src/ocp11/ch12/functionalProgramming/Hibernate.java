package ocp11.ch12.functionalProgramming;

@FunctionalInterface
public interface Hibernate {

    String toString();

    public boolean equals(Hibernate o); //1

    public abstract int hashCode();

    public void rest();//2
}
