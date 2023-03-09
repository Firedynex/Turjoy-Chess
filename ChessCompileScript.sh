#!/usr/bin/bash -ex
javac -d bin src/PermanentCharacteristics/Color.java
javac -d bin src/PermanentCharacteristics/PieceType.java
javac -d bin -cp bin src/ChessPieces/ChessPiece.java
javac -d bin -cp bin src/ChessPieces/King.java
javac -d bin -cp bin src/ChessPieces/Queen.java
javac -d bin -cp bin src/ChessPieces/Bishop.java
javac -d bin -cp bin src/ChessPieces/Knight.java
javac -d bin -cp bin src/ChessPieces/Rook.java
javac -d bin -cp bin src/ChessPieces/Pawn.java
javac -d bin -cp bin src/ChessGame.java
javac -d bin -cp bin src/ChessDriver.java
