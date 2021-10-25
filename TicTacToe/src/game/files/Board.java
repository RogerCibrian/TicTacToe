package game.files;

import java.util.Arrays;

public class Board {
	
	private int columns;
	private int rows;
	private int turnCounter; // use this to optimize checkwin by only checking for win after least possible amount of turns for W (6?)
	private int[] state;


	Board(int columns, int rows){
		this.setColumns(columns);
		this.setRows(rows);
		setState(new int[rows * columns]);
	}
	
	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getTurnCounter() {
		return turnCounter;
	}
	
	public void setTurnCounter(int turnCounter) {
		this.turnCounter = turnCounter;
	}
	
	public int[] getState() {
		return state;
	}
	
	public void setState(int[] state) {
		this.state = state;
	}

	public void startGame() {
		// open JFrame stuff here


	}
	
	public void checkWin() {

		resetGame();

		int indexCounter = 0;
		int rowStartIndex = 0;
		int currentColumn = 0;

		state[2] = 0;
		state[5] = 0;
		state[8] = 0;

		for (int currentRow = 0; currentRow < getRows(); currentRow++) {
			// TODO: We can probably use one variable for both rows and columns... save some meMORY
			// check if row we're on is all equal
			if (getState()[rowStartIndex] == getState()[rowStartIndex + 1] && getState()[rowStartIndex + 1] == getState()[rowStartIndex + 2]) {
				System.out.println("Winning horizontal condition detected on row "+ currentRow);
				// break out of loop is condition is met... you can't win twice
				break;
			}
			//System.out.print(currentRow);
			// check if column we're on is all equal
			else if (getState()[currentColumn] == getState()[currentColumn + 3] && getState()[currentColumn + 3] == getState()[currentColumn + 6]) {
				System.out.println("Winning vertical condition detected on column " + currentColumn);
				// break out of loop is condition is met... you can't win twice
				break;
			}
			else {
				System.out.println("The current column is " + currentColumn);
				System.out.println("The current row is " + currentRow);
				currentColumn++;
				// TODO: There is probably a more efficient way to do the below
				for (int indexTracker = 0; indexTracker < getColumns(); indexTracker++) {
					indexCounter++;
				}
				// Store value of beginning of next row in rowStartIndex and use this value to compare next row values for equality
				rowStartIndex = indexCounter;
			}

			// TODO: check if cross condition is detected

		}


		// check if column we just exited is all equal
		//System.out.println();
	}

	
	
	public void resetGame() {
		
		for (int i = 0; i < getState().length; i++) {
			// set value of array to numbers that we don't use to determine winning vs losing conditions
			getState()[i] = i + 2;
		}
	}
	
	public void endGame() {
		// close Jframe stuff here
	}
	
	/* Win Conditions:
	 * 0,1,2
	 * 3,4,5
	 * 6,7,8 -- Horizontal wins
	 * 0,3,6
	 * 1,4,7
	 * 2,5,8 -- Vertical wins
	 * 0,4,8
	 * 2,4,6 -- Cross wins
	 */
	
}
