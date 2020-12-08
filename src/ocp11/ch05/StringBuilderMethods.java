package ocp11.ch05;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("animals");

        //charAt(), indexOf(), length(), and substring()
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        //append()
        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        //insert()
        sb = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-
        System.out.println(sb);

        //delete() and deleteCharAt()
        sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        //sb.deleteCharAt(5); // throws an exception

        //replace()
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty
        builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder);//pig
        
        //reverse()
        sb = new StringBuilder("ABC");
        sb.reverse();//CBA
        System.out.println(sb);

        //toString()
        String s = sb.toString();
    }
}
