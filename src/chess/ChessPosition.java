package chess;

import boardgame.Position;

public class ChessPosition {

	private int row;
	private int column;
	
	public ChessPosition(char column, int row) {
		if ( column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro instancing ChessPosition. Valid values are from a1 to h8!");
		}
		this.column = column;
		this.row = row;
	}

	public int getRow() {
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