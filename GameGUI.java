import javax.swing.*;
import java.awt.*;

/**
 * Created by Tarsaril on 5/22/2016.
 */
public class GameGUI extends JFrame {
    Deck gameDeck = new Deck();
    NPC n1 = new NPC(gameDeck);
    NPC n2 = new NPC(gameDeck);
    NPC n3 = new NPC(gameDeck);
    JPanel main = new JPanel(new GridLayout(3,3));
    JPanel deck = new JPanel(new GridLayout(1, 2));
    JPanel npc1 = new NPCPanel(n1);
    JPanel npc2 = new NPCPanel(n2);
    JPanel npc3 = new NPCPanel(n3);
    JPanel player = new JPanel(new GridLayout());

    public GameGUI () {
        this.setContentPane(main);
        this.setTitle("Palace");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.add(new JLabel(""));
        main.add(npc1);
        main.add(new JLabel(""));
        main.add(npc2);
        main.add(deck);
        main.add(npc3);
        main.add(new JButton("HAND"));
        main.add(player);
        main.add(new JLabel(""));
        pack();
        setVisible(true);
    }
}
