package ocp11.ch12.review;

public class Deer {

    enum Food {
        APPLES, BERRIES, GRASS
    }

    protected class Diet {

        private Food getFavorite() {
            return Food.BERRIES;
        }
    }

    public static void main(String[] seasons) {
        switch (new Diet().getFavorite()) {
            case APPLES:
                System.out.print("a");
            case BERRIES:
                System.out.print("b");
            default:
                System.out.print("c");
        }
    }
}
