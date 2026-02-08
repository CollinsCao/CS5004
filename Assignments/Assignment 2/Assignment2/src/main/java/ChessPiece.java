public abstract class ChessPiece implements ChessPieceContract {

    protected int row;
    protected int column;
    protected Color color;

    public ChessPiece(int row, int column, Color color) {
        if (row < 0 || row > 7 || column < 0 || column > 7) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.row = row;
        this.column = column;
        this.color = color;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        if (piece == null) {
            return false;
        }
        if (piece.getColor() == this.color) {
            return false;
        }
        return canMove(piece.getRow(), piece.getColumn());
    }
}

