package game.files;

public class Board {
	
	private int columns;
	private int rows;
	private int[] state;
	
	
	Board(int columns, int rows){
		this.columns=columns;
		this.rows=rows;
	}
	
	void setInitialState()
	{
		state = new int[columns * rows];
		for(int i=0; i < state.length; i++)
		{
			state[i]=0;
			System.out.println(state[i]);
		}
	}
	

}
