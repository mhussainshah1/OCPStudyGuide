package ocp11.ch13.review;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Plumber {

    String value() default "Mario";
}

class Team {

    @Plumber("")
    private String foreman = "Mario";
    
    @Plumber
    private String worker = "Kelly";
    
    @Plumber("Kelly")
    private String trainee;

    public static void main(String[] args) {
        var t = new Team();
        var fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Plumber.class)) {
                System.out.println(field
                        .getAnnotation(Plumber.class)
                        .value());
            }
        }
    }
}
