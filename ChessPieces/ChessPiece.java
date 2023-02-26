package ChessPieces;
import PermanentCharacteristics.*;

public abstract class ChessPiece {

    /**
     * {@code ChessPiece} 
     * Abstract class meant to represent all chess pieces.
     */
    private PieceType name;
    private Color color;
    private boolean canMove;
    private int xPosition;
    private int yPosition;

    /**
     * Initializes all of the instance variables for a chess piece.
     * @param name
     * @param color
     * @param canMove
     * @param xPosition
     * @param yPosition
     */
    public ChessPiece(PieceType name, Color color, boolean canMove, int xPosition, int yPosition) {
        this.name = name;
        this.color = color;
        this.canMove = canMove;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * Returns name variable.
     * @return String
     */
    public PieceType getName() {
        return this.name;
    }

    /**
     * Returns the color of the piece.
     * @return String
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Returns whether the piece can move or not variable.
     * @return boolean
     */
    public boolean getCanMove() {
        return this.canMove;
    }

    /**
     * Returns the xPosition of the piece.
     * @return int
     */
    public int getXPosition() {
        return this.xPosition;
    }

    /**
     * Returns the yPosition of the piece.
     * @return int
     */
    public int getYPosition() {
        return this.yPosition;
    }

    /**
     * Sets the name of the piece.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the color of the piece.
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Sets whether the piece can move or not.
     * @param canMove
     */
    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    /**
     * Sets the xPosition of the piece.
     * @param xPosition
     */
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }
    
    /**
     * Sets the yPosition of the piece.
     * @param yPosition
     */
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    /**
     * Checks if the move is valid or not.
     * @return boolean
     */
    public abstract boolean validMove(int xPosition, int yPosition);

    /**
     * Determines if the given coordinates constitute a valid move.
     * @param xPosition
     * @param yPosition
     * @return boolean
     */
    protected abstract boolean validDirection(int xPosition, int yPosition);
}
