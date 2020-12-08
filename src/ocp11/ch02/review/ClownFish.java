package ocp11.ch02.review;

public class ClownFish {

    int gills = 0, double weight = 2;
    {
        int fins = gills;
    }

    void print(int length = 3) {
        System.out.println(gills);
        System.out.println(weight);
        System.out.println(fins);
        System.out.println(length);
    }
}
