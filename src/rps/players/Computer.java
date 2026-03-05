package rps.players;

import rps.Move;
import rps.Player;

public class Computer implements Player {

    @Override
    public Move makeMove() {
        return Move.randomMove();
    }

}
