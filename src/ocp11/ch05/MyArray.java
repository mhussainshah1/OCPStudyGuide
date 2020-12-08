package ocp11.ch05;

public class MyArray {

    public static void main(String[] args) {
        char[] letters;
        int[] numbers1 = new int[3];

        //Anonymous Array
        //int[] numbers2 = new int[] {42, 55, 99};
        int[] numbers2 = {42, 55, 99};

        int[] numAnimals;
        int[] numAnimals2;
        int numAnimals3[];
        int numAnimals4[];

        //two variables of type int[]
        int[] ids, types;

        //one variable of type int[] and one variable of type int
        int ids1[], types1;

        int numbers3[] = {42, 55, 99, 0, 1, 5, 0, 0};
        numbers3[1] = 420;

        for (int number : numbers3) {
            System.out.print(number + ",");
        }
    }
}
