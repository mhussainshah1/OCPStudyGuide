package ocp8.ch03.Comparing.Comparator;

import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {

    @Override
    public int compare(Squirrel s1, Squirrel s2) {
//        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
//        c = c.thenComparingInt(s -> s.getWeight());
//        return c.compare(s1, s2);
    
        //Chaining
        return Comparator
                .comparing((Squirrel s) -> s.getSpecies())
                .thenComparingInt(s->s.getWeight())
                .compare(s1, s2);
    }
}
