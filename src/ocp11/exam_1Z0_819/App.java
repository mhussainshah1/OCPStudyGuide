package ocp11.exam_1Z0_819;

import java.util.Set;
import java.util.TreeSet;

enum Role {
    TL(10), ML(10), DEVELOPER(10);
    int weight = 100;

    private Role(int weight) {
        this.weight = weight;
    }
}

public class App {

    public static void main(String[] args) {
        Set<Role> roles = new TreeSet<>();
        roles.add(Role.ML);
        roles.add(Role.TL);
        roles.add(Role.DEVELOPER);
        for (Role r : roles) {
            System.out.println(r.weight + " " + r);
        }
    }
}
