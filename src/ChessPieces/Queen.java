package ChessPieces;

import PermanentCharacteristics.*;

public class Queen extends ChessPiece {
    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Queen(Color color, int xPosition, int yPosition) {
        super(PieceType.QUEEN, color, false, xPosition, yPosition);
    }

    public boolean validDirection(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }

    public boolean validMove(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }
}
