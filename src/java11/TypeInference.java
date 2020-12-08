package java11;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TypeInference {

    Socket socket;

    public TypeInference() throws IOException {
        this.socket = new Socket("localhost", 8080);
    }

    public static void main(String[] args) throws IOException {
        var outputStream = new ByteArrayOutputStream();//ByteArrayOutputStream
    }

    public String readLine() {
        try (var is = socket.getInputStream()) { //InputStream
            var isr = new InputStreamReader(is, "hi");//InputStreamReader
            var buf = new BufferedReader(isr);//BufferedReader
            return buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
