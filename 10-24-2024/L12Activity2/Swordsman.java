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

	@Override
	public void restoreHealth(int restore) {
		health += restore;
		System.out.println(characterName + " restored health: " + health);
	}

	@Override
	public void buffAbility(int buff) {
		damage += buff;
		System.out.println(characterName + " buff damage: " + damage);
	}
}
