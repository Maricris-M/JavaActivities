package L12Activity;

public class Catalyst extends DnDCharacter {
	
	// Task 4: Catalyst subclass
	Catalyst(String characterName) {
		super(characterName, 100, 15);
	}

	@Override
	public void attack(DnDCharacter opponent) {
		System.out.println(characterName +" tightly binded " + opponent.characterName);
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
		health += buff;
		System.out.println(characterName + " buff damage: " + health);
	}
}
