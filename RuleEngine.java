import javax.swing.JButton;


public class RuleEngine {
public Controller controller;
public RuleEngine(Controller _controller){
    this.controller=_controller;
    
	
}
static int winCondition = 3;
private int count=0;



	public boolean checkifP1win(int _r, int _c) {
	JButton buttons[][]=controller.view.buttons;
	
	for(int i=1;i<winCondition;i++){
			if(_c+i >=0 && _c+i<buttons.length){
				if(controller.gridValue[_r][_c+i]== Controller.checkValue.O){
					count+=1;
				}
			}
			if(_c-i>0 && _c-i<buttons.length){
				if(controller.gridValue[_r][_c-i]== Controller.checkValue.O){
					count+=1;
				}
			}
		}
		if(count>=winCondition){
			return true;
		}
		count=1;
		
		for(int i=1;i<winCondition;i++){
			if(_r+i >=0 && _r+i<buttons.length){
				if(controller.gridValue[_r+i][_c]== Controller.checkValue.O){
					count+=1;
				}
			}
			if(_r-i>0 && _r-i<buttons.length){
				if(controller.gridValue[_r-i][_c]== Controller.checkValue.O){
					count+=1;
				}
			}
		}
		if(count>=winCondition){
			return true;
		}
		count=1;	
		
		for(int i=1;i<winCondition;i++){
			if(_r-i >=0 && _c-i>=0 && _r-i + _c-i<buttons.length){
				if(controller.gridValue[_r-i][_c-i]== Controller.checkValue.O){
					count+=1;
				}
			}
			if(_r+i >=0 && _c+i>=0 && _r+i + _c+i<buttons.length){
				if(controller.gridValue[_r+i][_c+i]== Controller.checkValue.O){
					count+=1;
				}
			}
			if(_r-i >=0 && _c+i>=0 && _r-i + _c+i<buttons.length){
				if(controller.gridValue[_r-i][_c+i]== Controller.checkValue.O){
					count+=1;
				}
			}
			if(_r+i >=0 && _c-i>=0 && _r+i + _c-i<buttons.length){
				if(controller.gridValue[_r+i][_c-i]== Controller.checkValue.O){
					count+=1;
				}
			}
		}
		if(count==winCondition){
			return true;
		}
		count=1;

		
		return false;
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
