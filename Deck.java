import java.util.*;

public class Deck{
    private ArrayList<Integer> DeckofCards;

    // Construct a deck of 52 cards
    Deck(){
        DeckofCards = ArrayList<Integer>();
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= 13; j++){
                DeckofCards.add(i*j);
            }
        }
    }

    // Shuffle the deck of cards
    public void Shuffle(){
        System.out.println("Hello World");
    }

    // Draw from the deck of cards
    public static void Draw(){
        //return the top most card
        System.out.println("Hello World");
    }

    // 
    public String toString(String card){ // [Card x]){
        return "You drew a x.value x.suite";
    }
    public static void main(String [] args){
        Deck hello = new Deck();
        hello.Shuffle();
        hello.Draw();
    }
}