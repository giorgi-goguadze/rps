package rps.players;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rps.Move;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("AutoPaper Player Tests")
class AutoPaperTest {

    private AutoPaper autoPaper;

    @BeforeEach
    void setUp() {
        autoPaper = new AutoPaper();
    }

    @Test
    @DisplayName("Should always return Paper move")
    void testMakeMoveAlwaysPaper() {
        for (int i = 0; i < 100; i++) {
            Move move = autoPaper.makeMove();
            assertEquals(Move.PAPER, move, "AutoPaper should always return PAPER");
        }
    }

    @Test
    @DisplayName("Should never return other moves")
    void testMakeMoveNeverOtherMoves() {
        for (int i = 0; i < 100; i++) {
            Move move = autoPaper.makeMove();
            assertNotEquals(Move.ROCK, move, "AutoPaper should not return ROCK");
            assertNotEquals(Move.SCISSORS, move, "AutoPaper should not return SCISSORS");
        }
    }

}

