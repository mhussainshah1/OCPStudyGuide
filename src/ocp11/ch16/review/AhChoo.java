package ocp11.ch16.review;

public class AhChoo {

    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

    public static void main(String[] args) {
        try {
            throw new SneezeException();
        } catch (SniffleException e) {
            e.printStackTrace();
        } catch (SneezeException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
