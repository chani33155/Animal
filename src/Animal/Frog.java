package Animal;

public class Frog extends Animal implements Land, Water {

    //Fields
    private final int numberOfLegs;
    private Boolean onLand;


    //Constructor
    public Frog(Mood mood, Boolean onLand) {
        super(false, false, mood);
        this.onLand = onLand;
        this.numberOfLegs = 4;
    }

    //Getters & Setters
    public Boolean getOnLand() {
        return this.onLand;
    }
    public void setOnLand(Boolean onLand) {
        this.onLand = onLand;
    }


    //Functions
    public void myMood() {
        if (Mood.HAPPY.equals(getMood())) {
            System.out.println("quack quack quack");
            onLand = true;
        } else if (Mood.SCARE.equals(getMood())) {
            System.out.println("plop into the water");
            onLand = false;
        }
        // edge case scenario
        else {
            System.out.println("quack quack quack");
        }
    }

    public void sayHello() {
        //frog say hello only on the land
        if (onLand) {
            System.out.println("quack quack quack");
        }
    }


    //implements the interfaces

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public Boolean HasGills() {
        // frogs have gills and as they grow - they stop using them.
        // can ask frog's age and answer accordingly
        return true;
    }

    public Boolean HasLaysEggs() {
        // only females lay eggs
        // can ask on type
        return true;
    }
}