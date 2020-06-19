
public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {   
        if(this.tacos > 0) {
            this.tacos -= 1;
        }
    }
}
