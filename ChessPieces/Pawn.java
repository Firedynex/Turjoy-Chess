package ChessPieces;

import PermanentCharacteristics.Color;
import PermanentCharacteristics.PieceType;

public class Pawn extends ChessPiece{
    
    private boolean firstMove;
    public Pawn(Color color, int xPosition, int yPosition, boolean firstMove) {
        super(PieceType.PAWN, color, true, xPosition, yPosition);
        this.firstMove = firstMove;
    }

}
