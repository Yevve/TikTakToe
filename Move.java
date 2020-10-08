import javax.swing.JButton;

public class Move {
public Controller controller;
static boolean gameover=false;
public RuleEngine ruleEngine;
private Player player;

public Move(Controller _controller){
this.controller=_controller;
this.ruleEngine=new RuleEngine(_controller);
}

public void moveMake(int _r,int _c,int playersTurn){

JButton button = controller.view[0].buttons[_r][_c];


if(button.getText() != " " || gameover) return;
for(int i=0;i<controller.view.length;i++){
   
    if(ruleEngine.getPlayersTurn()==i){
        System.out.println("Playermvoe");
        button.setText(Character.toString(ruleEngine.getPlayerToken(ruleEngine.playersTurn)));
   }

    

    if(ruleEngine.checkIfWin(_r, _c)){
        
        System.out.println("movecheck");
        controller.view[i].myLabel.setText("Player"+ (ruleEngine.playersTurn)+"won ");
        gameover=true;
        return;
    
        
} 
}
    ruleEngine.nextPTurn();
    for(int i=0;i<controller.view.length;i++){
    
    controller.view[i].myLabel.setText("Player"+(ruleEngine.playersTurn)+"'s turn'");
    System.out.println("next player");
}
   
    
    
    










/*if(Player.player== 0) {
    button.setText("");
    controller.gridValue[_r][_c]= Controller.checkValue.O;
    if(controller.yes==true){
    button1.setText("O");
    }
    
    if(ruleEngine.checkIfWin(_r,_c)) {
        controller.view.myLabel.setText("player 1 won!");
        if(controller.yes==true){ controller.view1.myLabel.setText("player 1 won!");}
        gameover = true;
        return;
    }
    Player.player=1;
    controller.view.myLabel.setText("Player 2's trun");
    if(controller.yes==true){controller.view1.myLabel.setText("Player 2's trun");}
}
    

else {
    button.setText(ruleEngine.token.toString());
    controller.gridValue[_r][_c]= Controller.checkValue.X;
    if(controller.yes==true) {
        button1.setText(ruleEngine.token.toString());
    }
    if(ruleEngine.checkIfWin(_r,_c)) {
        controller.view.myLabel.setText("player 2 won!");
        if(controller.yes==true){controller.view1.myLabel.setText("player 2 won!");}
        gameover = true;
        return;
    }
    Player.player =0;
    controller.view.myLabel.setText("Player 1's trun");
    if(controller.yes==true){ controller.view1.myLabel.setText("Player 1's trun");}
}
*/
}

}
