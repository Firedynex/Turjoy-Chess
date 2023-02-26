package ChessPieces;

import PermanentCharacteristics.*;

public class Pawn extends ChessPiece{
    
    private boolean firstMove;

    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     * @param firstMove
     */
    public Pawn(Color color, int xPosition, int yPosition, boolean firstMove) {
        super(PieceType.PAWN, color, true, xPosition, yPosition);
        this.firstMove = firstMove;
    }

}
