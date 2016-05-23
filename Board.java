import java.util.*;
/**
 * Created by Tarsaril on 5/22/2016.
 */
public class Board {
    private List<Card> cards;
    private Deck deck;

    public Board(int n){
        this.cards = new ArrayList<>();
        this.deck = new Deck();
    }

    public void newGame(){
        this.deck.shuffle();
    }

    public int size(){
        return this.cards.size();
    }

    public boolean isEmpty(){
        return (this.cards.size() == 0);
    }
}
