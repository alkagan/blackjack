package blackjack;

import java.util.*;

public class Deck{
    private static ArrayList<Integer> DeckofCards;

    // Construct a deck of 52 cards
    Deck(){
        this.DeckofCards = new ArrayList<Integer>();
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= 13; j++){
                DeckofCards.add(i*j);
                // Card card = new Card(Value[i], Suit[i]);
            }
        }
    }

    // Shuffle the deck of cards
    public void Shuffle(){
        Collections.shuffle(DeckofCards);
    }

    // Draw top-most card from deck 
    public void Draw(){
        System.out.println(DeckofCards.get(0));
    }

    public String toString(String card){ // [Card x]){
        return "You drew a x.value x.suite";
    }

    public static void main(String[] args){
        Deck hello = new Deck();
        hello.Shuffle();
        hello.Draw();
        System.out.println(hello.DeckofCards);
    }
}