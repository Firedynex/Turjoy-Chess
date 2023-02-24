package ChessPieces;

import PermanentCharacteristics.PieceType;
import PermanentCharacteristics.Color;
public class Rook extends ChessPiece {
    
    /**
     * Initializes the instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Rook (Color color, int xPosition, int yPosition) {
        super (PieceType.ROOK, color, false, xPosition, yPosition);
    }

    
}
