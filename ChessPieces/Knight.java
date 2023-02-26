package ChessPieces;

import PermanentCharacteristics.*;

public class Knight extends ChessPiece {
    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Knight(Color color, int xPosition, int yPosition) {
        super(PieceType.KNIGHT, color, true, xPosition, yPosition);
    }

    public boolean validDirection(int xPosition, int yPosition) {
        throw new RuntimeException();
    }

    public boolean validMove(int xPosition, int yPosition) {
        throw new RuntimeException();
    }
}
