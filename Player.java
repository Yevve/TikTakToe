public class Player {
Move move;
Controller controller;
public int playerID;

public Player(Controller _controller,int playerID){
this.playerID= playerID;
this.controller=_controller;
this.move=new Move(controller);

}

public void moveMade(int _r,int _c, int playersTurn){
    move.moveMake(_r, _c,playersTurn);

}


}
