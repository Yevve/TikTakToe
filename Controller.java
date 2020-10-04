public class Controller {
    public View view;
    public Player player;
    public View view1;
    boolean yes= true;
    public enum checkValue{
        blanc,
        X,
        O
        }
    public checkValue[][] gridValue;
    public Controller(){
        this.view=new View(this);
        this.player =new Player(this);
        
        if(yes==true){
            this.view1=new View(this);
        }
        gridValue= new checkValue[12][12];
        
    }
    
    public void unitClicked(int _r,int _c){
    
    player.moveMade(_r, _c);
    
    }
}
