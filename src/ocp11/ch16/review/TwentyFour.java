package ocp11.ch16.review;

import java.util.Properties;

public class TwentyFour {

    private static void print(Properties props) {
        System.out.println(props.get("veggies", "none")
                + " " + props.get("omni", "none"));
    }

    public static void main(String[] args) {

    }
}
