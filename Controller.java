public class Controller {
    public View view;
    public Player player;
    public Move move;
    int players=0;
    
    public Controller(){
        this.view=new View(this);

        
    }
    public void unitClicked(int _r,int _c){
    System.out.println(""+_r+_c);
    if(players==0){
    view.buttons[_r][_c].setText("0");
    }
    else{view.buttons[_r][_c].setText("X");}
    
    }
    
}
