package ocp8.ch02.designPattern.singleton;

public class LlamaTrainer {

    public boolean feedLlamas(int numberOfLlamas) {
        int amountNeeded = 5 * numberOfLlamas;
        
        HayStorage hayStorage = HayStorage.getINSTANCE();
        
        if (hayStorage.getHayQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        
        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed) {
            System.out.println("Llamas have been fed");
        }
        return fed;
    }
}
