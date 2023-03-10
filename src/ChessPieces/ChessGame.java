package ChessPieces;

import PermanentCharacteristics.*;

public class ChessGame {
    private ChessPiece[][] gameBoard;
    
    /**
     * Initializes gameBoard instance variable.
     */
    public ChessGame() {
        gameBoard = new ChessPiece[8][8];
    } // ChessGame

    /**
     * Method that sets up the board at the start of the game.
     */
    public void setBoard() {
        setPawns();
        setRooks();
        setKnights();
        setBishops();
        setQueens();
        setKings();
    } // setBoard

    /**
     * Method that prints out the game board.
     */
    public void printBoard() {
        //This loop prints out all the pieces for the game.
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                if (gameBoard[row][col] != null) {
                    System.out.print(gameBoard[row][col].getName() + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        
    } // printBoard

    /**
     * Method that sets up the pawns for the game.
     */
    private void setPawns() {
        //This loop sets places all the pawns for the game.
        for (int col = 0; col < gameBoard[1].length; col++) {
            gameBoard[1][col] = new Pawn(Color.BLACK, 1, col, true);
            gameBoard[6][col] = new Pawn(Color.WHITE, 6, col, true);
        }
    } //setPawns

    /**
     * Method that sets up the rooks for the game.
     */
     private void setRooks() {
        //This sets up all the rooks for the game.
        for (int col = 0; col < gameBoard.length; col++) {
            if (col == 0 || col == 7) {
                gameBoard[0][col] = new Rook(Color.BLACK, 0, col, true);
                gameBoard[7][col] = new Rook(Color.WHITE, 7, col, true);
            }
        }
     } //setRooks
    
     /**
      * Method that sets up the knights for the game.
      */
     private void setKnights() {
        //This sets up all the knights for the game.
        for (int col = 0; col < gameBoard.length; col++) {
            if (col == 1 || col == 6) {
                gameBoard[0][col] = new Knight(Color.BLACK, 0, col);
                gameBoard[7][col] = new Knight(Color.WHITE, 7, col);
            }
        }
     } //setKnights

     /**
      * Method that sets up all the bishops for the game.
      */
     private void setBishops() {
        //This sets up all the bishops for the game.
        for (int col = 0; col < gameBoard.length; col++) {
            if (col == 2 || col == 5) {
                gameBoard[0][col] = new Bishop(Color.BLACK, 0, col);
                gameBoard[7][col] = new Bishop(Color.WHITE, 7, col);
            }
        }
     } //setBishops

     /**
      * Method that sets up all the queens for the game.
      */
     private void setQueens() {
        //This sets up all the queens for the game.
        gameBoard[0][3] = new Queen(Color.BLACK, 0, 3);
        gameBoard[7][3] = new Queen(Color.WHITE, 7, 3);
     } //setQueens

     /**
      * Method that sets up all the kings for the game.
      */
      private void setKings() {
        //This sets up all the kings for the game.
        gameBoard[0][4] = new King(Color.BLACK, 0, 4, true);
        gameBoard[7][4] = new King(Color.WHITE, 7, 4, true);
      } //setKings

      /**
       * Returns the chess piece located at position xPosition, yPosition.
       * @param xPosition
       * @param yPosition
       * @return
       */
      public PieceType getPieceAt(int xPosition, int yPosition) {
        if (gameBoard[xPosition][yPosition] == null) {
            throw new IllegalArgumentException("There isn't a piece at the given coordinates.");
        }
        return gameBoard[xPosition][yPosition].getName();
      }

}
