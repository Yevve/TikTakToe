public class Controller {
    public View view;
    public Player player;
    public View view1;
    boolean yes= false;
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
        gridValue= new checkValue[view.rows][view.cols];
        
    }
    
    public void unitClicked(int _r,int _c){
    
    player.moveMade(_r, _c);
    
    }
}
