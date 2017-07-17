/**
 * Created by jenny on 7/17/2017.
 */
//Implement each one of the classes you see in the UML
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;

    //Code the setters, getters, and constructors
    public MagicUsingCharacter() {
    }

    public MagicUsingCharacter(String name, String strength, int intelligence) {
        super(name, strength, intelligence);
    }

    public MagicUsingCharacter(String name, String strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-18s%-5d", "Magical Energy: ", magicalEnergy);
    }

    //Override "Play" method at Warrior, MagicUsingCharacter, and Wizard classes
    //Would have returned the String to print in Main, but directions said, "Each method should print all the properties of that class (including inherited ones)"
    @Override
    public void play() {
        System.out.println(super.toString() + String.format("%-15s%-15d", "Magical Energy: ", magicalEnergy));
    }
}