package rps;

import java.util.EnumMap;
import java.util.Map;

public class GameRules {

    private GameRules() {}


    private static final Map<Move, Map<Move, Outcome>> RULES = new EnumMap<>(Move.class);

    static {
        // Define rules for each move
        RULES.put(Move.ROCK, Map.of(
                Move.ROCK, Outcome.DRAW,
                Move.PAPER, Outcome.LOSE,
                Move.SCISSORS, Outcome.WIN
        ));
        RULES.put(Move.PAPER, Map.of(
                Move.PAPER, Outcome.DRAW,
                Move.SCISSORS, Outcome.LOSE,
                Move.ROCK, Outcome.WIN
        ));
        RULES.put(Move.SCISSORS, Map.of(
                Move.SCISSORS, Outcome.DRAW,
                Move.ROCK, Outcome.LOSE,
                Move.PAPER, Outcome.WIN
        ));
    }

    public static Outcome determineOutcome(Move move1, Move move2) {
        return RULES.get(move1).get(move2);
    }

    public enum Outcome {
            WIN, LOSE, DRAW
    }
}