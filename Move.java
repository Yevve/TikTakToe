import javax.swing.JButton;

public class Move {
public Player player;
public Controller controller;

public Move(){
this.player=new Player(this);
}
public void moveMake(int _r,int _c){
JButton button = controller.view.buttons[_r][_c];
if(button.getText() != " " || gameover) return;
    if(player == 0) {
        button.setText("O");
        if(checkifP1win()) {
            myLabel.setText("player 1 won!");
            gameover = true;
            return;
    }
    player = 1;
    myLabel.setText("player 2's turn");
}
else {
        button.setText("X");
        board[0][0] = 'X';
        if(checkifP2win()) {
            myLabel.setText("player 2 won!");
            gameover = true;
            return;
    }
    player = 0;
    myLabel.setText("player 1's turn");
    }
}
}
