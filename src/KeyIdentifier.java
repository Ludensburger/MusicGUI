import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyIdentifier extends JFrame {
    private JPanel jpanel;
    private JTextField tfKey;
    private JButton btnEnter;
    private JTextArea taOutput;
    private JComboBox cbKey;
    private JLabel pickAKeyLabel;
    private JLabel lnote;

    private static class Music {

    // Key of C Major
    static String[] KeyOfC = {"C", "D", "E", "F", "G", "A", "B"};

    // Key of G Major
    static String[] KeyOfG = {"G", "A", "B", "C", "D", "E", "F#"};

    // Key of D Major
    static String[] KeyOfD = {"D", "E", "F#", "G", "A", "B", "C#"};

    // Key of A Major
    static String[] KeyOfA = {"A", "B", "C#", "D", "E", "F#", "G#"};

    // Key of E Major
    static String[] KeyOfE = {"E", "F#", "G#", "A", "B", "C#", "D#"};

    // Key of B Major
    static String[] KeyOfB = {"B", "C#", "D#", "E", "F#", "G#", "A#"};

    // Key of F# (or Gb) Major
    static String[] KeyOfFSharp = {"F#", "G#", "A#", "B", "C#", "D#", "F"};

    // Key of Db (or C#) Major
    static String[] KeyOfDFlat = {"Db", "Eb", "F", "Gb", "Ab", "Bb", "C"};

    // Key of Ab Major
    static String[] KeyOfAb = {"Ab", "Bb", "C", "Db", "Eb", "F", "G"};

    // Key of Eb Major
    static String[] KeyOfEb = {"Eb", "F", "G", "Ab", "Bb", "C", "D"};

    // Key of Bb Major
    static String[] KeyOfBb = {"Bb", "C", "D", "Eb", "F", "G", "A"};

    // Key of F Major
    static String[] KeyOfF = {"F", "G", "A", "Bb", "C", "D", "E"};

}
    public KeyIdentifier() {
        taOutput.setBackground(Color.decode("#F5E8C7"));

        // OK button
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = tfKey.getText().toLowerCase();
                System.out.println("Input key: " + key);
                if(key.contains("#") || key.contains("b")) {
                        // half-steps
                        switch (key) {

                            case "c#":
                            case "C#":
                            case "db":
                            case "Db":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of C# or Db:\n");
                                for (int i = 0; i < Music.KeyOfC.length; i++) {
                                    taOutput.append(Music.KeyOfDFlat[i]);
                                    if(i < Music.KeyOfC.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                            break;

                            case "d#":
                            case "eb":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of D# or Eb:\n");
                                for (int i = 0; i < Music.KeyOfEb.length; i++) {
                                    taOutput.append(Music.KeyOfEb[i]);
                                    if (i < Music.KeyOfEb.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                            case "e":
                            case "fb":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of E or Fb:\n");
                                for (int i = 0; i < Music.KeyOfE.length; i++) {
                                    taOutput.append(Music.KeyOfE[i]);
                                    if (i < Music.KeyOfE.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                            case "f#":
                            case "gb":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of F# or Gb:\n");
                                for (int i = 0; i < Music.KeyOfFSharp.length; i++) {
                                    taOutput.append(Music.KeyOfFSharp[i]);
                                    if (i < Music.KeyOfFSharp.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                            case "g#":
                            case "ab":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of G# or Ab:\n");
                                for (int i = 0; i < Music.KeyOfAb.length; i++) {
                                    taOutput.append(Music.KeyOfAb[i]);
                                    if (i < Music.KeyOfAb.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                            case "a#":
                            case "bb":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of A# or Bb:\n");
                                for (int i = 0; i < Music.KeyOfBb.length; i++) {
                                    taOutput.append(Music.KeyOfBb[i]);
                                    if (i < Music.KeyOfBb.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                            case "b":
                            case "cb":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of B or Cb:\n");
                                for (int i = 0; i < Music.KeyOfB.length; i++) {
                                    taOutput.append(Music.KeyOfB[i]);
                                    if (i < Music.KeyOfB.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;
                        }

                    }
                        // whole steps
                else {
                        switch (key) {

                            case "c":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of C:\n");
                                for (int i = 0; i < Music.KeyOfC.length; i++) {

                                    taOutput.append(Music.KeyOfC[i]);
                                    if(i < Music.KeyOfC.length - 1) {
                                        taOutput.append(", ");
                                    }

                                }
                                break;

                            case "d":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of D:\n");
                                for (int i = 0; i < Music.KeyOfD.length; i++) {
                                    taOutput.append(Music.KeyOfD[i]);
                                    if(i < Music.KeyOfD.length - 1) {
                                        taOutput.append(", ");
                                    }

                                }
                                break;
                            case "e":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of E:\n");
                                for (int i = 0; i < Music.KeyOfE.length; i++) {
                                    taOutput.append(Music.KeyOfE[i]);
                                    if(i < Music.KeyOfE.length - 1) {
                                        taOutput.append(", ");
                                    }

                                }
                                break;

                            case "f":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of F:\n");
                                for (int i = 0; i < Music.KeyOfF.length; i++) {
                                    taOutput.append(Music.KeyOfF[i]);
                                    if(i < Music.KeyOfF.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;

                            case "g":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of G:\n");
                                for (int i = 0; i < Music.KeyOfG.length; i++) {
                                    taOutput.append(Music.KeyOfG[i]);
                                    if(i < Music.KeyOfG.length - 1) {
                                        taOutput.append(", ");
                                    }

                                }
                                break;

                            case "a":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of A:\n");
                                for (int i = 0; i < Music.KeyOfA.length; i++) {
                                    taOutput.append(Music.KeyOfA[i]);
                                    if(i < Music.KeyOfA.length - 1) {
                                        taOutput.append(", ");
                                    }

                                }
                                break;

                            case "b":
                                taOutput.setForeground(Color.black);
                                taOutput.setText("Key of B:\n");
                                for (int i = 0; i < Music.KeyOfB.length; i++) {
                                    taOutput.append(Music.KeyOfB[i]);
                                    if(i < Music.KeyOfB.length - 1) {
                                        taOutput.append(", ");
                                    }
                                }
                                break;

                            default:
                                System.out.println("Invalid Note/Key");
                                taOutput.setForeground(Color.red);
                                taOutput.setText("Invalid Note/Key");
                                tfKey.setText("");
                        }
                    }

            }
        });

        // Text-field
        tfKey.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    btnEnter.doClick();
                }
            }
        });

        // Combo Box
        // Selection will autofill the text-field
        cbKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = String.valueOf(cbKey.getSelectedItem()).toLowerCase();
                tfKey.setText((String)cbKey.getSelectedItem());
            }
        });

    }

    public static void main(String[] args) {

        KeyIdentifier app = new KeyIdentifier();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Music Key Identifier");
        app.setLocationRelativeTo(null);
        app.setVisible(true);

    }


}
