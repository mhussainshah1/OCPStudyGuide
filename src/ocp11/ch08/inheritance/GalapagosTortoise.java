package ocp11.ch08.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

class Reptile {

    protected void sleepInShell() throws IOException {
    }

    protected void hideInShell() throws NumberFormatException {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

public class GalapagosTortoise extends Reptile {

    @Override public void sleepInShell() throws FileNotFoundException {
    }

    @Override public void hideInShell() throws IllegalArgumentException {
    }

    @Override public void exitShell() throws IOException {} // DOES NOT COMPILE
}
