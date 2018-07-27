public class Card{
    private enum Value {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE,
    }

    private enum Suit {
        DIAMONDS,
        CLUBS,
        HEARTS,
        SPADES,
    }

    int val, kind;
    Value test1;
    Suit test2;

    // Constructor
    public Card(Value test1, Suit test2){
        this.test1 = test1;
        this.test2 = test2;
    }
}