
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class BufferedSocketServer {

    public static void main(String args[]) throws Exception {

        int cTosPortNumber = 1777;
        String str;
        ServerSocket servSocket = new ServerSocket(cTosPortNumber);
        while (true) {
            System.out.println("Waiting for a connection on " + cTosPortNumber);

            Socket fromClientSocket = servSocket.accept();
            PrintWriter pw = new PrintWriter(fromClientSocket.getOutputStream(), true);

            BufferedReader br = new BufferedReader(new InputStreamReader(fromClientSocket.getInputStream()));
            //File f = new File("abc.txt");
            while ((str = br.readLine()) != null) {
                System.out.println("The message: " + str);
                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("hack.txt",true), "utf-8"))) {
                    writer.write(str);
                }
                if (str.equals("bye")) {
                    pw.println("bye");

                    break;
                } else {
                    str = "Server returns " + str;
                    pw.println(str);
                }
            }

            fromClientSocket.close();
            br.close();
            pw.close();

        }
    }

}
