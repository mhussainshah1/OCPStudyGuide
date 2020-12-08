package ocp8.ch01.toString_equal_hashCode;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hippo {

    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
//        return name;
//        return "Name: " + name + ", Weight: " + weight;
//        return ToStringBuilder.reflectionToString(this);
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100);
        System.out.println(h1); // Harry
    }
}
