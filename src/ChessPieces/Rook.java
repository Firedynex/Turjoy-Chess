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
        } else if (validDirection(xPosition, yPosition) == true) {
            return true;
        }
        return true;
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

    public boolean blocked(ChessGame game, int movedXPosition, int movedYPosition) {
        if (movedXPosition != this.getXPosition() && movedXPosition > this.getXPosition()) {
            for (int row = this.getXPosition(); row < movedXPosition; row++) {
                try (!(game.getPieceAt(movedXPosition, movedYPosition) == null)) {
                    return false;
                } catch (IllegalArgumentException iae) {
                    System.out.print();
                }
            }
        }
    }
}
