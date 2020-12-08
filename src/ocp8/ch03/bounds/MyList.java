package ocp8.ch03.bounds;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}
public class MyList {

    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>(); //hold instace of any list
        List<? extends A> list2 = new ArrayList<A>();//hold instance of list of A,B and C
        list2 = new ArrayList<B>();
        list2 = new ArrayList<C>();

        List<? super A> list3 = new ArrayList<A>();// hold instance of A and Object
        list3 = new ArrayList<Object>();

        List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE: hold instance of B and C
        List<? super B> list5 = new ArrayList<A>();//hold instance of list of A,B and object
        list5 = new ArrayList<B>();
        list5 = new ArrayList<Object>();

        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE: require class or interface without bounds

        MyList myList = new MyList();
        System.out.println(myList.method1(list2));

    }

    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

    <T> <? extends T> method2(List<? extends T> list) { // DOES NOT COMPILE
        return list.get(0);
    }

    <B extends A> B method3(List<B> list) {
        return new B(); // DOES NOT COMPILE: B is type parameter within the scope of method
    }

    void method4(List<? super B> list) {
    }
    
    <X> void method5(List<X super B> list) { // DOES NOT COMPILE
    }
}
