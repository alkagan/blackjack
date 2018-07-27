package blackjack;

public class Card{
    public enum Value {
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

    public enum Suit {
        DIAMONDS,
        CLUBS,
        HEARTS,
        SPADES,
    }

    // Is this declaration necessary?
    Value card_val;
    Suit card_suit;
    
    // Constructor
    public Card(Value card_val, Suit card_suit){
        this.card_val = card_val;
        this.card_suit = card_suit;
    }

    public Value getValue(){
        return this.card_val;
    }

    public Suit getSuit(){
        return this.card_suit;
    }

    public toString(){
        return ("Card value: " + this.card_val + "\nCard suit: " + this.card_suit);
    }
}