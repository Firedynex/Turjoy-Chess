package ChessPieces;

import PermanentCharacteristics.*;

public class Bishop extends ChessPiece{
    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Bishop(Color color, int xPosition, int yPosition) {
        super(PieceType.BISHOP, color, false, xPosition, yPosition);
    }

    public boolean validDirection(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }

    public boolean validMove(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }
}
