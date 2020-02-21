package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChessMatch chess = new ChessMatch();
		UI.printBoard(chess.getPieces());
	}
}