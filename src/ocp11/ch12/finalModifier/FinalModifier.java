package ocp11.ch12.finalModifier;

public class FinalModifier {

    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) {
            lemur = 5;
        } else {
            lemur = 10;
        }
        System.out.println(giraffe + " " + lemur);
    }

    private void printZooInfo1(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) {
            lemur = 5;
        }
        giraffe = 3;                            // DOES NOT COMPILE
        System.out.println(giraffe + " " + lemur);  // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        final StringBuilder cobra = new StringBuilder();
        cobra.append("Hssssss");
        cobra.append("Hssssss!!!");
        System.out.println(cobra);
        
        cobra = new StringBuilder();
    }
}
