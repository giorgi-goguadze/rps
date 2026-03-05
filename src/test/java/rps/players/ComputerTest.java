package rps.players;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rps.Move;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Computer Player Tests")
class ComputerTest {

    private Computer computer;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        computer = new Computer();
    }

    @Test
    @DisplayName("Should return a valid move")
    void testMakeMoveReturnsValidMove() {
        Move move = computer.makeMove();
        assertNotNull(move);
        assertTrue(move == Move.ROCK || move == Move.PAPER || move == Move.SCISSORS);
    }

    @Test
    @DisplayName("Should generate varied moves over multiple calls")
    void testMakeMoveVariety() {
        boolean hasRock = false;
        boolean hasPaper = false;
        boolean hasScissors = false;

        for (int i = 0; i < 100; i++) {
            Move move = computer.makeMove();
            if (move == Move.ROCK) hasRock = true;
            if (move == Move.PAPER) hasPaper = true;
            if (move == Move.SCISSORS) hasScissors = true;
        }

        assertTrue(hasRock, "Computer should play ROCK at least once in 100 moves");
        assertTrue(hasPaper, "Computer should play PAPER at least once in 100 moves");
        assertTrue(hasScissors, "Computer should play SCISSORS at least once in 100 moves");
    }


}

