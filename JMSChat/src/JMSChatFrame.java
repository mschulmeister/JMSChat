package JMSChat;

import javax.swing.*;
import java.awt.*;

/**
 * Diese Klasse erzeugt das Fenster und fuehrt dies in der main-Methode aus.
 * 
 * @author Markus Schulmeister
 * @date 2013-04-12
 *
 */
public class JMSChatFrame extends JFrame {

    /**
     * Der Konstruktor erzeugt das Fenster und legt bestimmte Eigenschaften dafür fest.
     */
    
    public JMSChatFrame() {
        Container c = getContentPane();
        c.add (new GUIPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (500, 700); // Größe des Fensters
        setVisible (true);  // setzt ob man das Fenster sieht
        setTitle ("JMS Chat");    // der Titel für das Fenster wird gesetzt
    }
    
    /**
     * In der Testmethode wird das Programm getestet.
     * @param args
     */
    
    public static void main(String args[]) {
        new JMSChatFrame();
    }
}
        