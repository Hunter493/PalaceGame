import java.util.*;

/**
 * Created by Tarsaril on 5/21/2016.
 */
public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck(){
        for (Suits s : Suits.values()){
            for (Ranks r : Ranks.values()){
                Card c = new Card(s, r);
                cards.add(c);
            }
        }
        for (int i = 0; i < 100; i++) {
            shuffle();
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }

    public int getSize(){
        return cards.size();
    }

    public Card deal() {
        if (this.isEmpty()){
            return null;
        }
        Card card = this.cards.get(cards.size() - 1);
        cards.remove(card);
        return card;
    }
}
