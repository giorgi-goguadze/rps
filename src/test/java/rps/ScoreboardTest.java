package rps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Scoreboard Tests")
class ScoreboardTest {

    private Scoreboard scoreboard;

    @BeforeEach
    void setUp() {
        scoreboard = new Scoreboard();
    }

    @Test
    @DisplayName("Initial scores should be zero")
    void testInitialScores() {
        assertEquals(0, scoreboard.winsA());
        assertEquals(0, scoreboard.winsB());
        assertEquals(0, scoreboard.draws());
    }

    @Test
    @DisplayName("Should increment winsA on WIN outcome")
    void testRecordWin() {
        scoreboard.recordOutcome(GameRules.Outcome.WIN);
        assertEquals(1, scoreboard.winsA());
        assertEquals(0, scoreboard.winsB());
        assertEquals(0, scoreboard.draws());
    }

    @Test
    @DisplayName("Should increment winsB on LOSE outcome")
    void testRecordLose() {
        scoreboard.recordOutcome(GameRules.Outcome.LOSE);
        assertEquals(0, scoreboard.winsA());
        assertEquals(1, scoreboard.winsB());
        assertEquals(0, scoreboard.draws());
    }

    @Test
    @DisplayName("Should increment draws on DRAW outcome")
    void testRecordDraw() {
        scoreboard.recordOutcome(GameRules.Outcome.DRAW);
        assertEquals(0, scoreboard.winsA());
        assertEquals(0, scoreboard.winsB());
        assertEquals(1, scoreboard.draws());
    }

    @Test
    @DisplayName("Should correctly track multiple outcomes")
    void testMultipleOutcomes() {
        scoreboard.recordOutcome(GameRules.Outcome.WIN);
        scoreboard.recordOutcome(GameRules.Outcome.WIN);
        scoreboard.recordOutcome(GameRules.Outcome.LOSE);
        scoreboard.recordOutcome(GameRules.Outcome.DRAW);
        scoreboard.recordOutcome(GameRules.Outcome.LOSE);

        assertEquals(2, scoreboard.winsA());
        assertEquals(2, scoreboard.winsB());
        assertEquals(1, scoreboard.draws());
    }

    @Test
    @DisplayName("Total scores should always equal recorded outcomes")
    void testTotalScoresConsistency() {
        scoreboard.recordOutcome(GameRules.Outcome.WIN);
        scoreboard.recordOutcome(GameRules.Outcome.LOSE);
        scoreboard.recordOutcome(GameRules.Outcome.DRAW);

        int total = scoreboard.winsA() + scoreboard.winsB() + scoreboard.draws();
        assertEquals(3, total);
    }
}

