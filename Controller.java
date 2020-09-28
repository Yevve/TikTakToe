public class Controller {
    public View view;
    public void Controller(){
        this.view=new View(this);
        
    }
    public void unitClicked(int _r,int _c){
    System.out.println("Pressed ");
    }
    
}
