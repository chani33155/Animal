package Animal;

public class Cat extends Animal implements Land {

    //Fields
    private final int numberOfLegs;

    //Constructor
    public Cat(Mood mood) {
        super(true, true, mood);
        this.numberOfLegs = 4;
    }


    //Implements the interface
    public int getNumberOfLegs() { return numberOfLegs; }

    //Functions
    public void myMood() {
        if (Mood.HAPPY.equals(getMood())) {
            System.out.println("purr,purr");
        } else if (Mood.SCARE.equals(getMood())) {
            System.out.println("hiss");
        }
        // edge case scenario
        else {
            System.out.println("meow");
        }    }

    public void sayHello() {
        System.out.println("meow");
    }

}
