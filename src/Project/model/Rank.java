package Project.model;

public enum Rank {

    NONE(0),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    JACK(10),
    QUEEN(11),
    KING(12),
    ACE(13);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getValue() {
        return rank;
    }
}
