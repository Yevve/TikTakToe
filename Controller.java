public class Controller {
    public View view;
    public Player player;
    public View view1;
    boolean yes= false;
    
    public Controller(){
        this.view=new View(this);
        this.player =new Player(this);
        
        if(yes==true){
            this.view1=new View(this);
        }
        
        
    }
    
    public void unitClicked(int _r,int _c){
    
    player.moveMade(_r, _c);
    
    }
}
