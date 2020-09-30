import javax.swing.JButton;

public class Move {
public Controller controller;
public View view;
public Player player.

public Move(Controller _controller){

}
public void moveMake(int _r,int _c){

JButton button = controller.view.buttons[_r][_c];
char moves[][]=new char[_r][_c];
if(button.getText() != " ") return;
if(player== 0) {
    button.setText("O");
    moves[_r][_c] = 'O';
    player=1;
       return;
    

}
    

else {
    button.setText("X");
    moves[_r][_c] = 'X';
    player =0;
    
   
}
}
}
