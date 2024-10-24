package L12Activity;

public class Swordsman extends DnDCharacter {

	// Task 4: Swordsman subclass
	Swordsman(String characterName) {
		super(characterName, 100, 25);
	}

	@Override
	public void attack(DnDCharacter opponent) {
		System.out.println(characterName +" slashed " + opponent.characterName);
		opponent.receiveDamage(damage);
	}

	@Override
	public void receiveDamage(int damage) {
		health -= damage;
	}
}
