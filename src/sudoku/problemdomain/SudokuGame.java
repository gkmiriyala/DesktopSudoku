package sudoku.problemdomain;

public class SudokuGame {
	
	private final GameState gameState;
	private final int[][] gridState;
	
	public static final GRID_BOUNDARY = 9;
	
	public SudokuGame(GameState gameState, int[][] gridState) {
		this.gameState = gameState;
		this.gridState = gridState;
	}
}
