public class Player {
    private String name;

    private Piece piece;
    private Board board;
    private Die dice[];

    public Player(String name, Piece piece, Board board, Die[] dice) {
        this.name = name;
        this.piece = piece;
        this.board = board;
        this.dice = dice;
        this.piece.setLocation(board.getFirstSquare());
    }

    public void takeTurn(){
        int fv = 0;
        for (int i = 0;i < 2;i++) {
            dice[i].roll();
            fv += dice[i].getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fv);
        piece.setLocation(newLoc);
    }
}
