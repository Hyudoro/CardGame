package Project.games;

import Project.model.IPlayer;

import java.util.List;

public interface GameEvaluator {
    IPlayer evaluateWinner(List<IPlayer> players);
}
