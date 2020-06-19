
public class Timer {
    
    private ClockHand hseconds;
    private ClockHand seconds;
    
    public Timer(){
        
        this.hseconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
        
    }
    
    public void advance(){
        
       this.hseconds.advance();
       
       if(this.hseconds.value() == 0){
           this.seconds.advance();
       }
        
    }
    
    public String toString(){
        
        return seconds + ":" + hseconds;
    }
    
}
