package L12Activity;

public class Mariano_L12Activity1 {

	public static void main(String[] args) {
		DnDCharacter swordsman = new Swordsman("Diluc"); // name characters
		DnDCharacter catalyst = new Catalyst("Klee"); // name characters
		DnDCharacter archer = new Archer("Amber"); // name characters
		
		System.out.println(swordsman.toString("Swordsman"));
		System.out.println("\n" + catalyst.toString("Catalyst"));
		System.out.println("\n" + archer.toString("Archer"));
		
		battleCharacters(archer, catalyst); // change characters to play
	}
	
	public static void battleCharacters(DnDCharacter char1, DnDCharacter char2) {
		System.out.println("\n" + char1.characterName + " health: " + char1.health);
		System.out.println(char2.characterName + " health: " + char2.health);
		
		while(char1.isAlive() && char2.isAlive()) {
			char1.attack(char2);
			
			if(char2.isAlive()) {
				char2.attack(char1);
			}
			System.out.println("\n" + char1.characterName + " health: " + char1.health);
			System.out.println(char2.characterName + " health: " + char2.health);
		}
		
		if(char1.isAlive()) {
			System.out.println("\n" + char1.characterName + " wins the game!");
		} else {
			System.out.println("\n" + char2.characterName + " wins the game!");
		}
	}

}
