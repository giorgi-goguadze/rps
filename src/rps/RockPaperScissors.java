package rps;

import rps.players.AutoPaper;
import rps.players.Computer;

import java.util.logging.Logger;

public class RockPaperScissors {
    private static final Logger logger = Logger.getLogger(RockPaperScissors.class.getName());

    public static void main(String[] args) {
        Player playerA = new AutoPaper();
        Player playerB = new Computer();
        Scoreboard results = new Scoreboard();

        for (int i = 0; i < 100; i++) {
            Move moveA = playerA.makeMove();
            Move moveB = playerB.makeMove();
            GameRules.Outcome outcome = GameRules.determineOutcome(moveA, moveB);
            results.recordOutcome(outcome);
        }
        String logMessage = String.format("""
                Results after 100 Rounds:
                -------------------------
                Player A (always Paper): %d wins
                Player B (Random):       %d wins
                Draws:                   %d
                """, results.winsA(), results.winsB(), results.draws());

        logger.info(() -> logMessage);
    }
}