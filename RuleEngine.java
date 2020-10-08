import javax.swing.JButton;

public class RuleEngine {
public Controller controller;

public int players=3;
private int winCondition = 3;

private int count=0;
public int playersTurn;
//private Controller.checkValue[] tokens=Controller.checkValue.values();
public char[] playerToken=new char[players];

public RuleEngine(Controller _controller){
	this.controller=_controller;
	for(int i=0;i<players;i++){
		playerToken[i]=(char)(65+i);
		
	}
	
	
}
public char getPlayerToken(int playerID) {
	return playerToken[playerID];
}
public int playerAmount(){
	return players;
}
public int getPlayersTurn(){
	return playersTurn;
}
public int nextPTurn(){
	playersTurn = playersTurn + 1 % players;
	return playersTurn;
}
public boolean checkIfWin(int _r, int _c) {
	JButton buttons[][]=controller.view[0].buttons;
	String buttonText=buttons[_r][_c].getText();
	for(int i=1;i<winCondition;i++){
			if(_c+i >=0 && _c+i<buttons.length){
				if(buttons[_r][_c+i].getText() == buttonText){
					count+=1;
				}
			}
			if(_c-i>0 && _c-i<buttons.length){
				if(buttons[_r][_c-i].getText()== buttonText){
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
				if(buttons[_r+i][_c].getText()== buttonText){
					count+=1;
				}
			}
			if(_r-i>0 && _r-i<buttons.length){
				if(buttons[_r-i][_c].getText()== buttonText){
					count+=1;
				}
			}
		}
		if(count>=winCondition){
			return true;
		}
		count=1;	
		
		for(int i=1;i<winCondition;i++){
			if(_r-i >=0 && _c-i>=0 && _r-i<buttons.length && _c-i<buttons.length){
				if(buttons[_r-i][_c-i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r+i >=0 && _c+i>=0 && _r+i<buttons.length && _c+i<buttons.length){
				if(buttons[_r+i][_c+i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r-i >=0 && _c+i>=0 && _r-i<buttons.length && _c+i<buttons.length){
				if(buttons[_r-i][_c+i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r+i >=0 && _c-i>=0 && _r+i<buttons.length && _c-i<buttons.length){
				if(buttons[_r+i][_c-i].getText()== buttonText){
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
	/*public boolean checkIf1Win(int _r, int _c) {
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
	*/

}
