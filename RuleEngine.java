public class RuleEngine {
static public View view;
public Move move;
public RuleEngine(View _view){
    this.view= _view;
        
	
}
static boolean gameover = false;
    char checkWin = move.moves[][];
	public static boolean checkifP1win() {
        boolean win = false;
        
		
		
		if([0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
			win = true;
		if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
			win = true;
		if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
			win = true;
		if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
			win = true;
		
		return win;
	}

	public static boolean checkifP2win() {
		boolean win = false;
		
		if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
			win = true;
		if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
			win = true;
		if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
			win = true;
		if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
			win = true;
		
		return win;	
	}
}
