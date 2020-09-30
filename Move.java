import javax.swing.JButton;

public class Move {
public Controller controller;
static boolean gameover=false;
public RuleEngine ruleEngine;

public Move(Controller _controller){
this.controller=_controller;
this.ruleEngine=new RuleEngine(_controller);
}

public void moveMake(int _r,int _c){

JButton button = controller.view.buttons[_r][_c];
JButton button1 = controller.view1.buttons[_r][_c];
if(button.getText() != " " || gameover) return;
if(Player.player== 0) {
    button.setText("O");
    button1.setText("O");
   
    
    if(ruleEngine.checkifP1win()) {
        controller.view.myLabel.setText("player 2 won!");
        controller.view1.myLabel.setText("player 2 won!");
        gameover = true;
        return;
    }
    Player.player=1;
    controller.view.myLabel.setText("Player 1's trun");
    controller.view1.myLabel.setText("Player 1's trun");
}
    

else {
    button.setText("X");
    button1.setText("X");
    if(ruleEngine.checkifP2win()) {
        controller.view.myLabel.setText("player 2 won!");
        controller.view1.myLabel.setText("player 2 won!");
        gameover = true;
        return;
    }
    Player.player =0;
    controller.view.myLabel.setText("Player 2's trun");
    controller.view1.myLabel.setText("Player 2's trun");
}
}
}
