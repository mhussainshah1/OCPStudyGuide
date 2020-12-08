package ocp11.ch12.enums.constructor;

import java.lang.Enum;

public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;

    /*private*/ Season(String expectedVisitors) {//by default - private
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

//    @Override
//    Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    
    public static void main(String[] args) {
        Season.SUMMER.printExpectedVisitors();
    }
}
