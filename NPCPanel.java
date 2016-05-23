import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarsaril on 5/22/2016.
 */
public class NPCPanel extends JPanel {
    public NPCPanel(NPC npc){
        setLayout(new GridLayout(2, 4));
        add(new JLabel(npc.hand.get(0).getImageBack()));
        add(new JLabel(npc.up[0].getImageFront()));
        add(new JLabel(npc.up[1].getImageFront()));
        add(new JLabel(npc.up[2].getImageFront()));
        add(new JLabel(""));
        add(new JLabel(npc.down[0].getImageBack()));
        add(new JLabel(npc.down[1].getImageBack()));
        add(new JLabel(npc.down[2].getImageBack()));
    }
}
