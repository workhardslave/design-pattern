package strategy;

public enum Hand {
    ROCK(0), SCISSORS(1), PAPER(2);

    private final int index;

    Hand(int index) {
        this.index = index;
    }

    public static Hand getHand(int value) {
        return values()[value];
    }

    public Result fight(Hand other) {
        if (this.index == other.index) {
            return Result.DRAW;
        }

        if ( (this.index == 0 && other.index == 1) || (this.index == 1 && other.index == 2) || (this.index == 2 && other.index == 0) ) {
            return Result.WIN;
        }

        return Result.LOSE;
    }
}
