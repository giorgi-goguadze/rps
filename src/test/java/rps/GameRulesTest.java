package rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("GameRules Tests")
class GameRulesTest {

    @Test
    @DisplayName("Rock beats Scissors")
    void testRockBeatsScissors() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.ROCK, Move.SCISSORS);
        assertEquals(GameRules.Outcome.WIN, outcome);
    }

    @Test
    @DisplayName("Rock loses to Paper")
    void testRockLosesToPaper() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.ROCK, Move.PAPER);
        assertEquals(GameRules.Outcome.LOSE, outcome);
    }

    @Test
    @DisplayName("Rock draws with Rock")
    void testRockDrawsWithRock() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.ROCK, Move.ROCK);
        assertEquals(GameRules.Outcome.DRAW, outcome);
    }

    @Test
    @DisplayName("Paper beats Rock")
    void testPaperBeatsRock() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.PAPER, Move.ROCK);
        assertEquals(GameRules.Outcome.WIN, outcome);
    }

    @Test
    @DisplayName("Paper loses to Scissors")
    void testPaperLosesToScissors() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.PAPER, Move.SCISSORS);
        assertEquals(GameRules.Outcome.LOSE, outcome);
    }

    @Test
    @DisplayName("Paper draws with Paper")
    void testPaperDrawsWithPaper() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.PAPER, Move.PAPER);
        assertEquals(GameRules.Outcome.DRAW, outcome);
    }

    @Test
    @DisplayName("Scissors beats Paper")
    void testScissorsbeatsPaper() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.SCISSORS, Move.PAPER);
        assertEquals(GameRules.Outcome.WIN, outcome);
    }

    @Test
    @DisplayName("Scissors loses to Rock")
    void testScissorsLosesToRock() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.SCISSORS, Move.ROCK);
        assertEquals(GameRules.Outcome.LOSE, outcome);
    }

    @Test
    @DisplayName("Scissors draws with Scissors")
    void testScissorsDrawsWithScissors() {
        GameRules.Outcome outcome = GameRules.determineOutcome(Move.SCISSORS, Move.SCISSORS);
        assertEquals(GameRules.Outcome.DRAW, outcome);
    }

    @Test
    @DisplayName("All moves have defined outcomes")
    void testAllMoveCombinationsDefined() {
        for (Move moveA : Move.values()) {
            for (Move moveB : Move.values()) {
                GameRules.Outcome outcome = GameRules.determineOutcome(moveA, moveB);
                assertNotNull(outcome, "Outcome should be defined for " + moveA + " vs " + moveB);
            }
        }
    }
}

