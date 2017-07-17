/**
 * Created by jenny on 7/17/2017.
 */
//Implement each one of the classes you see in the UML
public abstract class GameCharacter {

    private String name;
    private String strength;
    private int intelligence;

    //Code the setters, getters, and constructors
    public GameCharacter() {
    }

    public GameCharacter(String name, String strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Add a method "Play" at GameCharacter class that prints the Name of the Character, strength, and intelligence
    public abstract void play();

    @Override
    public String toString(){
        return String.format("%-5s%-18s%-10s%-22s%-10s%-5d","Name: ", name, "Strength: ", strength, "Intelligence: ", intelligence);
    }

}
