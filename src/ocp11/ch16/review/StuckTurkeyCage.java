package ocp11.ch16.review;

import java.io.*;

public class StuckTurkeyCage implements AutoCloseable {

    public void close() throws IOException {
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        } catch (Exception e){
            
        }
    }
}
