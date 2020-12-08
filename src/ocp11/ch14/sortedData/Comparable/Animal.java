package ocp11.ch14.sortedData.Comparable;

public class Animal implements Comparable<Animal> {

    private int id;

    @Override
    public int compareTo(Animal a) {
      
        return id - a.id; // sorts ascending by id
//          return Integer.compare(id, a.id);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.id = 5;
        a2.id = 7;
        System.out.println(a1.compareTo(a2)); // 5-7 = -2
        System.out.println(a1.compareTo(a1)); // 5-5 = 0
        System.out.println(a2.compareTo(a1)); // 7-2 = 2
    }
}