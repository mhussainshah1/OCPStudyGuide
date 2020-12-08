package ocp11.ch16.review;

public class SnowStorm {

    static class WalkToSchool implements AutoCloseable {

        public void close() {
            throw new RuntimeException("flurry");
        }
    }

    public static void main(String[] args) {
        WalkToSchool walk1 = new WalkToSchool();
        try (walk1; WalkToSchool walk2 = new WalkToSchool()) {
            throw new RuntimeException("blizzard");
        } catch (Exception e) {
            System.out.println(e.getMessage()
                    + " " + e.getSuppressed().length);
        }
        walk1 = null;
    }
}
