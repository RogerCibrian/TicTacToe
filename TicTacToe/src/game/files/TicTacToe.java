package game.files;

public class TicTacToe {

	public static void main(String[] args) {
		
		Player Roger = new Player("Roger", "X");
		Player Anthony = new Player("Anthony", "O");
		Board ticTacToeBoard = new Board(3,3);
		
		//System.out.println(ticTacToeBoard.getColumns());
		//System.out.println(ticTacToeBoard.getRows());
		
		//System.out.println(Roger.getPlayerName());
		//System.out.println(Anthony.getPlayerName());
		
		ticTacToeBoard.checkWin();
		

	}

}
