package ocp8.ch01.accessModifier.cat;

public class BigCat {

    public static void main(String[] args) {
        System.out.println(args.length);
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);
    }

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true; //default
    private int id;

}
