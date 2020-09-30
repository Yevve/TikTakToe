import javax.swing.JButton;

public class RuleEngine {
public Controller controller;
public RuleEngine(Controller _controller){
    this.controller=_controller;
    
	
}
static boolean gameover = false;
    
	public boolean checkifP1win() {
        
        
		JButton checkWin[][]= controller.view.buttons;
		boolean win = false;
		if(checkWin[0][0].getText() == "O" && checkWin[0][1].getText() == "O" && checkWin[0][2].getText() == "O")
			win = true;
		if(checkWin[1][0].getText() == "O" && checkWin[1][1].getText() == "O" && checkWin[1][2].getText() == "O")
			win = true;
		if(checkWin[2][0].getText() == "O" && checkWin[2][1].getText() == "O" && checkWin[2][2].getText() == "O")
			win = true;

		if(checkWin[0][0].getText() == "O" && checkWin[1][0].getText() == "O" && checkWin[2][0].getText() == "O")
			win = true;
		if(checkWin[0][1].getText() == "O" && checkWin[1][1].getText() == "O" && checkWin[2][1].getText() == "O")
			win = true;
		if(checkWin[0][2].getText() == "O" && checkWin[1][2].getText() == "O" && checkWin[2][2].getText() == "O")
			win = true;

		if(checkWin[0][0].getText() == "O" && checkWin[1][1].getText() == "O" && checkWin[2][2].getText() == "O")
			win = true;
		if(checkWin[0][2].getText() == "O" && checkWin[1][1].getText() == "O" && checkWin[2][0].getText() == "O")
			win = true;
		
		return win;
	}

	public boolean checkifP2win() {
		JButton checkWin[][]= controller.view.buttons;
		boolean win = false;
		
		if(checkWin[0][0].getText() == "X" && checkWin[0][1].getText() == "X" && checkWin[0][2].getText() == "X")
			win = true;
		if(checkWin[1][0].getText() == "X" && checkWin[1][1].getText() == "X" && checkWin[1][2].getText() == "X")
			win = true;
		if(checkWin[2][0].getText() == "X" && checkWin[2][1].getText() == "X" && checkWin[2][2].getText() == "X")
			win = true;

		if(checkWin[0][0].getText() == "X" && checkWin[1][0].getText() == "X" && checkWin[2][0].getText() == "X")
			win = true;
		if(checkWin[0][1].getText() == "X" && checkWin[1][1].getText() == "X" && checkWin[2][1].getText() == "X")
			win = true;
		if(checkWin[0][2].getText() == "X" && checkWin[1][2].getText() == "X" && checkWin[2][2].getText() == "X")
			win = true;

		if(checkWin[0][0].getText() == "X" && checkWin[1][1].getText() == "X" && checkWin[2][2].getText() == "X")
			win = true;
		if(checkWin[0][2].getText() == "X" && checkWin[1][1].getText() == "X" && checkWin[2][0].getText() == "X")
			win = true;
		
		return win;	
	}
}
