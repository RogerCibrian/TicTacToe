package game.files;

public class TicTacToe {

	public static void main(String[] args) {
		
		Player X = new Player("X");
		Player O = new Player("O");
		Board ticTacToeBoard = new Board(3,3);
		
		System.out.println(ticTacToeBoard.getColumns());
		System.out.println(ticTacToeBoard.getRows());
		
		System.out.println(X.getPlayerName());
		System.out.println(O.getPlayerName());
		

	}

}
