package ChessPieces;


import PermanentCharacteristics.*;

public class Rook extends ChessPiece {
    
    private boolean firstMove;
    /**
     * Initializes all instance variables.
     * @param color
     * @param xPosition
     * @param yPosition
     */
    public Rook (Color color, int xPosition, int yPosition, boolean firstMove) {
        super (PieceType.ROOK, color, false, xPosition, yPosition);
        this.firstMove = firstMove;
    }

    /**
     * Checks to see if the inputted move is valid or not.
     * @param xPosition
     * @param yPosition
     * @return boolean
     */
    public boolean validMove(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }

    /**
     * Checks to see if the inputted move is in a valid direction or not.
     * @param xPosition
     * @param yPosition
     * @return boolean
     */
    protected boolean validDirection(int xPosition, int yPosition) {
        throw new UnsupportedOperationException("Yet to be implemented.");
    }
}
