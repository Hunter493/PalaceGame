import javax.swing.*;
import java.awt.*;

/**
 * Created by Tarsaril on 5/24/2016.
 */
public class playerPanel extends JPanel {
    public playerPanel(Player p1){
        setLayout(new GridLayout(2, 3));
        add(new JLabel(p1.up[0].getImageFront()));
        add(new JLabel(p1.up[1].getImageFront()));
        add(new JLabel(p1.up[2].getImageFront()));
        add(new JLabel(p1.down[0].getImageBack()));
        add(new JLabel(p1.down[1].getImageBack()));
        add(new JLabel(p1.down[2].getImageBack()));
    }
}
