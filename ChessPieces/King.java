package ChessPieces;

import PermanentCharacteristics.*;

public class King extends ChessPiece {
    private boolean firstMove;

    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     * @param firstMove
     */
    public King(Color color, int xPosition, int yPosition, boolean firstMove) {
        super(PieceType.KING, color, false, xPosition, yPosition);
        this.firstMove = firstMove;
    }

    public boolean validDirection(int xPosition, int yPosition) {
        throw new RuntimeException();
    }

    public boolean validMove(int xPosition, int yPosition) {
        throw new RuntimeException();
    }
}
