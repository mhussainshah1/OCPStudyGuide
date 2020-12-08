package ocp11.exam_1Z0_819;

abstract class Media {

    int duration;
    int volume;
    int contrast;
    String title;
    abstract void play();
    abstract void stop();
    abstract void changeVolume(int x);
    abstract void changeContrast(int x);
    abstract void changeTitle(String title);
}

interface Cinematic {
}

interface Acoustic {
}

class MediaFormatl extends Media implements Acoustic {
}

class MediaFormatZ extends Media implements Cinematic {
}

class MediaFormat3 extends Media implements Cinematic, Acoustic {
}
