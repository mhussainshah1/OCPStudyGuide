package ocp11.ch13.specific;

import java.lang.annotation.Repeatable;
//Java7 - Array of Annotation
@interface Risk7 {
    String danger();
    int level() default 1;
}

@interface Risks7 {
    Risk7[] value();
}

//Java 8 -Repeatable Annotation
@Repeatable(Risks8.class)
@interface Risk8 {
    String danger();
    int level() default 1;
}

@interface Risks8 {
    Risk8[] value();
}

public class Zoo {
    public static class Monkey {}
    //Java 7
    @Risks7({
        @Risk7(danger = "Silly"),
        @Risk7(danger = "Aggressive", level = 5),
        @Risk7(danger = "Violent", level = 10)
    })
    private Monkey monkey7;

    //Java 8
    @Risk8(danger = "Silly")
    @Risk8(danger = "Aggressive", level = 5)
    @Risk8(danger = "Violent", level = 10)
    private Monkey monkey8;
}
