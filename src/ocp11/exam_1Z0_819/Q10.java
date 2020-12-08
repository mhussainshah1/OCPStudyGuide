package ocp11.exam_1Z0_819;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args)  {
        try(FileInputStream in = new FileInputStream("foo.txt")){
            
        } catch (FileNotFoundException | Exception e){
            
        }
    }
}
