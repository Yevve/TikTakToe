public class Controller {
    public View view;
    public Player player;
    
    
    
    public Controller(){
        this.view=new View(this);
        this.player =new Player(this);
        
    }
    
    public void unitClicked(int _r,int _c){
    System.out.println(""+_r+_c);
    player.moveMade(_r, _c);
    }
}
