import javax.swing.JButton;

public class Move {
public Controller controller;
static boolean gameover=false;


public Move(Controller _controller){
this.controller=_controller;
}

public void moveMake(int _r,int _c){

JButton button = controller.view.buttons[_r][_c];
//char moves[][]=new char[_r][_c];
System.out.println("player.player"+Player.player);
if(button.getText() != " " || gameover) return;
System.out.println("player1player"+Player.player);
if(Player.player== 0) {
    System.out.println("player0");
    button.setText("O");
    //moves[_r][_c] = 'O';
   
    Player.player=1;
    controller.view.myLabel.setText("Player 1's trun");
    

}
    

else {
    button.setText("X");
    //moves[_r][_c] = 'X';
  
    Player.player =0;
    controller.view.myLabel.setText("Player 2's trun");
   
}
}
}
