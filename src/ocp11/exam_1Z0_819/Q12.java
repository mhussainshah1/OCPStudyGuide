package ocp11.exam_1Z0_819;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Q12 {

    public static void main(String[] args) {
        Stream<Member> clubMembers = Stream.of(new Member("smith", 2020));
        String testName = "smith";
        int testMembershipLength = 5;
        long matches = clubMembers
                .peek(new Consumer<Member>() {
                    @Override
                    public void accept(Member m) {
                        m.print();
                    }
                })
                .filter(m -> m.getYearsMembership() >= testMembershipLength)
                .map(m -> testName.compareToIgnoreCase(m.getName()))
                .filter(a -> a==0)
                .count();
        System.out.println(matches);
    }

}

class Member {

    private String name;
    private int yearsMembership;

    public Member() {
    }

    public Member(String name, int yearsMembership) {
        this.name = name;
        this.yearsMembership = yearsMembership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsMembership() {
        return yearsMembership;
    }

    public void setYearsMembership(int yearsMembership) {
        this.yearsMembership = yearsMembership;
    }

    void print() {
        System.out.println("print");
    }
}
