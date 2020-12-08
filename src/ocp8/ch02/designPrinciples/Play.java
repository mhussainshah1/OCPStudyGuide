package ocp8.ch02.designPrinciples;

public class Play {

    private boolean playing;
    private Boolean dancing;

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public Boolean getDancing() {
        return dancing;
    }

    public void setDancing(Boolean dancing) {
        this.dancing = dancing;
    }
}