package ocp11.ch12.review;

public class Movie {

    private int butter = 5;

    private Movie() {
    }
    //Inner class
    protected class Popcorn {

        private Popcorn() {
        }
        public static final int butter = 10;

        public void startMovie() {
            System.out.println(butter);
        }
    }
      
    public static void main(String[] args) {
        var movie = new Movie();
        Movie.Popcorn in = new Movie().new Popcorn();
        in.startMovie();        
    }
}
