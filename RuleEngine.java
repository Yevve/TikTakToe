import javax.swing.JButton;

public class RuleEngine {
public Controller controller;
private int players=3;
//private Controller.checkValue[] tokens=Controller.checkValue.values();
public char[] playerToken=new char[players];
public RuleEngine(Controller _controller){
	this.controller=_controller;
	for(int i=0;i<players;i++){
		playerToken[i]=(char)(65+i);
	}
	
}
private int winCondition = 5;
private int count=0;


public boolean checkIfWin(int _r, int _c) {
	JButton buttons[][]=controller.view.buttons;
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
			if(_r-i >=0 && _c-i>=0 && _r-i + _c-i<buttons.length){
				if(buttons[_r-i][_c-i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r+i >=0 && _c+i>=0 && _r+i + _c+i<buttons.length){
				if(buttons[_r+i][_c+i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r-i >=0 && _c+i>=0 && _r-i + _c+i<buttons.length){
				if(buttons[_r-i][_c+i].getText()== buttonText){
					count+=1;
				}
			}
			if(_r+i >=0 && _c-i>=0 && _r+i + _c-i<buttons.length){
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
