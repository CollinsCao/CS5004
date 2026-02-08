public class King extends ChessPiece {

    public King(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        int rowDiff = Math.abs(row - this.row);
        int colDiff = Math.abs(col - this.column);

        return (rowDiff <= 1 && colDiff <= 1) &&
                !(rowDiff == 0 && colDiff == 0);
    }
}
