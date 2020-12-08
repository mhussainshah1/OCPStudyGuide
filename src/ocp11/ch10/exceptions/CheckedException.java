package ocp11.ch10.exceptions;

import java.io.IOException;

public class CheckedException {

    //declare exception
    void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    //handle exception
    void fall2(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
