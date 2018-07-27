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

    Value card_val;
    Suit card_suit;
    
    // Constructor
    public Card(Value card_val, Suit card_suit){
        this.card_val = card_val;
        this.card_suit = card_suit;
    }

    public Value getValue(){
        return card_val;
    }

    public Suit getSuit(){
        return card_suit;
    }



    public toString(){
        return ("Card value: " + this.card_val + "\nCard suit: " + this.card_suit);
    }
}