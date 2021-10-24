package game.files;

public class Board {
	
	private int columns;
	private int rows;
	private int[] state;
	
	Board(int columns, int rows){
		this.setColumns(columns);
		this.setRows(rows);
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

}
