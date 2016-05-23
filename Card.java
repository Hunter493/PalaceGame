import javax.swing.*;
import java.net.URL;

/**
 * Created by Tarsaril on 5/21/2016.
 */
public class Card {
    private Suits suit;
    private Ranks rank;
    private final ImageIcon imageFront;
    private static final ImageIcon imageBack = new ImageIcon(Card.class.getResource("Back.gif"));

    public Card(Suits suit, Ranks rank){
        this.suit = suit;
        this.rank = rank;
        String name = rank.num + suit.code + ".gif";
        URL url = Card.class.getResource(name);
        imageFront = new ImageIcon(url);
    }

    public Suits getSuit(){
        return suit;
    }

    public Ranks getRank(){
        return rank;
    }

    public ImageIcon getImageFront () {
        return imageFront;
    }

    public ImageIcon getImageBack () {
        return imageBack;
    }

    public boolean matchesRank(Card card){
        return (card.getRank().equals(this.getRank()));
    }
}
