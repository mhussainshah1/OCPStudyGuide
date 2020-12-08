package ocp11.ch07.review;

public class Create {

    Create() {
        System.out.print("1 ");
    }

//    Create(int num) {
//        System.out.print("2 ");
//    }

    Create(Integer num) {
        System.out.print("3 ");
    }

    Create(Object num) {
        System.out.print("4 ");
    }

    Create(int... nums) {
        System.out.print("5 ");
    }

    public static void main(String[] args) {
        new Create(100);
        new Create(100L);
    }
}
