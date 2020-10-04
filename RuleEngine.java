import javax.swing.JButton;


public class RuleEngine {
public Controller controller;
public RuleEngine(Controller _controller){
    this.controller=_controller;
    
	
}
static boolean gameover = false;
    
	public boolean checkifP1win(int _r, int _c) {
		boolean win = false;
		
		if(controller.gridValue[_r-1][_c]== Controller.checkValue.O && controller.gridValue[_r+1][_c]== Controller.checkValue.O){
			win=true;
		}
		else if(controller.gridValue[_r-2][_c]== Controller.checkValue.O && controller.gridValue[_r-1][_c]== Controller.checkValue.O){
			win=true;
		}
		else if(controller.gridValue[_r+2][_c]== Controller.checkValue.O && controller.gridValue[_r+1][_c]== Controller.checkValue.O){
			win=true;
		}
		if(controller.gridValue[_r][_c-1]== Controller.checkValue.O && controller.gridValue[_r][_c+1]== Controller.checkValue.O){
			win=true;
		}
		else if(controller.gridValue[_r][_c-2]== Controller.checkValue.O && controller.gridValue[_r][_c-1]== Controller.checkValue.O){
			win=true;
		}
		else if(controller.gridValue[_r][_c+2]== Controller.checkValue.O && controller.gridValue[_r][_c+1]== Controller.checkValue.O){
			win=true;
		}
		
		
		
		
		return win;

	}
		/*for(int i=0;i<controller.view.rows;i+=1){
			for(int j=0;j<controller.view.cols;j+=1){
				//check corner 1
				if(checkWin[i][j].getText()=="O" && checkWin[i+1][j].getText()=="O"&& checkWin[i+2][j].getText()=="O"){
					win=true;
				}
				if(checkWin[i][j].getText()=="O" && checkWin[i][j+1].getText()=="O"&& checkWin[i][j+2].getText()=="O"){
					win=true;
				}
				if(checkWin[i][j].getText()=="O" && checkWin[i+1][j+1].getText()=="O"&& checkWin[i+2][j+2].getText()=="O"){
					win=true;
				}
				//check corner 2
				if(checkWin[i][j].getText()=="O" && checkWin[i-1][j].getText()=="O"&& checkWin[i-2][j].getText()=="O"){
					win=true;
				}
				if(checkWin[i][j].getText()=="O" && checkWin[i][j-1].getText()=="O"&& checkWin[i][j-2].getText()=="O"){
					win=true;
				}
				if(checkWin[i][j].getText()=="O" && checkWin[i-1][j-1].getText()=="O"&& checkWin[i-2][j-2].getText()=="O"){
					win=true;
				}
				
				
			
			}

		}
		return win;



*/
/*
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
		*/
	

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
