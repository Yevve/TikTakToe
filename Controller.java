public class Controller {
    public View[] view;
    public RuleEngine ruleEngine;
    public Player[] player=new Player[1];
    public int windowAmount=1;
    public boolean multGUI=false;
  

    public Controller(){
        this.ruleEngine=new RuleEngine(this);
        if(multGUI){
            windowAmount=ruleEngine.playerAmount();
        for(int i=0;i<windowAmount;i++){
        this.player[i] =new Player(this,i);
        this.view[i]=new View(this,player[i]);     
    } 
    }  
    else{
        view=new View[1];
        this.view[0]=new View(this, player[0]);
        this.player[0]=new Player(this,0);
    }
        
    }
    public void changeText(int _r,int _c, char player){
        for(int i=0;i<windowAmount;i++){
            view[i].buttons[_r][_c].setText(Character.toString(player));
        }

    }
    public void unitClicked(int _r,int _c, int playersTurn){
    
    player[ruleEngine.getPlayersTurn()].moveMade(_r,_c,playersTurn);
    
    }
}
