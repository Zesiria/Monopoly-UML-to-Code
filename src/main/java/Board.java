public class Board {
    private Square squares[];

    public Board() {
        this.squares = new Square[40];
    }

    public Square getSquare(Square square, int fv) {
        int i = 0;
        for(;i < 40;i++){
            if (square.equals(squares[i]))
                return squares[i+fv];
        }
        return null;
    }

    public Square getFirstSquare() {
        return squares[0];
    }
}
