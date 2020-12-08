package ocp8.ch04;

interface Gorilla {

    String move();
}

class GorillaFamily {

    private final String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";
        //approach = "run";

        play(() -> walk);// use instace variable
        play(() -> baby ? "hitch a ride" : "run"); //use parameter
        play(() -> approach); // use local variable
    }

       
    void play(Gorilla g) {
        System.out.println(g.move());
    }
}
