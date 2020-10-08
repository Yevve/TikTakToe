import java.lang.reflect.Array;

public class Player {
Move move;
Controller controller;
RuleEngine ruleEngine;
public int playerID=1;


public Player(Controller _controller,int playerID ){
this.playerID=playerID;
this.controller=_controller;
this.move=new Move(controller);

}

public void moveMade(int _r,int _c,int playersTurn){
    move.moveMake(_r, _c,playersTurn);

}

}
