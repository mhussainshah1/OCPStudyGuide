package ocp11.ch14.methodReferemce;

@FunctionalInterface
interface LearnToSpeak {

    void speak(String sound);
}

class DuckHelper {

    public static void teacher(String name, LearnToSpeak trainer) {
// exercise patience
        trainer.speak(name);
    }
}

public class Duckling {

    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner1 = System.out::println;
        
        DuckHelper.teacher(sound, learner);
    }
}
