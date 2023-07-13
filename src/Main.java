import Animal.Frog;
import Animal.Mood;
import Animal.Animal;
import Animal.Dog;
import Animal.Cat;


public class Main {
    public static void main(String[] args) {

        Animal frog = new Frog(Mood.HAPPY, true);
        Animal cat = new Cat(Mood.HAPPY);
        Animal dog = new Dog(Mood.HAPPY);
        System.out.println ("Is a frog Carnivorous? " +((Frog)frog).isCarnivorous()+ ", is it Mammalian? "+((Frog)frog).isMammalian());
        System.out.println ("Is a cat Carnivorous? " +((Cat)cat).isCarnivorous()+ ", is it Mammalian? "+((Cat)cat).isMammalian());
        System.out.println ("Is a dog Carnivorous? " +((Dog)dog).isCarnivorous()+ ", is it Mammalian? "+((Dog)dog).isMammalian());
        System.out.print("When my dog is happy it does ");
        ((Dog)dog).myMood();
        System.out.print("When my dog is frightened it does ");
        ((Dog)dog).setMood(Mood.SCARE);
        ((Dog)dog).myMood();
        System.out.print("My dog greets people by ");
        ((Dog)dog).sayHello();
        System.out.print("When my cat is happy it does ");
        ((Cat)cat).myMood();
        System.out.print("When my cat is frightened it does ");
        ((Cat)cat).setMood(Mood.SCARE);
        ((Cat)cat).myMood();
        System.out.print("My cat greets people by ");
        ((Cat)cat).sayHello();
        System.out.println("Was my frog on land? " + ((Frog)frog).getOnLand());
        System.out.print("When my frog is happy it does ");
        ((Frog)frog).myMood();
        System.out.println("Is my frog still on land? " + ((Frog)frog).getOnLand());
        System.out.print("When my frog is frightened it does ");
        ((Frog)frog).setMood(Mood.SCARE);
        ((Frog)frog).myMood();
        System.out.println("Is my frog still on land? " + ((Frog)frog).getOnLand());
    }
}