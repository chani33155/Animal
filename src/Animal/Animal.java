package Animal;

public abstract class Animal {

    //Fields
    private Boolean mammalian;
    private Boolean carnivorous;
    private Mood mood;

    //Constructor
    public Animal(Boolean mammalian, Boolean carnivorous, Mood mood) {
        this.mammalian = mammalian;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    //Function
    public void sayHello() {}
    public void myMood() {}

    //Getters & Setters
    public Boolean isMammalian() {
        return mammalian;
    }

    public void setMammalian(Boolean mammalian) {this.mammalian = mammalian;}

    public Boolean isCarnivorous() {return carnivorous;}

    public void setCarnivorous(Boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {this.mood = mood;}

}
