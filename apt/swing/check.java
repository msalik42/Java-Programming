import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClientErrors extends JFrame {
    private JTextArea userText;
    private JTextPane chatWindow;
    private String userName = "testName";

    // Automatic resizing of the text box
    public static int numRows = 1;
    private static final int rowHeight = 20;
    private final int maxHeight = 80;
    private Document doc;

    public static void main(String[] args) {
        ClientErrors george = new ClientErrors();
        george.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ClientErrors() {
        super("Client instant messaging platform");

        // Chat window initialisation
        chatWindow = new JTextPane();
        chatWindow.setEditable(false);
        doc = chatWindow.getDocument();
        add(new JScrollPane(chatWindow), BorderLayout.CENTER);

        // Text box initialisation
        userText = new JTextArea();
        userText.setLineWrap(true);
        userText.setWrapStyleWord(true);

        // Allows u to send text from text box to chat window
        userText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '\n' && enterChecker(userText.getText())) {
                    // returns the text (-1 on the substring to remove the \n
                    // escape character when pressing enter)
                    showMessage("\n"
                            + userName
                            + ": "
                            + userText.getText().substring(0,
                                    userText.getText().length() - 1));
                    userText.setText("");
                }
            }
        });
        add(userText, BorderLayout.SOUTH);

        // JFrame properties
        setSize(300, 400);
        setVisible(true);
    }

    // shows message on the chat window
    private void showMessage(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    doc.insertString(doc.getLength(), text, null);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
                // place caret at the end (with no selection), so the newest
                // message can be automatically seen by the user
                chatWindow.setCaretPosition(chatWindow.getDocument()
                        .getLength());
            }
        });
    }

    // Prevents the user from sending empty messages that only contain
    // whitespace or \n
    private static boolean enterChecker(String t) {
        for (int i = 0; i < t.length(); i++)
            if (t.charAt(i) != '\n' && t.charAt(i) != ' ')
                return true;
        return false;
    }
}