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
        if (validDirection(xPosition, yPosition) == false) {
            return false;
        } else if (validDirection(xPosition, yPosition) && )
    }

    /**
     * Checks to see if the inputted move is in a valid direction or not.
     * @param xPosition
     * @param yPosition
     * @return boolean
     */
    protected boolean validDirection(int movedXPosition, int movedYPosition) {
        if (this.getXPosition() != movedXPosition && this.getYPosition() != movedYPosition) {
            return false;
        } else {
            return true;
        }
    }

    public boolean blocked(ChessGame game) {
        
    }
}
