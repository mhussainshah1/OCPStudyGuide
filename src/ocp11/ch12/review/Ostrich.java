package ocp11.ch12.review;

public class Ostrich {

    private int count;

    private interface Wild {
    }

    static class OstrichWrangler implements Wild {

        public int stampede() {
            return count; //new Ostrich().count;
        }
    }
}



    


