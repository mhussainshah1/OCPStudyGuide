package ocp8.ch01.staticAndFinal;

public abstract class Cat {

    String name = "The Cat1";
    final static String name1 = "The Cat2";
    //1) No absract or concrete method

    //2) abstract method
    //abstract void clean();
    //3)concerete method
    void clean() {
    }

    //abstract void clean() throws RuntimeException;
}

class Lion extends Cat {

    final void clean() {
        name = "Lion1";
        name1 = "Lion2";
        System.out.println(Cat.name1);
    }
}
