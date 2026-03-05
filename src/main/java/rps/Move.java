package rps;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Move {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private final String name;


    private static final Random random = new Random();
    private static final Move[] VALUES = values();


    private static final Map<String, Move> BY_NAME =
            Arrays.stream(values()).collect(Collectors.toUnmodifiableMap(
                    m -> m.getName().toLowerCase(Locale.ROOT),
                    Function.identity()
            ));

    Move(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

   public static Move randomMove() {
        int index = random.nextInt(VALUES.length);
        return VALUES[index];
    }

    public static Move byName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Move name cannot be null");
        }
        Move move = BY_NAME.get(name.toLowerCase());
        if (move == null) {
            throw new IllegalArgumentException("Unknown move: " + name);
        }
        return move;
    }
}