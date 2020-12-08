package ocp11.ch07.review;

//4. Which of the following compile? (Choose all that apply)
public class Four{
    public void moreA(int... nums) {}
    public void moreB(String values, int... nums) {}
    public void moreC(int... nums, String values) {}
    public void moreD(String... values, int... nums) {}
    public void moreE(String[] values, ...int nums) {}
    public void moreF(String... values, int[] nums) {}
    public void moreG(String[] values, int[] nums) {}
}
