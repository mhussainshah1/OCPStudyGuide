package ocp11.ch05.reviews;

public class Fourteen {

    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        System.out.println(puzzle);

        puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println(puzzle);
    }
}
