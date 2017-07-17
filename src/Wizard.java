/**
 * Created by jenny on 7/17/2017.
 */
//Implement each one of the classes you see in the UML
public class Wizard extends MagicUsingCharacter {

    private int spellNumber;

    //Code the setters, getters, and constructors
    public Wizard() {
    }

    public Wizard(String name, String strength, int intelligence) {
        super(name, strength, intelligence);
    }

    public Wizard(String name, String strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    //Override "Play" method at Warrior, MagicUsingCharacter, and Wizard classes
    //Would have returned the String to print in Main, but directions said, "Each method should print all the properties of that class (including inherited ones)"
    @Override
    public void play() {
        System.out.println(super.toString() + String.format("%-15s%-15d", "Spell Number: ", spellNumber));
    }

}