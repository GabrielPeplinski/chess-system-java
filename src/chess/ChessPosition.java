package chess;

import boardgame.Position;

public class ChessPosition {

	private char row;
	private int column;
	
	public ChessPosition(char row, int column) {
		if ( row < 'a' || row > 'h' || column < 1 || column > 8) {
			throw new ChessException("Erro instancing ChessPosition. Valid values are from a1 to h8!");
		}
		this.row = row;
		this.column = column;
	}

	public char getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(row - 8, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}