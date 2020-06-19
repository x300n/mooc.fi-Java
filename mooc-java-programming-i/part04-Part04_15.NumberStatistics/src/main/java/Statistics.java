public class Statistics {
    private int count;
    private int sum;
    

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
        
    }

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.count += 1;
    }
    
    public int sum(){
        
        return sum;
    }
    
    public double average(){
        if(this.count != 0){
            return 1.0 * sum / count;
        }
       
       return 0;
    }
    

    public int getCount() {
        // write code here
        
        return this.count;
    }
}