import javax.swing.*;
import java.awt.*;

/**
 * Created by Tarsaril on 5/22/2016.
 */
public class GameGUI extends JFrame {
    public static Board board = new Board();
    NPC n1 = new NPC();
    NPC n2 = new NPC();
    NPC n3 = new NPC();
    Player p1 = new Player();
    JPanel main = new JPanel(new GridLayout(3,3));
    JPanel deck = new JPanel(new GridLayout(1, 2));
    JPanel handButton = new JPanel(new GridLayout(7, 7));
    JPanel npc1 = new NPCPanel(n1);
    JPanel npc2 = new NPCPanel(n2);
    JPanel npc3 = new NPCPanel(n3);
    JPanel player = new playerPanel(p1);

    public GameGUI () {
        this.setContentPane(main);
        this.setTitle("Palace");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.add(new JLabel(""));
        main.add(npc1);
        main.add(new JLabel(""));
        main.add(npc2);
        main.add(deck);
        if (board.getDeck().isEmpty()){
            deck.add(new JLabel(""));
        }
        else {
            deck.add(new JLabel(Card.getImageBack()));
        }
        if (board.isPlayedEmpty()){
            deck.add(new JLabel(""));
        }
        else {
            deck.add(new JLabel(board.getLastPlayedCard().getImageFront()));
        }
        main.add(npc3);
        main.add(handButton);
        handButton.add(new JLabel(""));
        handButton.add(new JLabel(""));
        handButton.add(new JLabel(""));
        handButton.add(new JButton("HAND"));
        main.add(player);
        main.add(new JLabel(""));
        pack();
        setVisible(true);
    }
}