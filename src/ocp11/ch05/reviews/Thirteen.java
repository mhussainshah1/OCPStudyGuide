package ocp11.ch05.reviews;

public class Thirteen {

    public static void main(String[] args) {
        var puzzle = new StringBuilder("Java");
//        puzzle.reverse();//avaJ
//        puzzle.append("vaJ$").substring(0, 4);//JavavaJ$
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);//avaJ
//        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());//Exception
        System.out.println(puzzle);

    }
}
