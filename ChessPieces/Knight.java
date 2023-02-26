package ChessPieces;

import PermanentCharacteristics.*;

public class Knight extends ChessPiece.java {
    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Knight(Color color, int xPosition, int yPosition) {
        super(PieceType.KNIGHT, color, true, xPosition, yPosition);
    }
}
