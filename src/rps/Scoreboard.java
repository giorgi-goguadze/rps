package rps;

public class Scoreboard {
    private int winsA;
    private int winsB;
    private int draws;

    public void recordOutcome(GameRules.Outcome outcome) {
        switch (outcome) {
            case WIN -> winsA++;
            case LOSE -> winsB++;
            case DRAW -> draws++;
        }
    }

    public int winsA() {
        return winsA;
    }

    public int winsB() {
        return winsB;
    }

    public int draws() {
        return draws;
    }
}
