package ocp11.ch14.generic.wildcards;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}

public class Summary {

    public static void main(String[] args) {
        //wild card
        
        //unbounded
        List<?> list1 = new ArrayList<A>(); //hold instace of any list
//        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE: require class or interface without bounds

        //upper bounded - hold instance of list of type (A) subtype(B and C)
        List<? extends A> list2 = new ArrayList<A>();// A, B, C
                          list2 = new ArrayList<B>();
                          list2 = new ArrayList<C>();
                          
        List<? extends B> //list4 = new ArrayList<A>(); // DOES NOT COMPILE: hold instance of B and C
                          list4 = new ArrayList<B>();//B,C
                          list4 = new ArrayList<C>();
                          
        //lower bounded - hold instance of type (A) and super type (Object)
        List<? super A> list3 = new ArrayList<Object>();// Object, A
                        list3 = new ArrayList<A>(); //
                        
                          
        List<? super B> list5 = new ArrayList<Object>();
                        list5 = new ArrayList<A>();//hold instance of list of B and supertype (B and object)
                        list5 = new ArrayList<B>();

        Summary list = new Summary();
        System.out.println(list.first(new ArrayList<String>()));
        System.out.println(list.first(new ArrayList<Number>()));
        
        list.fourth(new ArrayList<B>());
        list.fourth(new ArrayList<A>());
        list.fourth(new ArrayList<Object>());

    }

    <T> T first(List<? extends T> list) {
        return list.get(0);
    }
/*
    <? extends T> T second(List<? extends T> list) { // DOES NOT COMPILE
        return list.get(0);
    }

    <B extends A> B third(List<B> list) {
        return new B(); // DOES NOT COMPILE: B is parameter within the scope of method
    }
*/
    void fourth(List<? super B> list) {
    }
    
/*
    <X> void fifth(List<X super B> list) { // DOES NOT COMPILE: A parameter wild card must have ?
    }
*/
}
