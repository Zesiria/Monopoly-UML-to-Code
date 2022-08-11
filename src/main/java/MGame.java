import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private Player[] players;
    private Board board;

    public MGame(Player[] players) {
        this.roundCount = 0;
        this.players = players;
    }

    public void playGame(int N){
        while(roundCount < N){
            playRound();
            roundCount++;
        }
    }

    private void playRound(){
        for (Player player: players) {
            player.takeTurn();
        }
    }

    public Board getBoard() {
        return board;
    }
}
