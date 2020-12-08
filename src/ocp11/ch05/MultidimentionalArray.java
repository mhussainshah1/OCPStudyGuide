package ocp11.ch05;

public class MultidimentionalArray {

    public static void main(String[] arg) {
        int[][] vars1; // 2D array
        int vars2[][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4[], space[][]; // a 2D AND a 3D array

        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};

        int[][] args = new int[4][];
        args[0] = new int[5];
        args[1] = new int[3];

        //Using a Multidimensional Array
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " "); // print element
            }
            System.out.println(); // time for a new row
        }
        //or
        for (int[] inner : twoD) {
            for (int num : inner) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
