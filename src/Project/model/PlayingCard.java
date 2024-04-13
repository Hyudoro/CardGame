package Project.model;

public class PlayingCard {
    private final Rank rank;
    private final Suit suit;
    private boolean faceUp;



    public PlayingCard(Rank rank,Suit suit){
        super();
        this.rank = rank;
        this.suit = suit;
    }



    public boolean isFaceUp(){
        return faceUp;
    }

    public boolean flip(){
        faceUp = !faceUp;
        return faceUp;
    }

    public Rank getRank(){
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }


}
