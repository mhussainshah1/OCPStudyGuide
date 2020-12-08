package ocp11.ch05;

public class MyStringBuilder {

    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        StringBuilder bravo = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            bravo.append(current);
        }
        System.out.println(bravo);

        String st = new String("start");
        st.concat("+middle");
        String sam = st.concat("+end");//start+end
        System.out.println(sam);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);//b=abcdefg
        System.out.println("b=" + b);//b=abcdefg

        //Creating a StringBuilder
        StringBuilder sb1 = new StringBuilder();//Length =0, Capacity = 16
        StringBuilder sb2 = new StringBuilder("animals");//Length =7, Capacity = 23
        StringBuilder sb3 = new StringBuilder(10);//Length =0, Capacity 10

        StringBuilder sb4 = new StringBuilder(5);//Length =0, Capacity = 5
        sb4.append("anim");//Length =4, Capacity = 5
        sb4.append("als");//Length =7, Capacity = 7+5 =12
    }
}
