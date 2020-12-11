package ocp11.ch13.applying;

public @interface Music {
    String[] genres();
}

class Giraffe {

    @Music(genres = {"Rock and roll"})
    String mostDisliked;

    @Music(genres = "Classical")
    String favorite;
}

class Reindeer {

    @Music(genres = "Blues", "Jazz")
    String favorite; // DOES NOT COMPILE

    @Music(genres =)
    String mostDisliked; // DOES NOT COMPILE

    @Music(genres = null)
    String other; // DOES NOT COMPILE

    @Music(genres = {})
    String alternate;
}
