/**
 * Created by jenny on 7/17/2017.
 */
//Implement each one of the classes you see in the UML
public class Warrior extends GameCharacter {

    private String weaponType;

    //Code the setters, getters, and constructors
    public Warrior() {}

    public Warrior(String name, String strength, int intelligence) {
        super(name, strength, intelligence);
    }

    public Warrior(String name, String strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    //Override "Play" method at Warrior, MagicUsingCharacter, and Wizard classes
    //Would have returned the String to print in Main, but directions said, "Each method should print all the properties of that class (including inherited ones)"
    @Override
    public void play() {
        System.out.println(super.toString() + String.format("%-18s%-15s", "Weapon Type: ", weaponType));
    }

}