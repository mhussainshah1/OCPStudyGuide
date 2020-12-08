package ocp8.ch01.accessModifier.cat.species;

import ocp8.ch01.accessModifier.cat.BigCat;

class Lynx extends BigCat {

    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);

        Lynx wildCat = new Lynx();
        System.out.println(wildCat.hasFur);

    }

    void check() {
        System.out.println(hasFur);
    }
}
