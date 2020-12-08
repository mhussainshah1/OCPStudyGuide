package ocp8.ch01.toString_equal_hashCode;

public class Lion {

    private int idNumber;
    private int age;
    private String name;

    public Lion(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Lion)) {
            return false;
        }
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;
    }

    /*
    //Overloaded method
    public boolean equals(Lion obj) {
        if (obj == null) {
            return false;
        }
        return this.idNumber == obj.idNumber;
    }
     */
    @Override
    public int hashCode() {
//        return idNumber; //Ok
//        return 6;//Ok
//        return idNumber * 7 + age;//Not legal: uses more variable than equals()

        return idNumber * 7 + name.hashCode();
        //pick the key fields that identify your object (and don’t change during the program) and combine them:
    }

    public static void main(String[] args) {
        Lion l1 = new Lion(1, 10, "king");
        Lion l2 = new Lion(1, 10, "Queen");

        System.out.println(l1.equals(l2));
    }
}
