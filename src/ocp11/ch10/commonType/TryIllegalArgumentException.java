package ocp11.ch10.commonType;

public class TryIllegalArgumentException {

    int numberEggs;

    public static void main(String[] args) {
        new TryIllegalArgumentException().setNumberEggs(-1);
    }

    public void setNumberEggs(int numberEggs) {// setter
        if (numberEggs >= 0) // guard condition
        {
            this.numberEggs = numberEggs;
        } else{
            throw new IllegalArgumentException("# eggs must not be negative");
        }
        this.numberEggs = numberEggs;
    }
}
