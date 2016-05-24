import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarsaril on 5/21/2016.
 */
public class NPC {

    Card[] up = new Card[3];
    Card[] down = new Card[3];
    List<Card> hand = new ArrayList<>();

    public NPC(){
        for (int i = 0; i < down.length; i++){
            down[i] = GameGUI.board.getDeck().deal();
            up[i] = GameGUI.board.getDeck().deal();
            hand.add(GameGUI.board.getDeck().deal());
        }
    }

    public void play(){
        
    }
}
