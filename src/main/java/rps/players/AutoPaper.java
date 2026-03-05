package rps.players;

import rps.Move;
import rps.Player;

public class AutoPaper implements Player {

    @Override
    public Move makeMove() {
        return Move.byName("paper");
    }
}
