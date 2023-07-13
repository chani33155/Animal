package Animal;

public class Dog extends Animal implements Land {

    //Fields
    private final int numberOfLegs;

    //Constructor
    public Dog(Mood mood) {
        super(true, true, mood);
        this.numberOfLegs = 4;
    }

    //implements the interface
    public int getNumberOfLegs() { return numberOfLegs; }

    //Function
    public void myMood() {
        if (Mood.HAPPY.equals(getMood())) {
            System.out.println("woof,woof");
        } else if (Mood.SCARE.equals(getMood())) {
            System.out.println("whooping");
        }
        // edge case scenario
        else {
            System.out.println("wagging tail");
        }
    }
    public void sayHello() {
        System.out.println("wagging tail");
    }



}
