package L12Activity;

public abstract class DnDCharacter {
	
	// Task 1: Added fields and constructors
	public String characterName;
	public int health;
	public int damage;
	
	DnDCharacter(String characterName, int health, int damage) {
		this.characterName = characterName;
		this.health = health;
		this.damage = damage;
	}
	
	// Task 2: Created abstract functions
	public abstract void attack(DnDCharacter opponent);
	public abstract void receiveDamage(int damage);
	
	// Task 3: Created toString and isAlive functions	
	public String toString(String name) {
		return String.format("%s 's Profile:"
				+ "\nName: %-10s Health: %-10d Damage:%-10d", name, characterName, health, damage);
	}
	
	public boolean isAlive() {
		return (health > 0) ? true : false;
	}

}
