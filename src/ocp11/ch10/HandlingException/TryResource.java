package ocp11.ch10.HandlingException;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryResource {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        TryResource tr = new TryResource();
        tr.readFile("");
        try (MyFileClass is = new MyFileClass(1) , // DOES NOT COMPILE
                         os = new MyFileClass(2)) {
        }
        try (MyFileClass ab = new MyFileClass(1) , // DOES NOT COMPILE
             MyFileClass cd = new MyFileClass(2)) {
        }
        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) {
            // Process file
        }
    }
    
    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readFile2(String file) {
        try (var is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void multipleRescources() throws FileNotFoundException, IOException {
        try (FileInputStream in = new FileInputStream("data.txt");
                FileOutputStream out = new FileOutputStream("output.txt");) {
            // Protected code
        }
    }

    public void multipleRescources2() {
        try (FileInputStream in = new FileInputStream("data.txt");
                FileOutputStream out = new FileOutputStream("output.txt");) {
            // Protected code
        } catch (IOException e) {
            // Exception handler
        } finally {
            // finally block
        }
    }
    
    public void scope(){
        try (Scanner s = new Scanner(System.in)) {
        s.nextLine();
        } catch(Exception e) {
        s.nextInt(); // DOES NOT COMPILE
        } finally {
        s.nextInt(); // DOES NOT COMPILE
        }
    }
}
