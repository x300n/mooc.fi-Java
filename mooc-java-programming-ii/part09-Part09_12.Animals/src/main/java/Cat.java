public class Cat extends Animal implements NoiseCapable {

    public Cat(String newName) {
        super(newName);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }

}