package ocp11.ch09.interfaces;

private final interface Crawl {
    String distance;
    private int MAXIMUM_DEPTH = 100;
    protected abstract boolean UNDERWATER = false;
    private void dig(int depth);
    protected abstract double depth();
    public final void surface(); 
}
