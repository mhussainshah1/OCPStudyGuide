package ocp11.ch16.review;

import java.io.*;

public class EntertainmentCenter {

    static class TV implements AutoCloseable {

        @Override
        public void close() {
            System.out.print("D");
        }
    }

    static class MediaStreamer implements Closeable {

        @Override
        public void close() {
            System.out.print("W");
        }
    }

    public static void main(String[] args) {
        var w = new MediaStreamer();
        try (TV d = new TV(); w;) {
            System.out.print("T");
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
