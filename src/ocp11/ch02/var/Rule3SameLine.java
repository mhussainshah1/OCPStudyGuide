/*
 * 3. A var is always initialized on the same line (or statement) where it is declared.
 */
package ocp11.ch02.var;

public class Rule3SameLine {

    public void doesThisCompile(boolean check) {
        var question;
        question = 1;
        var answer;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }

    public void breakingDeclaration() {
        var silly
                = 1;
    }
}
