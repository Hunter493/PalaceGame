/**
 * Created by Tarsaril on 5/22/2016.
 */
public enum Ranks {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    public final int num;

    Ranks (int iNum){
        num = iNum;
    }
}
