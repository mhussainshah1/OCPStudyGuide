package ocp11.ch10.review;

import java.io.IOException;

public class TwentyTwo {

    public void donotFail() {
        try {
            System.out.println("work real hard");
        } /*catch (Exception e) {

        } */catch (IOException e) {

        } catch (StackOverflowError e) {

        } catch (IllegalArgumentException e) {

        } catch (RuntimeException e) {

        } 
    }
}
