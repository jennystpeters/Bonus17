import java.util.ArrayList;

/**
 * Created by jenny on 7/17/2017.
 */
//Implement Polymorphism:
public class GameApp {

    private static Validator Validator = new Validator();

    //Included unused constructors, setters, and getters in each class for additional practice
    public static void main(String[] args) {

        //In Main, create an array (used an ArrayList) of type GameCharacter and call it "gameCharacters"
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();

        int numWarriors = 2;
        int numWizards = 3;

        //Then add 2 Warriors and 3 Wizards
        for (int i = 0; i < numWarriors; i++) {
            gameCharacters.add(new Warrior(Validator.validateString("Name: "), Validator.validateString("Strength: "), Validator.validateInt("Intelligence: "), Validator.validateString("Weapon Type: ")));
        }
        for (int j = 0; j < numWizards; j++) {
            gameCharacters.add(new Wizard(Validator.validateString("Name: "), Validator.validateString("Strength: "), Validator.validateInt("Intelligence: "), Validator.validateInt("Magical Energy: "), Validator.validateInt("Spell Number: ")));
        }

        /*gameCharacters.add(new Warrior("Warrior Name 1", "Warrior Strength 1", 1, "Warrior 1 Weapon Type"));
        gameCharacters.add(new Warrior("Warrior Name 2", "Warrior Strength 2", 2, "Warrior 2 Weapon Type"));
        gameCharacters.add(new Wizard("Wizard Name 1", "Wizard Strength 1", 1,2,3));
        gameCharacters.add(new Wizard("Wizard Name 2", "Wizard Strength 2", 4,5,6));
        gameCharacters.add(new Wizard("Wizard Name 3", "Wizard Strength 3", 7,8,9));
*/
        //Do a for loop to invoke the Play method for all the objects in the array
        for (GameCharacter gameCharacter:gameCharacters) {
            gameCharacter.play();
        }

    }

}
