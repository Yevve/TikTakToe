import javax.swing.JButton;


public class RuleEngine {
public Controller controller;
public RuleEngine(Controller _controller){
    this.controller=_controller;
    
	
}
static int winCondition = 3;

public boolean checkHoriMid(int _r,int _c){
	
	if(controller.gridValue[_r][_c-1]== Controller.checkValue.O && controller.gridValue[_r][_c+1]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkHoriLeft(int _r, int _c){
	if(controller.gridValue[_r][_c-1]== Controller.checkValue.O && controller.gridValue[_r][_c-1]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkHoriRight(int _r,int _c){
	if(controller.gridValue[_r][_c+2]== Controller.checkValue.O && controller.gridValue[_r][_c+1]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}

public boolean checkVertMid(int _r,int _c){
	if(controller.gridValue[_r-1][_c]== Controller.checkValue.O && controller.gridValue[_r+1][_c]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkVertiDown(int _r, int _c){
	if(controller.gridValue[_r-2][_c]== Controller.checkValue.O && controller.gridValue[_r-1][_c]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkVertiUp(int _r, int _c){
	if(controller.gridValue[_r+2][_c]== Controller.checkValue.O && controller.gridValue[_r+1][_c]== Controller.checkValue.O){
		return true;
	}
	else{
		return false;
	}
}
public boolean checkDiagMidOne(int _r,int _c){
	if (controller.gridValue[_r-1][_c-1]== Controller.checkValue.O && controller.gridValue[_r+1][_c+1]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkDiagMidTwo(int _r,int _c){
	if (controller.gridValue[_r-1][_c+1]== Controller.checkValue.O && controller.gridValue[_r+1][_c-1]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}

public boolean checkDiagUpLeft(int _r,int _c){
	if (controller.gridValue[_r-1][_c-1]== Controller.checkValue.O && controller.gridValue[_r-2][_c-2]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkDiagDownRight(int _r,int _c){
	if (controller.gridValue[_r+1][_c+1]== Controller.checkValue.O && controller.gridValue[_r+2][_c+2]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkDiagUpRight(int _r,int _c){
	if (controller.gridValue[_r-1][_c+1]== Controller.checkValue.O && controller.gridValue[_r-2][_c+2]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}
public boolean checkDiagDownLeft(int _r,int _c){
	if (controller.gridValue[_r+1][_c-1]== Controller.checkValue.O && controller.gridValue[_r+2][_c-2]== Controller.checkValue.O){
		return true;
	}
	else {
		return false;
	}
}

    
	public boolean checkifP1win(int _r, int _c) {
		
		
		
		
		if((_r>=0 && _r<=controller.view.rows)&& (_c>=0 && _c<=controller.view.cols)){
			
		    if(checkVertiUp(_r, _c)){
				System.out.println("ver");
				return true;
			}
	    	
		
		}
		
		if((_r>=0 && _r<=controller.view.rows) && (_c>=0 && _c+2!=controller.view.cols && _c+1!=controller.view.cols )){
			if(checkHoriRight(_r, _c)){
				System.out.println("hor");
				return true;
			}
		}
		
		/*
		if(_r==controller.view.rows && _c==controller.view.cols){
		
			if(checkHoriLeft(_r, _c)){
				return true;
			}
			if(checkVertiDown(_r, _c)){
				return true;
			}
			if(checkDiagDownLeft(_r, _c)){
				return true;
			}
			if(checkDiagUpRight(_r, _c)){
				System.out.println("dig up right");
				return true;
			}	
		}
		
		

		if((_r==0 && _c==0 ) && (_r==controller.view.rows && _c==controller.view.cols)){
			System.out.println("mid");
			if(checkHoriRight(_r, _c)){
				return true;
			}
		    if(checkVertiUp(_r, _c)){
				return true;
			}
	    	if(checkDiagUpRight(_r, _c)){
				return true;
			}
			if(checkHoriLeft(_r, _c)){
				return true;
			}
			if(checkVertiDown(_r, _c)){
				return true;
			}
			if(checkDiagDownLeft(_r, _c)){
				return true;
			}	
		    if(checkHoriMid(_r, _c)){
				return true;
			}
			if(checkVertMid(_r, _c)){
				return true;
			}
	    	if(checkDiagMidOne(_r, _c)){
				return true;
			}
			if(checkDiagDownRight(_r, _c)){
				return true;
			}
			if(checkDiagUpLeft(_r, _c)){
				return true;
			}
		}
		*/
		
		return false;

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
