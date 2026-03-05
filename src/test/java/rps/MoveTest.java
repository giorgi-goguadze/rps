package rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Move Enum Tests")
class MoveTest {

    @Test
    @DisplayName("Should parse move from lowercase name")
    void testByNameLowercase() {
        assertEquals(Move.ROCK, Move.byName("rock"));
        assertEquals(Move.PAPER, Move.byName("paper"));
        assertEquals(Move.SCISSORS, Move.byName("scissors"));
    }

    @Test
    @DisplayName("Should parse move from uppercase name")
    void testByNameUppercase() {
        assertEquals(Move.ROCK, Move.byName("ROCK"));
        assertEquals(Move.PAPER, Move.byName("PAPER"));
        assertEquals(Move.SCISSORS, Move.byName("SCISSORS"));
    }

    @Test
    @DisplayName("Should parse move from mixed case name")
    void testByNameMixedCase() {
        assertEquals(Move.ROCK, Move.byName("RoCk"));
        assertEquals(Move.PAPER, Move.byName("PaPeR"));
        assertEquals(Move.SCISSORS, Move.byName("ScIsSOrs"));
    }

    @Test
    @DisplayName("Should throw exception for unknown move name")
    void testByNameUnknown() {
        assertThrows(IllegalArgumentException.class, () -> Move.byName("stone"));
        assertThrows(IllegalArgumentException.class, () -> Move.byName("invalid"));
        assertThrows(IllegalArgumentException.class, () -> Move.byName(""));
    }

    @Test
    @DisplayName("Should throw exception for null move name")
    void testByNameNull() {
        assertThrows(IllegalArgumentException.class, () -> Move.byName(null));
    }

    @Test
    @DisplayName("Should return a valid move from randomMove()")
    void testRandomMoveValid() {
        Move randomMove = Move.randomMove();
        assertNotNull(randomMove);
        assertTrue(randomMove == Move.ROCK || randomMove == Move.PAPER || randomMove == Move.SCISSORS);
    }


}

